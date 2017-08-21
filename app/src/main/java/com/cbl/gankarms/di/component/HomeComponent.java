package com.cbl.gankarms.di.component;

import com.cbl.gankarms.di.module.HomeModule;
import com.cbl.gankarms.mvp.ui.fragment.HomeFragment;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;

import dagger.Component;


@ActivityScope
@Component(modules = HomeModule.class, dependencies = AppComponent.class)
public interface HomeComponent {
    void inject(HomeFragment fragment);
}