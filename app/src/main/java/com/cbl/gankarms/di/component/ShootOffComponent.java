package com.cbl.gankarms.di.component;

import com.cbl.gankarms.di.module.ShootOffModule;
import com.cbl.gankarms.mvp.ui.fragment.ShootOffFragment;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(modules = ShootOffModule.class, dependencies = AppComponent.class)
public interface ShootOffComponent {
    void inject(ShootOffFragment fragment);
}