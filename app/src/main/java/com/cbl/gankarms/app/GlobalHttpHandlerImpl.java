package com.cbl.gankarms.app;

import android.content.Context;

import com.jess.arms.http.GlobalHttpHandler;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by chenbaolin on 2017/9/6.
 */

public class GlobalHttpHandlerImpl implements GlobalHttpHandler {
    private Context context;

    public GlobalHttpHandlerImpl(Context context) {
        this.context = context;
    }
    @Override
    public Response onHttpResultResponse(String httpResult, Interceptor.Chain chain, Response response) {
                  /* 这里可以先客户端一步拿到每一次http请求的结果,可以解析成json,做一些操作,如检测到token过期后
                           重新请求token,并重新执行请求 */
        //                        try {
        //                            if (!TextUtils.isEmpty(httpResult) && RequestInterceptor.isJson
        // (response.body().contentType())) {
        //                                JSONArray array = new JSONArray(httpResult);
        ////                                JSONObject object = (JSONObject) array.get(0);
        //                                //                                String login = object
        // .getString("login");
        //                                //                                String avatar_url = object
        // .getString("avatar_url");
        //                                //                                Timber.w("Result ------> " +
        // login + "    ||
        //                                // Avatar_url------> " + avatar_url);
        //                            }
        //
        //                        } catch (JSONException e) {
        //                            e.printStackTrace();
        //                            return response;
        //                        }

                     /* 这里如果发现token过期,可以先请求最新的token,然后在拿新的token放入request里去重新请求
                        注意在这个回调之前已经调用过proceed,所以这里必须自己去建立网络请求,如使用okhttp使用新的request去请求
                        create a new request and modify it accordingly using the new token
                        Request newRequest = chain.request().newBuilder().header("token", newToken)
                                             .build();

                        retry the request

                        response.body().close();
                        如果使用okhttp将新的请求,请求成功后,将返回的response  return出去即可
                        如果不需要返回新的结果,则直接把response参数返回出去 */

        return response;
    }

    @Override
    public Request onHttpRequestBefore(Interceptor.Chain chain, Request request) {
    /* 如果需要再请求服务器之前做一些操作,则重新返回一个做过操作的的requeat如增加header,不做操作则直接返回request参数
                           return chain.request().newBuilder().header("token", tokenId)
                                  .build(); */

        return chain.request().newBuilder()
                .addHeader("X-Location", "")
                .addHeader("X-Client-Version", "3.2.5")
                .addHeader("X-Channel-Code", "lsp-yyb")
                .addHeader("X-Client-Agent", "360_1603-A02_6.0")
                .addHeader("X-Long-Token", "")
                .addHeader("X-Platform-Version", "6.0")
                .addHeader("X-Client-Hash", "3c0570795e37e3ffc81b1e18bc4fe228")
                .addHeader("X-User-ID", "")
                .addHeader("X-Platform-Type", "2")
                .addHeader("X-Client-ID", "99000859074820")
                .addHeader("X-Serial-Num", String.valueOf(System.currentTimeMillis() / 1000L))
                .addHeader("Accept-Encoding", "gzip")
                .build();
    }
}
