package com.cbl.gankarms.mvp.model.bean;

import com.cbl.gankarms.mvp.ui.adapter.helper.MutiTypeTitleEntity;
import com.crazysunj.multitypeadapter.helper.RecyclerViewAdapterHelper;

/**
 * author: sunjian
 * created on: 2017/8/6 下午5:08
 * description:
 */

public class CommonHeadBean implements MutiTypeTitleEntity {

    private String title;
    private int type;
    private long id;

    public CommonHeadBean(String title, int type) {
        this.title = title;
        this.type = type - RecyclerViewAdapterHelper.HEADER_TYPE_DIFFER;
        this.id = System.currentTimeMillis();
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getItemType() {
        return type;
    }

    @Override
    public long getId() {
        return id;
    }
}
