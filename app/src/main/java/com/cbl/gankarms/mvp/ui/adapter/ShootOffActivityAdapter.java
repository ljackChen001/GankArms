package com.cbl.gankarms.mvp.ui.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.cbl.gankarms.R;
import com.cbl.gankarms.mvp.model.bean.ActivityListBean;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.http.imageloader.ImageLoader;
import com.jess.arms.http.imageloader.glide.ImageConfigImpl;
import com.jess.arms.utils.ArmsUtils;

import java.util.List;

/**
 * Created by chenbaolin on 2017/8/28.
 */

public class ShootOffActivityAdapter extends BaseQuickAdapter<ActivityListBean, BaseViewHolder> {
    private AppComponent mAppComponent;
    private ImageLoader mImageLoader;//用于加载图片的管理类,默认使用glide,使用策略模式,可替换框架
    private ImageView iv;

    public ShootOffActivityAdapter(@LayoutRes int layoutResId, @Nullable List<ActivityListBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder holder, ActivityListBean data) {
        mAppComponent = ArmsUtils.obtainAppComponentFromContext(mContext);
        mImageLoader = mAppComponent.imageLoader();
        iv = holder.getView(R.id.iv_shoot_off_activity);
        mImageLoader.loadImage(mAppComponent.appManager().getCurrentActivity() == null
                        ? mAppComponent.application() : mAppComponent.appManager().getCurrentActivity(),
                ImageConfigImpl
                        .builder()
                        .url(data.getBackgroundImg())
                        .imageView(iv)
                        .build());
    }
    @Override
    public void onViewRecycled(BaseViewHolder holder) {
        super.onViewRecycled(holder);
        mImageLoader.clear(mAppComponent.application(), ImageConfigImpl.builder()
                .imageViews(iv)
                .build());
    }
}
