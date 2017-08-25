package com.cbl.gankarms.mvp.ui.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;

import com.cbl.gankarms.R;
import com.cbl.gankarms.mvp.model.bean.ContListBean;
import com.cbl.gankarms.widget.CircleImageView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.http.imageloader.ImageLoader;
import com.jess.arms.http.imageloader.glide.ImageConfigImpl;
import com.jess.arms.utils.ArmsUtils;

import java.util.ArrayList;
import java.util.List;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

/**
 * Created by chenbaolin on 2017/8/23.
 */

public class ContListAdapter extends BaseQuickAdapter<ContListBean, BaseViewHolder> {

    private AppComponent mAppComponent;
    private ImageLoader mImageLoader;//用于加载图片的管理类,默认使用glide,使用策略模式,可替换框架
    private JCVideoPlayerStandard jcVideoPlayerStandard;
    private List<ContListBean> listBean = new ArrayList<>();

    public ContListAdapter(@LayoutRes int layoutResId, @Nullable List<ContListBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder holder, ContListBean data) {
        mAppComponent = ArmsUtils.obtainAppComponentFromContext(mContext);
        mImageLoader = mAppComponent.imageLoader();
        AppCompatTextView mTvLable = holder.getView(R.id.tv_label);

        //        holder.setText(R.id.tv_name,contListBean.get());
        CircleImageView itemView = holder.getView(R.id.iv_head);
        jcVideoPlayerStandard = holder.getView(R.id.video_player);

        jcVideoPlayerStandard.setUp(data.getVideos().get(0).getUrl()
                , JCVideoPlayerStandard.SCREEN_LAYOUT_NORMAL, "");
        mImageLoader.loadImage(mAppComponent.appManager().getCurrentActivity() == null
                        ? mAppComponent.application() : mAppComponent.appManager().getCurrentActivity(),
                ImageConfigImpl
                        .builder()
                        .url(data.getPic())
                        .imageView(jcVideoPlayerStandard.thumbImageView)
                        .build());
        mImageLoader.loadImage(mAppComponent.appManager().getCurrentActivity() == null
                        ? mAppComponent.application() : mAppComponent.appManager().getCurrentActivity(),
                ImageConfigImpl
                        .builder()
                        .url(data.getNodeInfo().getLogoImg())
                        .imageView(itemView)
                        .build());
        holder.setText(R.id.tv_name, data.getNodeInfo().getName());
        holder.setText(R.id.tv_label, data.getCornerLabelDesc());
        if (data.getCornerLabelDesc().equals("推荐")) {
            mTvLable.setBackgroundResource(R.drawable.tv_bg_1);
            mTvLable.setTextColor(mContext.getResources().getColor(R.color.color_fdac29));
        } else if (data.getCornerLabelDesc().equals("独播")) {
            mTvLable.setBackgroundResource(R.drawable.tv_bg_2);
            mTvLable.setTextColor(mContext.getResources().getColor(R.color.color_2aaed6));
        } else {
            mTvLable.setBackground(null);
        }

        holder.setText(R.id.tv_comment, data.getCommentTimes());
        holder.setText(R.id.tv_like, data.getCommentTimes());
    }

    @Override
    public void onViewRecycled(BaseViewHolder holder) {
        super.onViewRecycled(holder);
        mImageLoader.clear(mAppComponent.application(), ImageConfigImpl.builder()
                .imageViews(jcVideoPlayerStandard.thumbImageView)
                .build());
    }


}
