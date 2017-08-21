package com.cbl.gankarms.di.component;

import com.cbl.gankarms.di.module.MineModule;
import com.cbl.gankarms.mvp.ui.fragment.MineFragment;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(modules = MineModule.class, dependencies = AppComponent.class)
public interface MineComponent {
    void inject(MineFragment fragment);
}