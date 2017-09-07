package com.cbl.gankarms.mvp.ui.fragment.home;

import android.app.Application;

import com.cbl.gankarms.mvp.model.bean.ActivityListBean;
import com.cbl.gankarms.mvp.model.bean.ContListBean;
import com.cbl.gankarms.mvp.model.bean.DataListBean;
import com.cbl.gankarms.mvp.model.bean.RecommendBean;
import com.cbl.gankarms.mvp.model.bean.TagListBean;
import com.cbl.gankarms.mvp.ui.adapter.helper.RecommendAdapter;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.http.imageloader.ImageLoader;
import com.jess.arms.integration.AppManager;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.utils.RxLifecycleUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

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
    //    private ContListAdapter mAdapter;
    //    private TagListAdapter mTagListAdapter;
    //    private ShootOffActivityAdapter shootOffActivityAdapter;
    //    private MoreContListAdapter moreContListAdapter;
    List<ContListBean> dataList = new ArrayList<>();
    List<TagListBean> tagListBean;
    List<ActivityListBean> activityListBean;
    List<DataListBean> dataListBeen;
    public RecommendAdapter mAdapter;
    private int start = 0;
    private boolean isFirst = true;

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

    public void getRecommendList(final boolean pullToRefresh) {
        if (mAdapter == null) {
            mAdapter = new RecommendAdapter();
            mRootView.setAdapter(mAdapter);//设置Adapter
        }
        if (pullToRefresh && isFirst) {//默认在第一次下拉刷新时使用缓存
            start = 0;
            isFirst = false;
        } else {
            start += 10;
        }
        mAdapter.notifyLoading();
        //        if (mAdapter == null) {
        //            mAdapter = new ContListAdapter(R.layout.item_recommend_1, dataList);
        //            mRootView.setAdapter(mAdapter);//设置Adapter
        //        }
        //        if (mTagListAdapter == null) {
        //            mTagListAdapter = new TagListAdapter(R.layout.item_recommend_2, tagListBean);
        //            mRootView.setTagAdapter(mTagListAdapter);//设置Adapter
        //        }
        //        if (shootOffActivityAdapter == null) {
        //            shootOffActivityAdapter = new ShootOffActivityAdapter(R.layout.item_recommend_3, activityListBean);
        //            mRootView.setShootOffActivityAdapter(shootOffActivityAdapter);//设置Adapter
        //        }
        //        if (moreContListAdapter == null) {
        //            moreContListAdapter = new MoreContListAdapter(R.layout.item_recommend_4, dataList);
        //            mRootView.setMoreContListAdapter(moreContListAdapter);//设置Adapter
        //        }
        //        mModel.getRecommendList(isHome, "", start).compose(RxUtils.applySchedulers(mRootView))
        mModel.getRecommendList("1", "", start)
                .subscribeOn(Schedulers.io())
                .retryWhen(new RetryWithDelay(3, 2))
                .doOnSubscribe(disposable -> {
                    if (pullToRefresh)
                        mRootView.showLoading();//显示下拉刷新的进度条
                    else
                        mRootView.startLoadMore();//显示上拉加载更多的进度条
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .doFinally(() -> {
                    if (pullToRefresh)
                        mRootView.hideLoading();//隐藏下拉刷新的进度条
                    else
                        mRootView.endLoadMore();//隐藏上拉加载更多的进度条
                })
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView))
                .delay(200, TimeUnit.MILLISECONDS, false)
                .subscribe(new ErrorHandleSubscriber<RecommendBean>(mErrorHandler) {
                    @Override
                    public void onNext(@NonNull RecommendBean dataListBeen) {
                        for (int i = 0; i < dataListBeen.getDataList().size(); i++) {
                            String nodeType = dataListBeen.getDataList().get(i).getNodeType();
                            if (nodeType.equals("13")) {
                                if (pullToRefresh) {
                                    dataList.addAll(0, dataListBeen.getDataList().get(i).getContList());
                                } else {
                                    dataList.addAll(dataListBeen.getDataList().get(i).getContList());
                                    mAdapter.loadMoreComplete();
                                }
                                mAdapter.notifyType1(dataList);
                            }
                            if (nodeType.equals("14")) {
                                //TODO 这里后面来处理
                                //                                tagListBean = new ArrayList<>();
                                //                                tagListBean.addAll(dataListBeen.getDataList().get(i)
                                //                                        .getTagList());
                                //                                mAdapter.notifyType2(tagListBean);
                            }
                            if (nodeType.equals("12")) {
                                //                                activityListBean = new ArrayList<>();
                                //                                activityListBean.addAll(dataListBeen.getDataList()
                                // .get(i)
                                //                                        .getActivityList());
                                //                                mAdapter.notifyType3(activityListBean);
                            }
                        }
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