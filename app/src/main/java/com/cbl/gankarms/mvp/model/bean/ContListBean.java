package com.cbl.gankarms.mvp.model.bean;

import com.cbl.gankarms.mvp.ui.adapter.helper.MutiTypeTitleEntity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by chenbaolin on 2017/8/24.
 * 普通视频Item bean
 */

public class ContListBean implements Serializable, MutiTypeTitleEntity {
    public static final int ITEM_TYPE_1 = 1;//普通Item
    private String liveStartTime;
    private String isAppoint;
    private String contId;
    private String name;
    private String pic;
    private NodeInfoBean nodeInfo;
    private String link;
    private String linkType;
    private String isVr;
    private String aspectRatio;
    private String cornerLabel;
    private String cornerLabelDesc;
    private String forwordType;
    private String videoType;
    private String duration;
    private String liveStatus;
    private String postHtml;
    private String postId;
    private String commentTimes;
    private String summary;
    private String sharePic;
    private String shareUrl;
    private String praiseTimes;
    private String isFavorited;
    private String adExpMonitorUrl;
    private GeoBean geo;
    private List<TagsBean> tags;
    private List<VideosBean> videos;

    public String getLiveStartTime() {
        return liveStartTime;
    }

    public ContListBean setLiveStartTime(String liveStartTime) {
        this.liveStartTime = liveStartTime;
        return this;
    }

    public String getIsAppoint() {
        return isAppoint;
    }

    public ContListBean setIsAppoint(String isAppoint) {
        this.isAppoint = isAppoint;
        return this;
    }

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

    public String getIsVr() {
        return isVr;
    }

    public void setIsVr(String isVr) {
        this.isVr = isVr;
    }

    public String getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
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

    public String getPostHtml() {
        return postHtml;
    }

    public void setPostHtml(String postHtml) {
        this.postHtml = postHtml;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getCommentTimes() {
        return commentTimes;
    }

    public void setCommentTimes(String commentTimes) {
        this.commentTimes = commentTimes;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSharePic() {
        return sharePic;
    }

    public void setSharePic(String sharePic) {
        this.sharePic = sharePic;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public String getPraiseTimes() {
        return praiseTimes;
    }

    public void setPraiseTimes(String praiseTimes) {
        this.praiseTimes = praiseTimes;
    }

    public String getIsFavorited() {
        return isFavorited;
    }

    public void setIsFavorited(String isFavorited) {
        this.isFavorited = isFavorited;
    }

    public String getAdExpMonitorUrl() {
        return adExpMonitorUrl;
    }

    public void setAdExpMonitorUrl(String adExpMonitorUrl) {
        this.adExpMonitorUrl = adExpMonitorUrl;
    }

    public GeoBean getGeo() {
        return geo;
    }

    public void setGeo(GeoBean geo) {
        this.geo = geo;
    }

    public List<TagsBean> getTags() {
        return tags;
    }

    public void setTags(List<TagsBean> tags) {
        this.tags = tags;
    }

    public List<VideosBean> getVideos() {
        return videos;
    }

    public void setVideos(List<VideosBean> videos) {
        this.videos = videos;
    }

    @Override
    public String getTitle() {
        return name;
    }

    @Override
    public int getItemType() {
        return ITEM_TYPE_1;
    }

    @Override
    public long getId() {
        return Long.parseLong(contId);
    }

    public static class GeoBean {
        /**
         * namePath : 中国,贵州省,黔南布依族苗族自治州,平塘县
         * distance : 603351
         * showName :
         * address : 黔南布依族苗族自治州平塘县
         * loc : 106.98293,25.774156|中国,贵州省,黔南布依族苗族自治州,平塘县
         * placeName : 通州镇
         * longitude : 106.98293
         * latitude : 25.774156
         */

        private String namePath;
        private int distance;
        private String showName;
        private String address;
        private String loc;
        private String placeName;
        private double longitude;
        private double latitude;

        public String getNamePath() {
            return namePath;
        }

        public void setNamePath(String namePath) {
            this.namePath = namePath;
        }

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }

        public String getShowName() {
            return showName;
        }

        public void setShowName(String showName) {
            this.showName = showName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getLoc() {
            return loc;
        }

        public void setLoc(String loc) {
            this.loc = loc;
        }

        public String getPlaceName() {
            return placeName;
        }

        public void setPlaceName(String placeName) {
            this.placeName = placeName;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }
    }

    public static class TagsBean {
        /**
         * tagId : 0
         * name : 内容质量差
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

    public static class VideosBean {
        /**
         * videoId : 10796977
         * url : http://video.pearvideo.com/mp4/short/20170824/cont-1139713-10796956-hd.mp4
         * name :
         * desc :
         * tag : hd
         * format : mp4
         * fileSize : 13382375
         * duration : 89
         */

        private String videoId;
        private String url;
        private String name;
        private String desc;
        private String tag;
        private String format;
        private String fileSize;
        private String duration;

        public String getVideoId() {
            return videoId;
        }

        public void setVideoId(String videoId) {
            this.videoId = videoId;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public String getFileSize() {
            return fileSize;
        }

        public void setFileSize(String fileSize) {
            this.fileSize = fileSize;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }
    }

}
