package com.cbl.gankarms;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.cbl.gankarms.app.EventBusTags;
import com.cbl.gankarms.mvp.ui.fragment.HomeFragment;
import com.cbl.gankarms.mvp.ui.fragment.LiveFragment;
import com.cbl.gankarms.mvp.ui.fragment.MineFragment;
import com.cbl.gankarms.mvp.ui.fragment.ShootOffFragment;
import com.cbl.gankarms.mvp.ui.fragment.SubscribeFragment;
import com.cbl.gankarms.utils.BottomNavigationViewHelper;
import com.cbl.gankarms.utils.FragmentUtils;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import timber.log.Timber;

import static com.cbl.gankarms.app.EventBusTags.ACTIVITY_FRAGMENT_REPLACE;

@Route(path = EventBusTags.AROUTER_PATH_MAIN)
public class MainActivity extends BaseActivity {
    @BindView(R.id.toolbar_title)
    TextView mToolbarTitle;
    @BindView(R.id.bottom_navigation_bar)
    BottomNavigationView mBottomNavigationBar;
    private List<Fragment> fragmentList;
    private List<Integer> mTitles;
    private int mReplace = 0;

    @Override
    public void setupActivityComponent(AppComponent appComponent) {

    }


    @Override
    public int initView(Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        this.setTitle(R.string.title_home);
        if (mTitles == null) {
            mTitles = new ArrayList<>();
            mTitles.add(R.string.title_home);
            mTitles.add(R.string.title_live);
            mTitles.add(R.string.title_subscribe);
            mTitles.add(R.string.title_shoot_off);
            mTitles.add(R.string.title_mine);
        }
        initFragments(savedInstanceState);
        mBottomNavigationBar.setItemIconTintList(null);
        BottomNavigationViewHelper.disableShiftMode(mBottomNavigationBar);
        mBottomNavigationBar.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mReplace = 0;
                    break;
                case R.id.navigation_live:
                    mReplace = 1;
                    break;
                case R.id.navigation_subscribe:
                    mReplace = 2;
                    break;
                case R.id.navigation_shoot_off:
                    mReplace = 3;
                    break;
                case R.id.navigation_mine:
                    mReplace = 4;
                    break;
            }
            mToolbarTitle.setText(mTitles.get(mReplace));
            FragmentUtils.hideAllShowFragment(fragmentList.get(mReplace));
            return true;
        });
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        // Fragment与Activity通信，使用ARouter。
        // 在AndroidManifest.xml中将Activity启动模式设为：launchMode="singleTask"
        mReplace = intent.getIntExtra(ACTIVITY_FRAGMENT_REPLACE,
                EventBusTags.MAIN_FRAGMENT_HOME) - EventBusTags.MAIN_FRAGMENT_HOME;
        Timber.d("onNewIntent: mReplace--->" + mReplace);
    }


    private void initFragments(Bundle savedInstanceState) {
        //处理Activity的重建（recreate），恢复Fragment
        HomeFragment homeFragment;
        LiveFragment liveFragment;
        SubscribeFragment subscribeFragment;
        ShootOffFragment shootOffFragment;
        MineFragment mineFragment;
        if (savedInstanceState == null) {
            homeFragment = HomeFragment.newInstance();
            liveFragment = LiveFragment.newInstance();
            subscribeFragment = SubscribeFragment.newInstance();
            shootOffFragment = ShootOffFragment.newInstance();
            mineFragment = MineFragment.newInstance();
        } else {
            mReplace = savedInstanceState.getInt(ACTIVITY_FRAGMENT_REPLACE);
            FragmentManager fm = getSupportFragmentManager();
            homeFragment = (HomeFragment) FragmentUtils.findFragment(fm, HomeFragment.class);
            liveFragment = (LiveFragment) FragmentUtils.findFragment(fm, LiveFragment.class);
            subscribeFragment = (SubscribeFragment) FragmentUtils.findFragment(fm, SubscribeFragment.class);
            shootOffFragment = (ShootOffFragment) FragmentUtils.findFragment(fm, ShootOffFragment.class);
            mineFragment = (MineFragment) FragmentUtils.findFragment(fm, MineFragment.class);
        }
        if (fragmentList == null) {
            fragmentList = new ArrayList<>();
            fragmentList.add(homeFragment);
            fragmentList.add(liveFragment);
            fragmentList.add(subscribeFragment);
            fragmentList.add(shootOffFragment);
            fragmentList.add(mineFragment);
        }
        FragmentUtils.addFragments(getSupportFragmentManager(), fragmentList, R.id.content, 0);
    }

    @Override
    public void onBackPressed() {
        //        if (mReplace != 0) {
        //            mReplace = 0;
        //        } else {
        //            super.onBackPressed();
        //        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //保存当前Activity显示的Fragment索引
        outState.putInt(ACTIVITY_FRAGMENT_REPLACE, mReplace);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.mTitles = null;
        this.fragmentList = null;
    }
}
