package com.cbl.gankarms.mvp.model.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by chenbaolin on 2017/8/31.
 */

public class SimilarListBean implements Serializable {


    private String resultCode;
    private String resultMsg;
    private String reqId;
    private String systemTime;
    private CategoryInfoBean categoryInfo;
    private String nextUrl;
    private List<AreaListBean> areaList;
    private List<HotListBean> hotList;
    private List<HotTagListBean> hotTagList;
    private List<ContListBean> contList;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getSystemTime() {
        return systemTime;
    }

    public void setSystemTime(String systemTime) {
        this.systemTime = systemTime;
    }

    public CategoryInfoBean getCategoryInfo() {
        return categoryInfo;
    }

    public void setCategoryInfo(CategoryInfoBean categoryInfo) {
        this.categoryInfo = categoryInfo;
    }

    public String getNextUrl() {
        return nextUrl;
    }

    public void setNextUrl(String nextUrl) {
        this.nextUrl = nextUrl;
    }

    public List<AreaListBean> getAreaList() {
        return areaList;
    }

    public void setAreaList(List<AreaListBean> areaList) {
        this.areaList = areaList;
    }

    public List<HotListBean> getHotList() {
        return hotList;
    }

    public void setHotList(List<HotListBean> hotList) {
        this.hotList = hotList;
    }

    public List<HotTagListBean> getHotTagList() {
        return hotTagList;
    }

    public void setHotTagList(List<HotTagListBean> hotTagList) {
        this.hotTagList = hotTagList;
    }

    public List<ContListBean> getContList() {
        return contList;
    }

    public void setContList(List<ContListBean> contList) {
        this.contList = contList;
    }

    public static class CategoryInfoBean {
        /**
         * categoryId : 4
         * name : 娱乐
         * color : #E966AE
         */

        private String categoryId;
        private String name;
        private String color;

        public String getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(String categoryId) {
            this.categoryId = categoryId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }


    public static class HotListBean {
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

    public static class HotTagListBean {
        /**
         * tagId : 43475
         * name : 想把我唱给你听
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

    public static class ContListBean {
        /**
         * contId : 1145244
         * name : 爱心满满！林心如为残障儿童发声
         * pic : http://image2.pearvideo.com/cont/20170831/cont-1145244-10560200.png
         * nodeInfo : {"nodeId":"1","name":"犀牛视频","logoImg":"http://image.pearvideo.com/node/1-10027911-logo.jpg"}
         * link : http://
         * linkType : 0
         * cornerLabel : 5
         * cornerLabelDesc : 推荐
         * forwordType : 1
         * videoType : 1
         * duration : 02'16"
         * liveStatus :
         * liveStartTime :
         * isAppoint : 0
         * praiseTimes : 125
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


    }
}
