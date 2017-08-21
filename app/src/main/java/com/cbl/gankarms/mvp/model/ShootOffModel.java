package com.cbl.gankarms.mvp.model;

import android.app.Application;

import com.cbl.gankarms.mvp.contract.ShootOffContract;
import com.google.gson.Gson;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import javax.inject.Inject;


@ActivityScope
public class ShootOffModel extends BaseModel implements ShootOffContract.Model {
    private Gson mGson;
    private Application mApplication;

    @Inject
    public ShootOffModel(IRepositoryManager repositoryManager, Gson gson, Application application) {
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