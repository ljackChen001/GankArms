package com.cbl.gankarms.mvp.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.cbl.gankarms.R;
import com.cbl.gankarms.di.component.DaggerHomeComponent;
import com.cbl.gankarms.di.module.HomeModule;
import com.cbl.gankarms.mvp.contract.HomeContract;
import com.cbl.gankarms.mvp.model.bean.CategoryListBean;
import com.cbl.gankarms.mvp.presenter.HomePresenter;
import com.cbl.gankarms.mvp.ui.adapter.ViewPagerAdapter;
import com.cbl.gankarms.mvp.ui.fragment.home.RecommendFragment;
import com.cbl.gankarms.mvp.ui.fragment.home.SimilarFragment;
import com.jess.arms.base.AdapterViewPager;
import com.jess.arms.base.BaseFragment;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

import static com.jess.arms.utils.Preconditions.checkNotNull;


public class HomeFragment extends BaseFragment<HomePresenter> implements HomeContract.View {


    @BindView(R.id.viewpager)
    ViewPager mViewPager;
    @BindView(R.id.tabs)
    TabLayout mTabLayout;
    @BindView(R.id.toolbar_iv_target)
    ImageView toolbarIvTarget;
    @BindView(R.id.appbar)
    AppBarLayout mAppBarLayout;

    ViewPagerAdapter viewPagerAdapter;
    private ArrayList<Fragment> fragmentList;
    private List<String> mTitle;

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;

    }

    @Override
    public void setupFragmentComponent(AppComponent appComponent) {
        DaggerHomeComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .homeModule(new HomeModule(this))
                .build()
                .inject(this);
    }

    @Override
    public View initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        //        mTabLayout.addTab();
        mPresenter.getCategorys();
        //        mTitle = new ArrayList<>();
        //        fragmentList = new ArrayList<>();
        initListener();
    }

    private void initListener() {
        mAppBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                float percent = (float) Math.abs(verticalOffset) / (float) appBarLayout.getTotalScrollRange();

            }
        });
    }

    /**
     * 此方法是让外部调用使fragment做一些操作的,比如说外部的activity想让fragment对象执行一些方法,
     * 建议在有多个需要让外界调用的方法时,统一传Message,通过what字段,来区分不同的方法,在setData
     * 方法中就可以switch做不同的操作,这样就可以用统一的入口方法做不同的事
     * <p>
     * 使用此方法时请注意调用时fragment的生命周期,如果调用此setData方法时onCreate还没执行
     * setData里却调用了presenter的方法时,是会报空的,因为dagger注入是在onCreated方法中执行的,然后才创建的presenter
     * 如果要做一些初始化操作,可以不必让外部调setData,在initData中初始化就可以了
     *
     * @param data
     */

    @Override
    public void setData(Object data) {

    }


    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(@NonNull String message) {
        checkNotNull(message);
        ArmsUtils.snackbarText(message);
    }

    @Override
    public void launchActivity(@NonNull Intent intent) {
        checkNotNull(intent);
        ArmsUtils.startActivity(intent);
    }

    @Override
    public void killMyself() {

    }

    @Override
    public void getCategroySuccess(List<CategoryListBean.CategoryList> categoryList) {
        mTitle = new ArrayList<>();
        fragmentList = new ArrayList<>();
        mTitle.add(0, "推荐");
        mTitle.add(1, "热门");
        if (categoryList != null) {
            for (int i = 0; i < categoryList.size(); i++) {
                //                mTabLayout.addTab(mTabLayout.newTab().setText(categoryList.get(i).getName()));
                mTitle.add(categoryList.get(i).getName());
            }

            fragmentList.add(new RecommendFragment());
            fragmentList.add(new SimilarFragment());
            fragmentList.add(new SimilarFragment());
            fragmentList.add(new SimilarFragment());
            fragmentList.add(new SimilarFragment());
            fragmentList.add(new SimilarFragment());
            fragmentList.add(new SimilarFragment());
            fragmentList.add(new SimilarFragment());
            fragmentList.add(new SimilarFragment());
            fragmentList.add(new SimilarFragment());
            fragmentList.add(new SimilarFragment());
            fragmentList.add(new SimilarFragment());
            fragmentList.add(new SimilarFragment());
            fragmentList.add(new SimilarFragment());
            mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
            AdapterViewPager viewPagerAdapter = new AdapterViewPager(getChildFragmentManager(),
                    fragmentList, mTitle);
            mViewPager.setCurrentItem(0);
            mViewPager.setAdapter(viewPagerAdapter);
            mTabLayout.setupWithViewPager(mViewPager, true);
            mTabLayout.setTabsFromPagerAdapter(viewPagerAdapter);
        }
    }

}
