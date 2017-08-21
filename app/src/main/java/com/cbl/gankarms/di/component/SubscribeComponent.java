package com.cbl.gankarms.di.component;

import com.cbl.gankarms.di.module.SubscribeModule;
import com.cbl.gankarms.mvp.ui.fragment.SubscribeFragment;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(modules = SubscribeModule.class, dependencies = AppComponent.class)
public interface SubscribeComponent {
    void inject(SubscribeFragment fragment);
}