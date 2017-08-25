package com.cbl.gankarms.mvp.model.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by chenbaolin on 2017/8/24.
 */

public class DataListBean implements Serializable {

    /**
     * nodeType : 13
     * contList : [{"contId":"1139713","name":"小偷夜盗超市遭店主追打，下跪求饶","pic":"http://image.pearvideo
     * .com/cont/20170824/cont-1139713-10541397.png","nodeInfo":{"nodeId":"25","name":"一手Video",
     * "logoImg":"http://image.pearvideo.com/node/25-10027890-logo.jpg","isOrder":"0"},"link":"http://",
     * "linkType":"0","isVr":"0","aspectRatio":"0","cornerLabel":"3","cornerLabelDesc":"独播","forwordType":"1",
     * "videoType":"1","duration":"01'29\"","liveStatus":"","postHtml":"http://app.pearvideo.com/clt/page/v3/post
     * .jsp?postId=1114294&contId=1139713","postId":"1114294","commentTimes":"12",
     * "summary":"贵州平塘，一小偷多次从天花板夹缝潜入超市盗窃。店主发现留在墙上的脚印后，连续蹲守2晚，小偷再次光顾，被手持棍棒的老板追打擒获，最后下跪求饶。",
     * "sharePic":"http://image2.pearvideo.com/cont/20170824/cont-1139713-10541399.png","shareUrl":"http://www
     * .pearvideo.com/detail_1139713","tags":[{"tagId":"0","name":"内容质量差"},{"tagId":"1158","name":"下跪"},
     * {"tagId":"1269","name":"小偷"}],"videos":[{"videoId":"10796977","url":"http://video.pearvideo
     * .com/mp4/short/20170824/cont-1139713-10796956-hd.mp4","name":"","desc":"","tag":"hd","format":"mp4",
     * "fileSize":"13382375","duration":"89"},{"videoId":"10796976","url":"http://video.pearvideo
     * .com/mp4/short/20170824/cont-1139713-10796956-sd.mp4","name":"","desc":"","tag":"sd","format":"mp4",
     * "fileSize":"7239962","duration":"89"},{"videoId":"10796975","url":"http://video.pearvideo
     * .com/mp4/short/20170824/cont-1139713-10796956-fhd.mp4","name":"","desc":"","tag":"fhd","format":"mp4",
     * "fileSize":"24455535","duration":"89"},{"videoId":"10796974","url":"http://video.pearvideo
     * .com/mp4/short/20170824/cont-1139713-10796956-ld.mp4","name":"","desc":"","tag":"ld","format":"mp4",
     * "fileSize":"4108431","duration":"89"}],"praiseTimes":"18","isFavorited":"0","adExpMonitorUrl":"",
     * "geo":{"namePath":"中国,贵州省,黔南布依族苗族自治州,平塘县","distance":603351,"showName":"","address":"黔南布依族苗族自治州平塘县",
     * "loc":"106.98293,25.774156|中国,贵州省,黔南布依族苗族自治州,平塘县","placeName":"通州镇","longitude":106.98293,"latitude":25.774156}}]
     * nodeName : 硬广插入位置
     * moreId : 18
     * nodeLogo :
     * tagList : [{"tagId":"3257","name":"星座"},{"tagId":"3153","name":"环卫工人"},{"tagId":"42665","name":"点开辣眼睛的料理"},
     * {"tagId":"41548","name":"爆笑集锦"},{"tagId":"18863","name":"洋快餐"},{"tagId":"27","name":"人工智能"},{"tagId":"9",
     * "name":"中国足球"},{"tagId":"665","name":"股市"},{"tagId":"2253","name":"豪车"},{"tagId":"34424","name":"新知一周精选视频"},
     * {"tagId":"6377","name":"用心生活，反抗焦虑"},{"tagId":"30796","name":"有妖气动画"}]
     * activityList : [{"activityId":"42","name":"你的窗景 Your Views","runStatus":"0",
     * "backgroundImg":"http://imageugc2.pearvideo.com/activity/20170815/42-bg-141236.png","beginTime":"2017.8.18",
     * "endTime":"2017.8.28"},{"activityId":"40","name":"我的读书日记","runStatus":"1",
     * "backgroundImg":"http://imageugc2.pearvideo.com/activity/20170813/40-bg-094930.png","beginTime":"2017.8.11",
     * "endTime":"2017.8.21"},{"activityId":"37","name":"我和麦当劳的故事","runStatus":"0","backgroundImg":"http://imageugc
     * .pearvideo.com/activity/20170724/37-bg-110039.png","beginTime":"2017.7.26","endTime":"2017.9.6"},
     * {"activityId":"19","name":"全民开拍啦","runStatus":"0","backgroundImg":"http://imageugc1.pearvideo
     * .com/activity/20170616/19-bg-192200.png","beginTime":"2017.6.16","endTime":"2017.8.31"}]
     */

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




}
