package com.cbl.gankarms.mvp.model.bean;

import com.cbl.gankarms.mvp.ui.adapter.helper.MutiTypeTitleEntity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by chenbaolin on 2017/8/24.
 */

public class DataListBean implements Serializable ,MutiTypeTitleEntity{
    private String nodeType;
    private String nodeName;
    private String moreId;
    private String nodeLogo;
    private List<ContListBean> contList;
    private List<TagListBean> tagList;
    private List<ActivityListBean> activityList;

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getMoreId() {
        return moreId;
    }

    public void setMoreId(String moreId) {
        this.moreId = moreId;
    }

    public String getNodeLogo() {
        return nodeLogo;
    }

    public void setNodeLogo(String nodeLogo) {
        this.nodeLogo = nodeLogo;
    }

    public List<ContListBean> getContList() {
        return contList;
    }

    public void setContList(List<ContListBean> contList) {
        this.contList = contList;
    }

    public List<TagListBean> getTagList() {
        return tagList;
    }

    public void setTagList(List<TagListBean> tagList) {
        this.tagList = tagList;
    }

    public List<ActivityListBean> getActivityList() {
        return activityList;
    }

    public void setActivityList(List<ActivityListBean> activityList) {
        this.activityList = activityList;
    }

    @Override
    public String getTitle() {
        return nodeName;
    }

    @Override
    public int getItemType() {
        return ActivityListBean.ITEM_TYPE_3;
    }

    @Override
    public long getId() {
        return Long.parseLong(nodeType);
    }


    //
    //    @Override
    //    public int getItemType() {
    //        if (nodeType!=null) {
    //            if (nodeType.equals("13")) {//普通视频
    //                return TYPE_1;
    //            } else if (nodeType.equals("2")) {
    //                return TYPE_2;
    //            } else if (nodeType.equals("12")) {//拍客活动
    //                return TYPE_3;
    //            } else if (nodeType.equals("4")) {
    //                return TYPE_4;
    //            } else if (nodeType.equals("11")) {//广告
    //                return TYPE_5;
    //            } else if (nodeType.equals("14")) {//热门标签
    //                return TYPE_6;
    //            }
    //        }
    //        return TYPE_4;
    //    }


}
