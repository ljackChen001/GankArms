package com.cbl.gankarms.mvp.model.bean;

import java.io.Serializable;

/**
 * Created by chenbaolin on 2017/8/31.
 */

public class NodeInfoBean implements Serializable{

    /**
     * nodeId : 25
     * name : 一手Video
     * logoImg : http://image.pearvideo.com/node/25-10027890-logo.jpg
     * isOrder : 0
     */

    private String nodeId;
    private String name;
    private String logoImg;
    private String isOrder;

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoImg() {
        return logoImg;
    }

    public void setLogoImg(String logoImg) {
        this.logoImg = logoImg;
    }

    public String getIsOrder() {
        return isOrder;
    }

    public void setIsOrder(String isOrder) {
        this.isOrder = isOrder;
    }

}
