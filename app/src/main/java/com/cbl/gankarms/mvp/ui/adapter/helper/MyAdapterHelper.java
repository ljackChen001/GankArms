package com.cbl.gankarms.mvp.ui.adapter.helper;

import com.crazysunj.multitypeadapter.helper.AsynAdapterHelper;

import java.util.List;

/**
 * Created by chenbaolin on 2017/8/23.
 */

public class MyAdapterHelper extends AsynAdapterHelper<MutiTypeTitleEntity, BaseAdapter> {
    public MyAdapterHelper(List<MutiTypeTitleEntity> data) {
        super(data);
    }

    @Override
    protected void registerMoudle() {

    }
}
