package com.cbl.gankarms.mvp.model.bean;

import com.cbl.gankarms.app.Constants;
import com.cbl.gankarms.mvp.ui.adapter.helper.MutiTypeTitleEntity;

/**
 * Created by chenbaolin on 2017/8/28.
 */

public class LoadingEntity implements MutiTypeTitleEntity {

    private int type;
    private long id;

    public LoadingEntity(int type, long id) {
        this.type = type;
        this.id = id;
    }

    @Override
    public String getTitle() {
        return Constants.EMPTY;
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
