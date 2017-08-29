package com.cbl.gankarms.mvp.ui.adapter.helper;

import android.support.v7.widget.AppCompatTextView;
import android.widget.ImageView;
import android.widget.TextView;

import com.cbl.gankarms.R;
import com.cbl.gankarms.mvp.model.bean.ActivityListBean;
import com.cbl.gankarms.mvp.model.bean.ContListBean;
import com.cbl.gankarms.mvp.model.bean.TagListBean;
import com.cbl.gankarms.widget.CircleImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.http.imageloader.ImageLoader;
import com.jess.arms.http.imageloader.glide.ImageConfigImpl;
import com.jess.arms.utils.ArmsUtils;

import java.util.List;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

/**
 * Created by chenbaolin on 2017/8/28.
 */

public class MyAdapter extends BaseAdapter<MutiTypeTitleEntity, BaseViewHolder, MyAdapterHelper> {
    private AppComponent mAppComponent;
    private ImageLoader mImageLoader;//用于加载图片的管理类,默认使用glide,使用策略模式,可替换框架
    private ImageView iv, mIvActivity;
    private JCVideoPlayerStandard jcVideoPlayerStandard;
    private CircleImageView mIvHead;

    public MyAdapter() {
        super(new MyAdapterHelper());}
    @Override
    protected void convert(BaseViewHolder helper, MutiTypeTitleEntity item) {
        mAppComponent = ArmsUtils.obtainAppComponentFromContext(mContext);
        mImageLoader = mAppComponent.imageLoader();
        int itemType = item.getItemType();
        switch (itemType) {
            case ContListBean.ITEM_TYPE_1:
                renderEntity1(helper, (ContListBean) item);
                break;
            case TagListBean.ITEM_TYPE_2:
                renderEntity2(helper, (TagListBean) item);
                break;
            case ActivityListBean.ITEM_TYPE_3:
                renderEntity3(helper, (ActivityListBean) item);
                break;
        }

    }
    private void renderEntity1(BaseViewHolder helper, ContListBean data) {
        helper.setText(R.id.tv_title, data.getName());
        AppCompatTextView mTvLable = helper.getView(R.id.tv_label);
        mIvHead = helper.getView(R.id.iv_head);
        jcVideoPlayerStandard = helper.getView(R.id.video_player);
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
                        .imageView(mIvHead)
                        .build());
        helper.setText(R.id.tv_name, data.getNodeInfo().getName());
        helper.setText(R.id.tv_label, data.getCornerLabelDesc());
        if (data.getCornerLabelDesc().equals("推荐")) {
            mTvLable.setBackgroundResource(R.drawable.tv_bg_1);
            mTvLable.setTextColor(mContext.getResources().getColor(R.color.color_fdac29));
        } else if (data.getCornerLabelDesc().equals("独播")) {
            mTvLable.setBackgroundResource(R.drawable.tv_bg_2);
            mTvLable.setTextColor(mContext.getResources().getColor(R.color.color_2aaed6));
        } else {
            mTvLable.setBackground(null);
        }

        helper.setText(R.id.tv_comment, data.getCommentTimes());
        helper.setText(R.id.tv_like, data.getCommentTimes());
    }

    private void renderEntity2(BaseViewHolder helper, TagListBean data) {
        TextView tag = helper.getView(R.id.tv_hot_tag);
        tag.setText(data.getName());
        //        ViewGroup.LayoutParams lp = tag.getLayoutParams();
        //        if (lp instanceof FlexboxLayoutManager.LayoutParams) {
        //            FlexboxLayoutManager.LayoutParams layoutParams = (FlexboxLayoutManager.LayoutParams) lp;
        //            layoutParams.setFlexGrow(1.0f);
        //        }
    }

    private void renderEntity3(BaseViewHolder helper, ActivityListBean data) {
        mIvActivity = helper.getView(R.id.iv_shoot_off_activity);
        mImageLoader.loadImage(mAppComponent.appManager().getCurrentActivity() == null
                        ? mAppComponent.application() : mAppComponent.appManager().getCurrentActivity(),
                ImageConfigImpl
                        .builder()
                        .url(data.getBackgroundImg())
                        .imageView(mIvActivity)
                        .build());

    }
    public void notifyLoading() {
        mHelper.notifyLoadingChanged();
    }

    public void notifyType1(List<ContListBean> itemEntity1s) {
        mHelper.notifyMoudleDataChanged(itemEntity1s, ContListBean.ITEM_TYPE_1);

    }

    public void notifyType2(List<TagListBean> itemEntity1s) {
        mHelper.notifyMoudleDataChanged(itemEntity1s, TagListBean.ITEM_TYPE_2);
    }

    public void notifyType3(List<ActivityListBean> itemEntity1s) {
        mHelper.notifyMoudleDataChanged(itemEntity1s, ActivityListBean.ITEM_TYPE_3);
    }


    @Override
    public void onViewRecycled(BaseViewHolder holder) {
        super.onViewRecycled(holder);
        //        mImageLoader.clear(mAppComponent.application(), ImageConfigImpl.builder()
        //                .imageViews(iv,jcVideoPlayerStandard.thumbImageView,mIvHead,mIvActivity)
        //                .build());
    }
}
