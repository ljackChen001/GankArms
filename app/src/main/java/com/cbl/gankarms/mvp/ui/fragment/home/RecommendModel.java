package com.cbl.gankarms.mvp.ui.fragment.home;

import android.app.Application;

import com.cbl.gankarms.mvp.model.api.service.HomeService;
import com.cbl.gankarms.mvp.model.bean.RecommendBean;
import com.google.gson.Gson;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import javax.inject.Inject;

import io.reactivex.Observable;


@ActivityScope
public class RecommendModel extends BaseModel implements RecommendContract.Model {
    private Gson mGson;
    private Application mApplication;

    @Inject
    public RecommendModel(IRepositoryManager repositoryManager, Gson gson, Application application) {
        super(repositoryManager);
        this.mGson = gson;
        this.mApplication = application;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }


    @Override
    public Observable<RecommendBean> getRecommendList(String isHome, String channelCode, String start) {
        return mRepositoryManager.obtainRetrofitService(HomeService.class).getRecommendList(isHome, channelCode, start);
    }
}