package com.cbl.gankarms.di.component;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.cbl.gankarms.di.module.RecommendModule;

import com.cbl.gankarms.mvp.ui.fragment.home.RecommendFragment;

@ActivityScope
@Component(modules = RecommendModule.class, dependencies = AppComponent.class)
public interface RecommendComponent {
    void inject(RecommendFragment fragment);
}