package com.cbl.gankarms.mvp.ui.fragment.home;

import android.app.Application;

import com.cbl.gankarms.R;
import com.cbl.gankarms.mvp.model.bean.RecommendBean;
import com.cbl.gankarms.mvp.ui.adapter.ContListAdapter;
import com.cbl.gankarms.utils.RxUtils;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.http.imageloader.ImageLoader;
import com.jess.arms.integration.AppManager;
import com.jess.arms.mvp.BasePresenter;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.schedulers.Schedulers;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;
import me.jessyan.rxerrorhandler.handler.RetryWithDelay;


@ActivityScope
public class RecommendPresenter extends BasePresenter<RecommendContract.Model, RecommendContract.View> {
    private RxErrorHandler mErrorHandler;
    private Application mApplication;
    private ImageLoader mImageLoader;
    private AppManager mAppManager;
    private ContListAdapter mAdapter;
    private List<RecommendBean.DataListBean> dataList = new ArrayList<>();

    @Inject
    public RecommendPresenter(RecommendContract.Model model, RecommendContract.View rootView
            , RxErrorHandler handler, Application application
            , ImageLoader imageLoader, AppManager appManager) {
        super(model, rootView);
        this.mErrorHandler = handler;
        this.mApplication = application;
        this.mImageLoader = imageLoader;
        this.mAppManager = appManager;
    }

    public void getRecommendList(String isHome, String start) {
        if (mAdapter == null) {
            mAdapter = new ContListAdapter(R.layout.list_item, dataList);
            mRootView.setAdapter(mAdapter);//设置Adapter
        }
        mModel.getRecommendList(isHome, "", start)
                .subscribeOn(Schedulers.io())
                .retryWhen(new RetryWithDelay(3, 2))
                .doOnSubscribe(disposable -> {
                    mRootView.showLoading();
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .doFinally(() -> mRootView.hideLoading())
                .compose(RxUtils.bindToLifecycle(mRootView))
                .subscribe(new ErrorHandleSubscriber<RecommendBean>(mErrorHandler) {
                    @Override
                    public void onNext(@NonNull RecommendBean recommendBean) {
                        mRootView.getRecommendSuccess(recommendBean.getDataList());
                        dataList=recommendBean.getDataList();
                        mAdapter.setNewData(dataList);
                        mAdapter.notifyDataSetChanged();
                    }
                });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mErrorHandler = null;
        this.mAppManager = null;
        this.mImageLoader = null;
        this.mApplication = null;
    }

}