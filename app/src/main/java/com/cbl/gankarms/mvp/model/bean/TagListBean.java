package com.cbl.gankarms.mvp.model.bean;

import java.io.Serializable;

/**
 * Created by chenbaolin on 2017/8/25.
 * 热门标签Bean
 */

public class TagListBean implements Serializable {

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

}
