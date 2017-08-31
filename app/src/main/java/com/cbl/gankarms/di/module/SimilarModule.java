package com.cbl.gankarms.di.module;

import com.cbl.gankarms.mvp.ui.fragment.home.SimilarContract;
import com.cbl.gankarms.mvp.ui.fragment.home.SimilarModel;
import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;


@Module
public class SimilarModule {
    private SimilarContract.View view;

    /**
     * 构建SimilarModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public SimilarModule(SimilarContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    SimilarContract.View provideSimilarView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    SimilarContract.Model provideSimilarModel(SimilarModel model) {
        return model;
    }
}