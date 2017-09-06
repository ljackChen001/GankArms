package com.cbl.gankarms.mvp.model.bean;

/**
 * Created by chenbaolin on 2017/9/1.
 */

public class HotListBean {

    /**
     * contId : 1144250
     * name : 邓超晒照求长胖，明星、网友来支招
     * pic : http://image.pearvideo.com/cont/20170830/cont-1144250-10557516.jpg
     * nodeInfo : {"nodeId":"1547","name":"娱乐扒分饱","logoImg":"http://image.pearvideo.com/node/1547-10522935-logo.png"}
     * link : http://
     * linkType : 0
     * cornerLabel :
     * cornerLabelDesc :
     * forwordType : 1
     * videoType : 1
     * duration : 01'33"
     * liveStatus :
     * liveStartTime :
     * isAppoint : 0
     * praiseTimes : 85
     */

    private String contId;
    private String name;
    private String pic;
    private NodeInfoBean nodeInfo;
    private String link;
    private String linkType;
    private String cornerLabel;
    private String cornerLabelDesc;
    private String forwordType;
    private String videoType;
    private String duration;
    private String liveStatus;
    private String liveStartTime;
    private String isAppoint;
    private String praiseTimes;

    public String getContId() {
        return contId;
    }

    public void setContId(String contId) {
        this.contId = contId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public NodeInfoBean getNodeInfo() {
        return nodeInfo;
    }

    public void setNodeInfo(NodeInfoBean nodeInfo) {
        this.nodeInfo = nodeInfo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLinkType() {
        return linkType;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType;
    }

    public String getCornerLabel() {
        return cornerLabel;
    }

    public void setCornerLabel(String cornerLabel) {
        this.cornerLabel = cornerLabel;
    }

    public String getCornerLabelDesc() {
        return cornerLabelDesc;
    }

    public void setCornerLabelDesc(String cornerLabelDesc) {
        this.cornerLabelDesc = cornerLabelDesc;
    }

    public String getForwordType() {
        return forwordType;
    }

    public void setForwordType(String forwordType) {
        this.forwordType = forwordType;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLiveStatus() {
        return liveStatus;
    }

    public void setLiveStatus(String liveStatus) {
        this.liveStatus = liveStatus;
    }

    public String getLiveStartTime() {
        return liveStartTime;
    }

    public void setLiveStartTime(String liveStartTime) {
        this.liveStartTime = liveStartTime;
    }

    public String getIsAppoint() {
        return isAppoint;
    }

    public void setIsAppoint(String isAppoint) {
        this.isAppoint = isAppoint;
    }

    public String getPraiseTimes() {
        return praiseTimes;
    }

    public void setPraiseTimes(String praiseTimes) {
        this.praiseTimes = praiseTimes;
    }

    public static class NodeInfoBean {
        /**
         * nodeId : 1547
         * name : 娱乐扒分饱
         * logoImg : http://image.pearvideo.com/node/1547-10522935-logo.png
         */

        private String nodeId;
        private String name;
        private String logoImg;

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
    }

}
