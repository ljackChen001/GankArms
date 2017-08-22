package com.cbl.gankarms.mvp.model;

import android.app.Application;

import com.cbl.gankarms.mvp.contract.HomeContract;
import com.cbl.gankarms.mvp.model.api.service.HomeService;
import com.cbl.gankarms.mvp.model.bean.CategoryListBean;
import com.google.gson.Gson;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import javax.inject.Inject;

import io.reactivex.Observable;


@ActivityScope
public class HomeModel extends BaseModel implements HomeContract.Model {
    private Gson mGson;
    private Application mApplication;

    @Inject
    public HomeModel(IRepositoryManager repositoryManager, Gson gson, Application application) {
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
    public Observable<CategoryListBean> getCategorys() {
        return mRepositoryManager.obtainRetrofitService(HomeService.class).getCategorys();
    }
}