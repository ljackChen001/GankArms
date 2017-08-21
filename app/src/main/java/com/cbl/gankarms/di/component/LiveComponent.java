package com.cbl.gankarms.di.component;

import com.cbl.gankarms.di.module.LiveModule;
import com.cbl.gankarms.mvp.ui.fragment.LiveFragment;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;

import dagger.Component;


@ActivityScope
@Component(modules = LiveModule.class, dependencies = AppComponent.class)
public interface LiveComponent {
    void inject(LiveFragment fragment);
}