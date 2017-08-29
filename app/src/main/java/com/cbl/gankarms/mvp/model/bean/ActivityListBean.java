package com.cbl.gankarms.mvp.model.bean;

import com.cbl.gankarms.mvp.ui.adapter.helper.MutiTypeTitleEntity;

import java.io.Serializable;

/**
 * Created by chenbaolin on 2017/8/25.
 * 全民拍客活动bean
 */

public class ActivityListBean implements Serializable, MutiTypeTitleEntity {
    public static final int ITEM_TYPE_3 = 3;//活动
    /**
     * activityId : 42
     * name : 你的窗景 Your Views
     * runStatus : 0
     * backgroundImg : http://imageugc2.pearvideo.com/activity/20170815/42-bg-141236.png
     * beginTime : 2017.8.18
     * endTime : 2017.8.28
     */

    private String activityId;
    private String name;
    private String runStatus;
    private String backgroundImg;
    private String beginTime;
    private String endTime;

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(String runStatus) {
        this.runStatus = runStatus;
    }

    public String getBackgroundImg() {
        return backgroundImg;
    }

    public void setBackgroundImg(String backgroundImg) {
        this.backgroundImg = backgroundImg;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public int getItemType() {
        return ITEM_TYPE_3;
    }

    @Override
    public long getId() {
        return 0;
    }
}
