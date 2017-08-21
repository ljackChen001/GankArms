package com.cbl.gankarms.di.module;

import com.cbl.gankarms.mvp.contract.MineContract;
import com.cbl.gankarms.mvp.model.MineModel;
import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;


@Module
public class MineModule {
    private MineContract.View view;

    /**
     * 构建MineModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public MineModule(MineContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    MineContract.View provideMineView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    MineContract.Model provideMineModel(MineModel model) {
        return model;
    }
}