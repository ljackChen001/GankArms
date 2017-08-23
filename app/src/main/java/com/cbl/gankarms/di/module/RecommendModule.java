package com.cbl.gankarms.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.cbl.gankarms.mvp.ui.fragment.home.RecommendContract;
import com.cbl.gankarms.mvp.ui.fragment.home.RecommendModel;


@Module
public class RecommendModule {
    private RecommendContract.View view;

    /**
     * 构建RecommendModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public RecommendModule(RecommendContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    RecommendContract.View provideRecommendView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    RecommendContract.Model provideRecommendModel(RecommendModel model) {
        return model;
    }
}