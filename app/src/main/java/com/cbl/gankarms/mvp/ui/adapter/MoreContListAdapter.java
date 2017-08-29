package com.cbl.gankarms.mvp.ui.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.cbl.gankarms.R;
import com.cbl.gankarms.mvp.model.bean.ContListBean;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.http.imageloader.ImageLoader;
import com.jess.arms.http.imageloader.glide.ImageConfigImpl;
import com.jess.arms.utils.ArmsUtils;

import java.util.List;

/**
 * Created by chenbaolin on 2017/8/23.
 */

public class MoreContListAdapter extends BaseQuickAdapter<ContListBean, BaseViewHolder> {

    private AppComponent mAppComponent;
    private ImageLoader mImageLoader;//用于加载图片的管理类,默认使用glide,使用策略模式,可替换框架
    private ImageView iv;

    public MoreContListAdapter(@LayoutRes int layoutResId, @Nullable List<ContListBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder holder, ContListBean data) {
        mAppComponent = ArmsUtils.obtainAppComponentFromContext(mContext);
        mImageLoader = mAppComponent.imageLoader();
        TextView mTvLable = holder.getView(R.id.tv_label);
        iv = holder.getView(R.id.iv_shoot_off_activity);

        mImageLoader.loadImage(mAppComponent.appManager().getCurrentActivity() == null
                        ? mAppComponent.application() : mAppComponent.appManager().getCurrentActivity(),
                ImageConfigImpl
                        .builder()
                        .url(data.getPic())
                        .imageView(iv)
                        .build());
        holder.setText(R.id.tv_label, data.getCornerLabelDesc());
        if (data.getCornerLabelDesc().equals("推荐")) {
            mTvLable.setBackgroundResource(R.drawable.tv_bg_1);
            mTvLable.setTextColor(mContext.getResources().getColor(R.color.color_fdac29));
        } else if (data.getCornerLabelDesc().equals("独播")) {
            mTvLable.setBackgroundResource(R.drawable.tv_bg_2);
            mTvLable.setTextColor(mContext.getResources().getColor(R.color.color_2aaed6));
        } else {
            mTvLable.setVisibility(View.GONE);
        }
        holder.setText(R.id.tv_node_name, data.getNodeInfo().getName() + "　|　" + data.getDuration());
        holder.setText(R.id.tv_title, data.getName());
    }

    @Override
    public void onViewRecycled(BaseViewHolder holder) {
        super.onViewRecycled(holder);
        mImageLoader.clear(mAppComponent.application(), ImageConfigImpl.builder()
                .imageViews(iv)
                .build());
    }


}
