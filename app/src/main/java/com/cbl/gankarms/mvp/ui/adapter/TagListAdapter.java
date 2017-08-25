package com.cbl.gankarms.mvp.ui.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.cbl.gankarms.R;
import com.cbl.gankarms.mvp.model.bean.TagListBean;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by chenbaolin on 2017/8/25.
 */

public class TagListAdapter extends BaseQuickAdapter<TagListBean, BaseViewHolder> {
    public TagListAdapter(@LayoutRes int layoutResId, @Nullable List<TagListBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder holder, TagListBean item) {
        holder.setText(R.id.tv_hot_tag, item.getName());
    }
}
