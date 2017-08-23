package com.cbl.gankarms.mvp.ui.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.cbl.gankarms.R;
import com.cbl.gankarms.mvp.model.bean.RecommendBean;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

/**
 * Created by chenbaolin on 2017/8/23.
 */

public class ContListAdapter extends BaseQuickAdapter<RecommendBean.DataListBean, BaseViewHolder> {
    public ContListAdapter(@LayoutRes int layoutResId, @Nullable List<RecommendBean.DataListBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder holder, RecommendBean.DataListBean item) {
        holder.setText(R.id.tv, item.getNodeType());
        JCVideoPlayerStandard jcVideoPlayerStandard = holder.getView(R.id.video_player);
        jcVideoPlayerStandard.setUp("http://video.pearvideo.com/mp4/short/20170823/cont-1138478-10791671-hd.mp4"
                , JCVideoPlayerStandard.SCREEN_LAYOUT_NORMAL, "嫂子闭眼睛");
    }
}
