package com.cbl.gankarms.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.gyf.barlibrary.ImmersionBar;
import com.jess.arms.utils.ArmsUtils;
import com.squareup.leakcanary.RefWatcher;

/**
 * Created by chenbaolin on 2017/9/6.
 */

public class FragmentLifecycleCallbacksImpl extends FragmentManager.FragmentLifecycleCallbacks {

    @Override
    public void onFragmentCreated(FragmentManager fm, Fragment f, Bundle savedInstanceState) {
        // 在配置变化的时候将这个 Fragment 保存下来,在 Activity 由于配置变化重建是重复利用已经创建的Fragment。
        // https://developer.android.com/reference/android/app/Fragment.html?hl=zh-cn#setRetainInstance(boolean)
        // 如果在 XML 中使用 <Fragment/> 标签,的方式创建 Fragment 请务必在标签中加上 android:id 或者 android:tag 属性,否则 setRetainInstance(true) 无效
        // 在 Activity 中绑定少量的 Fragment 建议这样做,如果需要绑定较多的 Fragment 不建议设置此参数,如 ViewPager 需要展示较多 Fragment
        f.setRetainInstance(true);
    }

    @Override
    public void onFragmentDestroyed(FragmentManager fm, Fragment f) {
        //这里应该是检测 Fragment 而不是 FragmentLifecycleCallbacks 的泄露。
        ImmersionBar.with(f).destroy();
        ((RefWatcher) ArmsUtils
                .obtainAppComponentFromContext(f.getActivity())
                .extras()
                .get(RefWatcher.class.getName()))
                .watch(f);
    }
}
