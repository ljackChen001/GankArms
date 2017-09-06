package com.cbl.gankarms.app;

import android.app.Application;
import android.content.Context;
import android.support.v4.app.FragmentManager;

import com.cbl.gankarms.BuildConfig;
import com.cbl.gankarms.mvp.model.api.Api;
import com.jess.arms.base.delegate.AppLifecycles;
import com.jess.arms.di.module.GlobalConfigModule;
import com.jess.arms.http.RequestInterceptor;
import com.jess.arms.integration.ConfigModule;
import com.readystatesoftware.chuck.ChuckInterceptor;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by chenbaolin on 2017/8/16.
 */

public class GlobalConfiguration implements ConfigModule {
    @Override
    public void applyOptions(Context context, GlobalConfigModule.Builder builder) {
        if (!BuildConfig.LOG_DEBUG) //Release 时,让框架不再打印 Http 请求和响应的信息
            builder.printHttpLogLevel(RequestInterceptor.Level.NONE);

        builder.baseurl(Api.APP_DOMAIN)
                //强烈建议自己自定义图片加载逻辑,因为默认提供的 GlideImageLoaderStrategy 并不能满足复杂的需求
                //请参考 https://github.com/JessYanCoding/MVPArms/wiki#3.4
                // .imageLoaderStrategy(new CustomLoaderStrategy())
                //想支持多 BaseUrl,以及运行时动态切换任意一个 BaseUrl,请使用 https://github.com/JessYanCoding/RetrofitUrlManager
                //如果 BaseUrl 在 App 启动时不能确定,需要请求服务器接口动态获取,请使用以下代码
                //以下代码只是配置,还要使用 Okhttp (AppComponent中提供) 请求服务器获取到正确的 BaseUrl 后赋值给 GlobalConfiguration.sDomain
                //切记整个过程必须在第一次调用 Retrofit 接口之前完成,如果已经调用过 Retrofit 接口,将不能动态切换 BaseUrl
                //                .baseurl(new BaseUrl() {
                //                    @Override
                //                    public HttpUrl url() {
                //                        return HttpUrl.parse(sDomain);
                //                    }
                //                })

                // 这里提供一个全局处理 Http 请求和响应结果的处理类,可以比客户端提前一步拿到服务器返回的结果,可以做一些操作,比如token超时,重新获取
                .globalHttpHandler(new GlobalHttpHandlerImpl(context))
                // 用来处理 RxJava 中发生的所有错误,RxJava 中发生的每个错误都会回调此接口
                // RxJava必要要使用ErrorHandleSubscriber(默认实现Subscriber的onError方法),此监听才生效
                .responseErrorListener(new ResponseErrorListenerImpl())
                .gsonConfiguration((context1, gsonBuilder) -> {
                    //这里可以自己自定义配置Gson的参数
                    gsonBuilder.serializeNulls()//支持序列化null的参数
                            .enableComplexMapKeySerialization();  //支持将序列化key为object的map,默认只能序列化key为string的map
                }).retrofitConfiguration((context1, retrofitBuilder) -> {//这里可以自己自定义配置Retrofit的参数,甚至你可以替换系统配置好的okhttp对象
            // retrofitBuilder.addConverterFactory(FastJsonConverterFactory.create());//比如使用fastjson替代gson
        }).okhttpConfiguration((context1, okhttpBuilder) -> {
            //这里可以自己自定义配置Okhttp的参数
            okhttpBuilder.writeTimeout(10, TimeUnit.SECONDS)
                    .addInterceptor(new ChuckInterceptor(context1));

            //开启使用一行代码监听 Retrofit／Okhttp 上传下载进度监听,以及 Glide 加载进度监听 详细使用方法查看 https://github
            // .com/JessYanCoding/ProgressManager
            //                    ProgressManager.getInstance().with(okhttpBuilder);
        }).rxCacheConfiguration((context1, rxCacheBuilder) -> {
            //这里可以自己自定义配置RxCache的参数
            rxCacheBuilder.useExpiredDataIfLoaderNotAvailable(true);
        });
    }

    @Override
    public void injectAppLifecycle(Context context, List<AppLifecycles> lifecycles) {
        // AppLifecycles 的所有方法都会在基类 Application 的对应的生命周期中被调用,所以在对应的方法中可以扩展一些自己需要的逻辑
        // 可以根据不同的逻辑添加多个实现类
        lifecycles.add(new AppLifecyclesImpl());
    }

    @Override
    public void injectActivityLifecycle(Context context, List<Application.ActivityLifecycleCallbacks> lifecycles) {
        // ActivityLifecycleCallbacks 的所有方法都会在 Activity (包括三方库) 的对应的生命周期中被调用,所以在对应的方法中可以扩展一些自己需要的逻辑
        // 可以根据不同的逻辑添加多个实现类
        lifecycles.add(new ActivityLifecycleCallbacksImpl());
    }

    @Override
    public void injectFragmentLifecycle(Context context, List<FragmentManager.FragmentLifecycleCallbacks> lifecycles) {
        lifecycles.add(new FragmentLifecycleCallbacksImpl());
    }
}
