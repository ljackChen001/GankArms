package com.cbl.gankarms.mvp.model.bean;

import com.cbl.gankarms.mvp.ui.adapter.helper.MutiTypeTitleEntity;

import java.io.Serializable;

/**
 * Created by chenbaolin on 2017/8/25.
 * 热门标签Bean
 */

public class TagListBean implements Serializable, MutiTypeTitleEntity {
    public static final int ITEM_TYPE_2 = 2;//热门标签

    /**
     * tagId : 3257
     * name : 星座
     */

    private String tagId;
    private String name;

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int getItemType() {
        return ITEM_TYPE_2;
    }

    @Override
    public long getId() {
        return Long.parseLong(tagId);
    }

    @Override
    public String getTitle() {
        return name;
    }
}
