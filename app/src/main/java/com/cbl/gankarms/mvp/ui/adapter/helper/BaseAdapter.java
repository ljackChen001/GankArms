package com.cbl.gankarms.mvp.ui.adapter.helper;

import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.crazysunj.multitypeadapter.helper.RecyclerViewAdapterHelper;

/**
 * Created by chenbaolin on 2017/8/23.
 */

public abstract class BaseAdapter<T extends MutiTypeTitleEntity,
        K extends BaseViewHolder,
        H extends RecyclerViewAdapterHelper<T, BaseAdapter>>
        extends BaseQuickAdapter<T, K> {

    protected H mHelper;

    public BaseAdapter(H helper) {
        super(helper.getData());
        mHelper = helper;
        mHelper.bindAdapter(this);

    }

    @Override
    protected K onCreateDefViewHolder(ViewGroup parent, int viewType) {
        return createBaseViewHolder(parent, mHelper.getLayoutId(viewType));
    }

    @Override
    protected int getDefItemViewType(int position) {
        return mHelper.getItemViewType(position);
    }

    public H getHelper() {
        return mHelper;
    }


}
