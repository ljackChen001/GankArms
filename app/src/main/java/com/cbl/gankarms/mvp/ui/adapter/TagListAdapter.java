package com.cbl.gankarms.mvp.ui.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cbl.gankarms.R;
import com.cbl.gankarms.mvp.model.bean.TagListBean;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.android.flexbox.FlexboxLayoutManager;

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
        TextView tag=holder.getView(R.id.tv_hot_tag);
        tag.setText(item.getName());
        ViewGroup.LayoutParams lp = tag.getLayoutParams();
        if(lp instanceof FlexboxLayoutManager.LayoutParams){
            FlexboxLayoutManager.LayoutParams layoutParams = (FlexboxLayoutManager.LayoutParams) lp;
            layoutParams.setFlexGrow(1.0f);
        }
    }

}
