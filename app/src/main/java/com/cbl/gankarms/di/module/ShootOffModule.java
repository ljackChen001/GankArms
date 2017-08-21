package com.cbl.gankarms.di.module;

import com.cbl.gankarms.mvp.contract.ShootOffContract;
import com.cbl.gankarms.mvp.model.ShootOffModel;
import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;


@Module
public class ShootOffModule {
    private ShootOffContract.View view;

    /**
     * 构建ShootOffModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public ShootOffModule(ShootOffContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    ShootOffContract.View provideShootOffView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    ShootOffContract.Model provideShootOffModel(ShootOffModel model) {
        return model;
    }
}