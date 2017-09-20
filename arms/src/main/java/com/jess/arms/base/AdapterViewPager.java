/**
 * Copyright 2017 JessYan
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jess.arms.base;

import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * ================================================
 * 基类 {@link FragmentStatePagerAdapter}
 * <p>
 * Created by JessYan on 22/03/2016
 * Contact with <mailto:jess.yan.effort@gmail.com>
 * Follow me on <https://github.com/JessYanCoding>
 * ================================================
 */
public class AdapterViewPager extends FragmentStatePagerAdapter {
    private List<Fragment> mList;
    private List<String> mTitles;

    public AdapterViewPager(FragmentManager fragmentManager, List<Fragment> list) {
        super(fragmentManager);
        this.mList = list;
    }


    public AdapterViewPager(FragmentManager fragmentManager, List<Fragment> list, List<String> titles) {
        super(fragmentManager);
        this.mList = list;
        this.mTitles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (mTitles != null) {
            return mTitles.get(position);
        }
        return super.getPageTitle(position);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Parcelable saveState() {
        return null;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        Fragment f = (Fragment) super.instantiateItem(container, position);
        View view = f.getView();
        if (view != null)
            container.addView(view);
        return f;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        View view = mList.get(position).getView();
        if (view != null)
            container.removeView(view);
    }
}
