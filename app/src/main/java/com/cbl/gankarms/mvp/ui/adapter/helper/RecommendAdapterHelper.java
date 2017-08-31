package com.cbl.gankarms.mvp.ui.adapter.helper;

import android.support.v7.util.DiffUtil;

import com.cbl.gankarms.R;
import com.cbl.gankarms.mvp.model.bean.ActivityListBean;
import com.cbl.gankarms.mvp.model.bean.ContListBean;
import com.cbl.gankarms.mvp.model.bean.TagListBean;
import com.crazysunj.multitypeadapter.helper.AsynAdapterHelper;

import java.util.List;

/**
 * Created by chenbaolin on 2017/8/23.
 */

public class RecommendAdapterHelper extends AsynAdapterHelper<MutiTypeTitleEntity, BaseAdapter> {
    public RecommendAdapterHelper() {
        super(null);
    }

    @Override
    protected void registerMoudle() {
        registerMoudle(ContListBean.ITEM_TYPE_1)
                .level(0)
                .headerResId(R.layout.header_common)
                .layoutResId(R.layout.item_recommend_1)
                .loading()
                .loadingLayoutResId(R.layout.loading_recommend_1)
                .register();

        registerMoudle(TagListBean.ITEM_TYPE_2)
                .level(1)
                .headerResId(R.layout.header_common)
                .layoutResId(R.layout.item_recommend_2)
                .register();

        registerMoudle(ActivityListBean.ITEM_TYPE_3)
                .level(2)
                .headerResId(R.layout.header_common)
                .layoutResId(R.layout.item_recommend_3)
                .register();
    }

    @Override
    protected int getPreDataCount() {
        return mAdapter.getHeaderLayoutCount();
    }

    @Override
    protected DiffUtil.Callback getDiffCallBack(List<MutiTypeTitleEntity> oldData, List<MutiTypeTitleEntity> newData) {
        return new TitleDiffCallBack(oldData, newData);
    }

    private static class TitleDiffCallBack extends DiffUtil.Callback {

        private List<MutiTypeTitleEntity> mOldDatas;
        private List<MutiTypeTitleEntity> mNewDatas;

        TitleDiffCallBack(List<MutiTypeTitleEntity> mOldDatas, List<MutiTypeTitleEntity> mNewDatas) {
            this.mOldDatas = mOldDatas;
            this.mNewDatas = mNewDatas;
        }

        @Override
        public int getOldListSize() {
            return mOldDatas == null ? 0 : mOldDatas.size();
        }

        @Override
        public int getNewListSize() {
            return mNewDatas == null ? 0 : mNewDatas.size();
        }

        @Override
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {

            MutiTypeTitleEntity oldItem = mOldDatas.get(oldItemPosition);
            MutiTypeTitleEntity newItem = mNewDatas.get(newItemPosition);
            return !(oldItem == null || newItem == null) && oldItem.getItemType() == newItem.getItemType();
        }

        @Override
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            MutiTypeTitleEntity oldItem = mOldDatas.get(oldItemPosition);
            MutiTypeTitleEntity newItem = mNewDatas.get(newItemPosition);
            return oldItem.getId() == newItem.getId() && oldItem.getTitle().equals(newItem.getTitle());
        }
    }
}
