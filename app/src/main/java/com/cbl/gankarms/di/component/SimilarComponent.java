package com.cbl.gankarms.di.component;

import com.cbl.gankarms.di.module.SimilarModule;
import com.cbl.gankarms.mvp.ui.fragment.home.SimilarFragment;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;

import dagger.Component;


@ActivityScope
@Component(modules = SimilarModule.class, dependencies = AppComponent.class)
public interface SimilarComponent {
    void inject(SimilarFragment fragment);
}