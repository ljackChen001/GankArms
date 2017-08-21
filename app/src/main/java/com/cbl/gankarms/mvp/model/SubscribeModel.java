package com.cbl.gankarms.mvp.model;

import android.app.Application;

import com.cbl.gankarms.mvp.contract.SubscribeContract;
import com.google.gson.Gson;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import javax.inject.Inject;


@ActivityScope
public class SubscribeModel extends BaseModel implements SubscribeContract.Model {
    private Gson mGson;
    private Application mApplication;

    @Inject
    public SubscribeModel(IRepositoryManager repositoryManager, Gson gson, Application application) {
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

}