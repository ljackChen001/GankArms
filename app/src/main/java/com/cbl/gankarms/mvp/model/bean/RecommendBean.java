package com.cbl.gankarms.mvp.model.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by chenbaolin on 2017/8/23.
 */

public class RecommendBean implements Serializable {

    /**
     * resultCode : 1
     * resultMsg : success
     * reqId : 19f176e4-6b90-470c-a573-0591b157d021
     * systemTime : 1503466654980
     * nextUrl : http://app.pearvideo.com/clt/jsp/v3/getVodConts.jsp?isHome=1&channelCode=&start=50
     * areaList : [{"area_id":"103001","expInfo":{"algorighm_exp_id":"4100","front_exp_id":"0",
     * "s_value":"19f176e4-6b90-470c-a573-0591b157d021_13401501140618831"}}]
     * dataList : [{"nodeType":"13","contList":[{"contId":"1137478","name":"他为共享电动车\"充电\"，一晚500辆",
     * "pic":"http://image1.pearvideo.com/cont/20170822/cont-1137478-10533661.jpeg","nodeInfo":{"nodeId":"1232",
     * "name":"梨上海","logoImg":"http://image2.pearvideo.com/node/1232-10425806-logo.png","isOrder":"0"},"link":"http://",
     * "linkType":"0","isVr":"0","aspectRatio":"0","cornerLabel":"3","cornerLabelDesc":"独播","forwordType":"1",
     * "videoType":"1","duration":"00'39\"","liveStatus":"","postHtml":"http://app.pearvideo.com/clt/page/v3/post
     * .jsp?postId=1112367&contId=1137478","postId":"1112367","commentTimes":"0",
     * "summary":"共享电动车已遍布上海，成了很多人的出行必备。但不同于单车，电动车需要更换电瓶。深夜11点，我们在街头遇到了一位更换电瓶的工作人员。","sharePic":"http://image2.pearvideo
     * .com/cont/20170822/cont-1137478-10533662.jpeg","shareUrl":"http://www.pearvideo.com/detail_1137478",
     * "tags":[{"tagId":"0","name":"内容质量差"},{"tagId":"1094","name":"上海"},{"tagId":"1143","name":"工作"}],
     * "videos":[{"videoId":"10785088","url":"http://video.pearvideo.com/mp4/short/20170822/cont-1137478-10785075-hd.mp4",
     * "name":"","desc":"","tag":"hd","format":"mp4","fileSize":"6917588","duration":"39"},{"videoId":"10785087",
     * "url":"http://video.pearvideo.com/mp4/short/20170822/cont-1137478-10785075-ld.mp4","name":"","desc":"","tag":"ld",
     * "format":"mp4","fileSize":"1977113","duration":"39"},{"videoId":"10785086","url":"http://video.pearvideo
     * .com/mp4/short/20170822/cont-1137478-10785075-fhd.mp4","name":"","desc":"","tag":"fhd","format":"mp4",
     * "fileSize":"15905074","duration":"39"},{"videoId":"10785085","url":"http://video.pearvideo
     * .com/mp4/short/20170822/cont-1137478-10785075-sd.mp4","name":"","desc":"","tag":"sd","format":"mp4",
     * "fileSize":"3454568","duration":"39"}],"praiseTimes":"60","isFavorited":"0","adExpMonitorUrl":"",
     * "geo":{"namePath":"中国,上海市,上海市,徐汇区","distance":1.2967744E7,"showName":"","address":"地铁9号线","loc":"121.424982,
     * 31.181001|中国,上海市,上海市,徐汇区","placeName":"桂林路","longitude":121.424982,"latitude":31.181001}}]},{"nodeType":"13",
     * "contList":[{"contId":"1137267","name":"女子被恐怖片吓坏，倒地上尖叫自残","pic":"http://image.pearvideo
     * .com/cont/20170822/cont-1137267-10532928.png","nodeInfo":{"nodeId":"35","name":"OMG!",
     * "logoImg":"http://image2.pearvideo.com/node/35-10030502-logo.jpg","isOrder":"0"},"link":"http://","linkType":"0",
     * "isVr":"0","aspectRatio":"0","cornerLabel":"","cornerLabelDesc":"","forwordType":"1","videoType":"1",
     * "duration":"00'35\"","liveStatus":"","postHtml":"http://app.pearvideo.com/clt/page/v3/post
     * .jsp?postId=1112200&contId=1137267","postId":"1112200","commentTimes":"0",
     * "summary":"8月18日在巴西特雷西纳，一女子刚看完午夜场恐怖片《安娜贝尔2》后，倒在影院门口大叫，自己打自己，疑似受惊过度。","sharePic":"http://image1.pearvideo
     * .com/cont/20170822/cont-1137267-10532929.png","shareUrl":"http://www.pearvideo.com/detail_1137267",
     * "tags":[{"tagId":"0","name":"内容质量差"},{"tagId":"277","name":"巴西"},{"tagId":"377","name":"恐怖片"}],
     * "videos":[{"videoId":"10783552","url":"http://video.pearvideo.com/mp4/short/20170822/cont-1137267-10783547-ld.mp4",
     * "name":"","desc":"","tag":"ld","format":"mp4","fileSize":"1104003","duration":"35"},{"videoId":"10783551",
     * "url":"http://video.pearvideo.com/mp4/short/20170822/cont-1137267-10783547-hd.mp4","name":"","desc":"","tag":"hd",
     * "format":"mp4","fileSize":"3150545","duration":"35"},{"videoId":"10783550","url":"http://video.pearvideo
     * .com/mp4/short/20170822/cont-1137267-10783547-sd.mp4","name":"","desc":"","tag":"sd","format":"mp4",
     * "fileSize":"1799713","duration":"35"},{"videoId":"10783549","url":"http://video.pearvideo
     * .com/mp4/short/20170822/cont-1137267-10783547-fhd.mp4","name":"","desc":"","tag":"fhd","format":"mp4",
     * "fileSize":"6297698","duration":"35"}],"praiseTimes":"198","isFavorited":"0","adExpMonitorUrl":"",
     * "geo":{"namePath":"巴西","distance":-1,"showName":"","address":"","loc":"0.0,0.0|巴西","placeName":"","longitude":0,
     * "latitude":0}}]},{"nodeType":"13","contList":[{"contId":"1134597","name":"活在朋友圈里的\u201c圣男圣女\u201d！",
     * "pic":"http://image.pearvideo.com/cont/20170821/cont-1134597-10532412.png","nodeInfo":{"nodeId":"1520",
     * "name":"陈翔六点半","logoImg":"http://image.pearvideo.com/node/1520-10511397-logo.png","isOrder":"0"},"link":"http://",
     * "linkType":"0","isVr":"0","aspectRatio":"0","cornerLabel":"","cornerLabelDesc":"","forwordType":"1",
     * "videoType":"1","duration":"03'22\"","liveStatus":"","postHtml":"http://app.pearvideo.com/clt/page/v3/post
     * .jsp?postId=1112097&contId=1134597","postId":"1112097","commentTimes":"2",
     * "summary":"朋友圈的小骗子，你还有两幅面孔！简单点，朋友圈里的我们简单点！做人不带面具，交往不玩心计！看到未必真实，别活在别人眼里！","sharePic":"http://image1.pearvideo
     * .com/cont/20170821/cont-1134597-10532413.png","shareUrl":"http://www.pearvideo.com/detail_1134597",
     * "tags":[{"tagId":"0","name":"内容质量差"},{"tagId":"722","name":"搞笑"},{"tagId":"1139","name":"喜剧"}],
     * "videos":[{"videoId":"10768952","url":"http://video.pearvideo.com/mp4/third/20170818/10342995_110406-hd.mp4",
     * "name":"","desc":"","tag":"hd","format":"mp4","fileSize":"38338166","duration":"202"},{"videoId":"10768951",
     * "url":"http://video.pearvideo.com/mp4/third/20170818/10342995_110406-ld.mp4","name":"","desc":"","tag":"ld",
     * "format":"mp4","fileSize":"9559280","duration":"202"},{"videoId":"10768950","url":"http://video.pearvideo
     * .com/mp4/third/20170818/10342995_110406-sd.mp4","name":"","desc":"","tag":"sd","format":"mp4",
     * "fileSize":"16351552","duration":"202"}],"praiseTimes":"75","isFavorited":"0","adExpMonitorUrl":"",
     * "geo":{"namePath":"中国","distance":-1,"showName":"","address":"","loc":"0.0,0.0|中国","placeName":"","longitude":0,
     * "latitude":0}}]},{"nodeType":"13","contList":[{"contId":"1135869","name":"歪果美女挑战制作兰州牛肉面！",
     * "pic":"http://image2.pearvideo.com/cont/20170820/cont-1135869-10528091.jpg","nodeInfo":{"nodeId":"42",
     * "name":"西游中国","logoImg":"http://image.pearvideo.com/node/42-10030911-logo.jpg","isOrder":"0"},"link":"http://",
     * "linkType":"0","isVr":"0","aspectRatio":"0","cornerLabel":"","cornerLabelDesc":"","forwordType":"1",
     * "videoType":"1","duration":"02'38\"","liveStatus":"","postHtml":"http://app.pearvideo.com/clt/page/v3/post
     * .jsp?postId=1110982&contId=1135869","postId":"1110982","commentTimes":"3","summary":"主持人爱咔：(胸有成竹)
     * 我拉的这面它又长又\u2026\u2026（断了） ，放毒时刻到，请自备防毒面具。","sharePic":"http://image1.pearvideo
     * .com/cont/20170820/cont-1135869-10527991.jpg","shareUrl":"http://www.pearvideo.com/detail_1135869",
     * "tags":[{"tagId":"0","name":"内容质量差"},{"tagId":"710","name":"美女"},{"tagId":"1862","name":"兰州"}],
     * "videos":[{"videoId":"10775830","url":"http://video.pearvideo.com/mp4/third/20170820/cont-1135869-10775825-hd.mp4",
     * "name":"","desc":"","tag":"hd","format":"mp4","fileSize":"23043535","duration":"158"},{"videoId":"10775829",
     * "url":"http://video.pearvideo.com/mp4/third/20170820/cont-1135869-10775825-fhd.mp4","name":"","desc":"",
     * "tag":"fhd","format":"mp4","fileSize":"42973810","duration":"158"},{"videoId":"10775828","url":"http://video
     * .pearvideo.com/mp4/third/20170820/cont-1135869-10775825-sd.mp4","name":"","desc":"","tag":"sd","format":"mp4",
     * "fileSize":"12985631","duration":"158"},{"videoId":"10775827","url":"http://video.pearvideo
     * .com/mp4/third/20170820/cont-1135869-10775825-ld.mp4","name":"","desc":"","tag":"ld","format":"mp4",
     * "fileSize":"7772889","duration":"158"}],"praiseTimes":"591","isFavorited":"0","adExpMonitorUrl":"",
     * "geo":{"namePath":"中国","distance":-1,"showName":"","address":"","loc":"0.0,0.0|中国","placeName":"","longitude":0,
     * "latitude":0}}]},{"nodeType":"13","contList":[{"contId":"1137929","name":"小伙直播弹唱，拾荒大爷戴假发伴舞","pic":"http://image
     * .pearvideo.com/cont/20170822/cont-1137929-10535103.png","nodeInfo":{"nodeId":"25","name":"一手Video",
     * "logoImg":"http://image.pearvideo.com/node/25-10027890-logo.jpg","isOrder":"0"},"link":"http://","linkType":"0",
     * "isVr":"0","aspectRatio":"0","cornerLabel":"3","cornerLabelDesc":"独播","forwordType":"1","videoType":"1",
     * "duration":"00'58\"","liveStatus":"","postHtml":"http://app.pearvideo.com/clt/page/v3/post
     * .jsp?postId=1112751&contId=1137929","postId":"1112751","commentTimes":"1",
     * "summary":"吉林长春，一拾荒大叔戴着假发摇着扇，为一位酷爱音乐、直播弹唱的外卖小伙伴舞捧场。大叔御下假发称，小伙每天骑电动车老远赶来，在这弹唱有3年了。",
     * "sharePic":"http://image1.pearvideo.com/cont/20170822/cont-1137929-10535104.png","shareUrl":"http://www.pearvideo
     * .com/detail_1137929","tags":[{"tagId":"0","name":"内容质量差"},{"tagId":"671","name":"直播"},{"tagId":"1091",
     * "name":"吉林"}],"videos":[{"videoId":"10787080","url":"http://video.pearvideo
     * .com/mp4/short/20170822/cont-1137929-10787062-sd.mp4","name":"","desc":"","tag":"sd","format":"mp4",
     * "fileSize":"7260233","duration":"58"},{"videoId":"10787079","url":"http://video.pearvideo
     * .com/mp4/short/20170822/cont-1137929-10787062-ld.mp4","name":"","desc":"","tag":"ld","format":"mp4",
     * "fileSize":"3966387","duration":"58"},{"videoId":"10787078","url":"http://video.pearvideo
     * .com/mp4/short/20170822/cont-1137929-10787062-hd.mp4","name":"","desc":"","tag":"hd","format":"mp4",
     * "fileSize":"14203080","duration":"58"},{"videoId":"10787077","url":"http://video.pearvideo
     * .com/mp4/short/20170822/cont-1137929-10787062-fhd.mp4","name":"","desc":"","tag":"fhd","format":"mp4",
     * "fileSize":"26988332","duration":"58"}],"praiseTimes":"115","isFavorited":"0","adExpMonitorUrl":"",
     * "geo":{"namePath":"中国,吉林省,长春市,南关区","distance":1.2760446E7,"showName":"","address":"清明街西二胡同与重庆路交叉口东100米",
     * "loc":"125.333493,43.896862|中国,吉林省,长春市,南关区","placeName":"重庆路步行街","longitude":125.333493,"latitude":43.896862}}]},
     * {"nodeType":"13","contList":[{"contId":"1137972","name":"重庆一梯道长200米:妹子爬完腿直抖","pic":"http://image.pearvideo
     * .com/cont/20170822/cont-1137972-10535319.png","nodeInfo":{"nodeId":"69","name":"奇天下",
     * "logoImg":"http://image1.pearvideo.com/node/69-10047961-logo.jpg","isOrder":"0"},"link":"http://","linkType":"0",
     * "isVr":"0","aspectRatio":"0","cornerLabel":"5","cornerLabelDesc":"推荐","forwordType":"1","videoType":"1",
     * "duration":"00'47\"","liveStatus":"","postHtml":"http://app.pearvideo.com/clt/page/v3/post
     * .jsp?postId=1112791&contId=1137972","postId":"1112791","commentTimes":"2",
     * "summary":"重庆渝中区，千厮门梯道直达嘉陵江边，全长约200米，宽约6米，分新旧两段，共12层395级，市民可以便捷地回味老重庆的码头文化。","sharePic":"http://image1.pearvideo
     * .com/cont/20170822/cont-1137972-10535320.png","shareUrl":"http://www.pearvideo.com/detail_1137972",
     * "tags":[{"tagId":"0","name":"内容质量差"},{"tagId":"973","name":"重庆"},{"tagId":"17964","name":"嘉陵江"}],
     * "videos":[{"videoId":"10787330","url":"http://video.pearvideo.com/mp4/short/20170822/cont-1137972-10787317-hd.mp4",
     * "name":"","desc":"","tag":"hd","format":"mp4","fileSize":"7759061","duration":"47"},{"videoId":"10787329",
     * "url":"http://video.pearvideo.com/mp4/short/20170822/cont-1137972-10787317-fhd.mp4","name":"","desc":"",
     * "tag":"fhd","format":"mp4","fileSize":"15847978","duration":"47"},{"videoId":"10787328","url":"http://video
     * .pearvideo.com/mp4/short/20170822/cont-1137972-10787317-ld.mp4","name":"","desc":"","tag":"ld","format":"mp4",
     * "fileSize":"2282054","duration":"47"},{"videoId":"10787327","url":"http://video.pearvideo
     * .com/mp4/short/20170822/cont-1137972-10787317-sd.mp4","name":"","desc":"","tag":"sd","format":"mp4",
     * "fileSize":"4022609","duration":"47"}],"praiseTimes":"149","isFavorited":"0","adExpMonitorUrl":"",
     * "geo":{"namePath":"中国,重庆市,重庆市,渝中区","distance":1.1618645E7,"showName":"","address":"重庆市渝中区","loc":"106.583136,
     * 29.576282|中国,重庆市,重庆市,渝中区","placeName":"千厮门大桥","longitude":106.583136,"latitude":29.576282}}]},{"nodeType":"13",
     * "contList":[{"contId":"1136617","name":"给我一个套路，我能吃垮一生幸福！","pic":"http://image2.pearvideo
     * .com/main/20170821/10342995-145618-0.png","nodeInfo":{"nodeId":"1520","name":"陈翔六点半","logoImg":"http://image
     * .pearvideo.com/node/1520-10511397-logo.png","isOrder":"0"},"link":"http://","linkType":"0","isVr":"0",
     * "aspectRatio":"0","cornerLabel":"","cornerLabelDesc":"","forwordType":"1","videoType":"1","duration":"04'56\"",
     * "liveStatus":"","postHtml":"http://app.pearvideo.com/clt/page/v3/post.jsp?postId=1112102&contId=1136617",
     * "postId":"1112102","commentTimes":"2","summary":"关于吃货的终极探索！要死就死在饭桌上！幸福一步到胃，吃货问心有愧！套路欲求不满，吃货何其勇敢！胃大无脑的生存法则！",
     * "sharePic":"http://image2.pearvideo.com/cont/20170821/cont-1136617-10531568.JPG","shareUrl":"http://www.pearvideo
     * .com/detail_1136617","tags":[{"tagId":"0","name":"内容质量差"},{"tagId":"36949","name":"人生观"},{"tagId":"8271",
     * "name":"人生"}],"videos":[{"videoId":"10779893","url":"http://video.pearvideo
     * .com/mp4/third/20170821/10342995_145558-ld.mp4","name":"","desc":"","tag":"ld","format":"mp4",
     * "fileSize":"13465878","duration":"296"},{"videoId":"10779892","url":"http://video.pearvideo
     * .com/mp4/third/20170821/10342995_145558-hd.mp4","name":"","desc":"","tag":"hd","format":"mp4",
     * "fileSize":"49275629","duration":"296"},{"videoId":"10779891","url":"http://video.pearvideo
     * .com/mp4/third/20170821/10342995_145558-sd.mp4","name":"","desc":"","tag":"sd","format":"mp4",
     * "fileSize":"22234596","duration":"296"}],"praiseTimes":"201","isFavorited":"0","adExpMonitorUrl":"",
     * "geo":{"namePath":"中国","distance":-1,"showName":"","address":"","loc":"0.0,0.0|中国","placeName":"","longitude":0,
     * "latitude":0}}]},{"nodeType":"13","contList":[{"contId":"1138184","name":"20天6万元爆改上海市中170㎡老洋房",
     * "pic":"http://image1.pearvideo.com/cont/20170823/cont-1138184-10536733.jpg","nodeInfo":{"nodeId":"1167",
     * "name":"屋研","logoImg":"http://image1.pearvideo.com/node/1167-10405348-logo.png","isOrder":"0"},"link":"http://",
     * "linkType":"0","isVr":"0","aspectRatio":"0","cornerLabel":"","cornerLabelDesc":"","forwordType":"1",
     * "videoType":"1","duration":"02'57\"","liveStatus":"","postHtml":"http://app.pearvideo.com/clt/page/v3/post
     * .jsp?postId=1113116&contId=1138184","postId":"1113116","commentTimes":"0",
     * "summary":"如何花更少的钱打造更高品质，成了关键的问题。相信这也是大部分人装修最迫切想要解决的部分。","sharePic":"http://image2.pearvideo
     * .com/cont/20170823/cont-1138184-10536734.jpg","shareUrl":"http://www.pearvideo.com/detail_1138184",
     * "tags":[{"tagId":"0","name":"内容质量差"},{"tagId":"1094","name":"上海"},{"tagId":"3491","name":"家居生活"}],
     * "videos":[{"videoId":"10788736","url":"http://video.pearvideo.com/mp4/third/20170823/10802552_104221-fhd.mp4",
     * "name":"","desc":"","tag":"fhd","format":"mp4","fileSize":"17157798","duration":"177"},{"videoId":"10788735",
     * "url":"http://video.pearvideo.com/mp4/third/20170823/10802552_104221-sd.mp4","name":"","desc":"","tag":"sd",
     * "format":"mp4","fileSize":"5476562","duration":"177"},{"videoId":"10788734","url":"http://video.pearvideo
     * .com/mp4/third/20170823/10802552_104221-hd.mp4","name":"","desc":"","tag":"hd","format":"mp4","fileSize":"9139361",
     * "duration":"177"},{"videoId":"10788733","url":"http://video.pearvideo.com/mp4/third/20170823/10802552_104221-ld
     * .mp4","name":"","desc":"","tag":"ld","format":"mp4","fileSize":"3613840","duration":"177"}],"praiseTimes":"56",
     * "isFavorited":"0","adExpMonitorUrl":"","geo":{"namePath":"中国","distance":-1,"showName":"","address":"","loc":"0.0,
     * 0.0|中国","placeName":"","longitude":0,"latitude":0}}]},{"nodeType":"13","contList":[{"contId":"1138105",
     * "name":"扫码赚积分 垃圾分类还能这么玩","pic":"http://image1.pearvideo.com/main/20170823/10140198-074030-0.png",
     * "nodeInfo":{"nodeId":"257","name":"辣焦视频","logoImg":"http://image.pearvideo.com/node/257-10082685-logo.png",
     * "isOrder":"0"},"link":"http://","linkType":"0","isVr":"0","aspectRatio":"0","cornerLabel":"","cornerLabelDesc":"",
     * "forwordType":"1","videoType":"1","duration":"01'31\"","liveStatus":"","postHtml":"http://app.pearvideo
     * .com/clt/page/v3/post.jsp?postId=1113029&contId=1138105","postId":"1113029","commentTimes":"0",
     * "summary":"8月22日，杭钢南苑的居民正在智能垃圾回收箱前投递垃圾。近年来，\u201c智能\u201d\u201c物联网\u201d成为了科技互联网行业的热词，如今连垃圾箱都可以是智能的了。",
     * "sharePic":"http://image1.pearvideo.com/cont/20170823/cont-1138105-10536310.jpg","shareUrl":"http://www.pearvideo
     * .com/detail_1138105","tags":[{"tagId":"0","name":"内容质量差"},{"tagId":"1847","name":"杭州"},{"tagId":"6951",
     * "name":"智能"}],"videos":[{"videoId":"10788143","url":"http://video.pearvideo
     * .com/mp4/third/20170823/10140198_074023-hd.mp4","name":"","desc":"","tag":"hd","format":"mp4",
     * "fileSize":"11740036","duration":"91"},{"videoId":"10788142","url":"http://video.pearvideo
     * .com/mp4/third/20170823/10140198_074023-ld.mp4","name":"","desc":"","tag":"ld","format":"mp4","fileSize":"4262226",
     * "duration":"91"},{"videoId":"10788141","url":"http://video.pearvideo.com/mp4/third/20170823/10140198_074023-sd
     * .mp4","name":"","desc":"","tag":"sd","format":"mp4","fileSize":"7036203","duration":"91"}],"praiseTimes":"102",
     * "isFavorited":"0","adExpMonitorUrl":"","geo":{"namePath":"中国,浙江省,杭州市,拱墅区","distance":1.2881626E7,"showName":"",
     * "address":"杭州市拱墅区半山路113号","loc":"120.190047,30.35402|中国,浙江省,杭州市,拱墅区","placeName":"杭钢南苑社区","longitude":120.190047,
     * "latitude":30.35402}}]},{"nodeType":"13","contList":[{"contId":"1138303","name":"章莹颖男友：中国人希望落叶归根",
     * "pic":"http://image.pearvideo.com/cont/20170823/cont-1138303-10536600.png","nodeInfo":{"nodeId":"963","name":"全球拍",
     * "logoImg":"http://image1.pearvideo.com/node/963-10317772-logo.png","isOrder":"0"},"link":"http://","linkType":"0",
     * "isVr":"0","aspectRatio":"0","cornerLabel":"5","cornerLabelDesc":"推荐","forwordType":"1","videoType":"1",
     * "duration":"00'52\"","liveStatus":"","postHtml":"http://app.pearvideo.com/clt/page/v3/post
     * .jsp?postId=1113086&contId=1138303","postId":"1113086","commentTimes":"0",
     * "summary":"章莹颖家属和律师8月22日在美国香槟市召开新闻发布会。章莹颖男友谈到中美两国文化差异，称对于国人来说，找到人最重要。他希望让莹颖落叶归根。",
     * "sharePic":"http://image1.pearvideo.com/cont/20170823/cont-1138303-10536601.png","shareUrl":"http://www.pearvideo
     * .com/detail_1138303","tags":[{"tagId":"0","name":"内容质量差"},{"tagId":"697","name":"美国"},{"tagId":"1324",
     * "name":"男友"}],"videos":[{"videoId":"10789487","url":"http://video.pearvideo
     * .com/mp4/short/20170823/cont-1138303-10789483-fhd.mp4","name":"","desc":"","tag":"fhd","format":"mp4",
     * "fileSize":"7948659","duration":"52"},{"videoId":"10789486","url":"http://video.pearvideo
     * .com/mp4/short/20170823/cont-1138303-10789483-hd.mp4","name":"","desc":"","tag":"hd","format":"mp4",
     * "fileSize":"3946264","duration":"52"},{"videoId":"10789485","url":"http://video.pearvideo
     * .com/mp4/short/20170823/cont-1138303-10789483-ld.mp4","name":"","desc":"","tag":"ld","format":"mp4",
     * "fileSize":"1437963","duration":"52"},{"videoId":"10789484","url":"http://video.pearvideo
     * .com/mp4/short/20170823/cont-1138303-10789483-sd.mp4","name":"","desc":"","tag":"sd","format":"mp4",
     * "fileSize":"2299506","duration":"52"}],"praiseTimes":"205","isFavorited":"0","adExpMonitorUrl":"",
     * "geo":{"namePath":"美国","distance":-1,"showName":"","address":"","loc":",|美国","placeName":""}}]}]
     */

    private String resultCode;
    private String resultMsg;
    private String reqId;
    private String systemTime;
    private String nextUrl;
    private List<AreaListBean> areaList;
    private List<DataListBean> dataList;

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

    public List<DataListBean> getDataList() {
        return dataList;
    }

    public void setDataList(List<DataListBean> dataList) {
        this.dataList = dataList;
    }

    public static class AreaListBean {
        /**
         * area_id : 103001
         * expInfo : {"algorighm_exp_id":"4100","front_exp_id":"0",
         * "s_value":"19f176e4-6b90-470c-a573-0591b157d021_13401501140618831"}
         */

        private String area_id;
        private ExpInfoBean expInfo;

        public String getArea_id() {
            return area_id;
        }

        public void setArea_id(String area_id) {
            this.area_id = area_id;
        }

        public ExpInfoBean getExpInfo() {
            return expInfo;
        }

        public void setExpInfo(ExpInfoBean expInfo) {
            this.expInfo = expInfo;
        }

        public static class ExpInfoBean {
            /**
             * algorighm_exp_id : 4100
             * front_exp_id : 0
             * s_value : 19f176e4-6b90-470c-a573-0591b157d021_13401501140618831
             */

            private String algorighm_exp_id;
            private String front_exp_id;
            private String s_value;

            public String getAlgorighm_exp_id() {
                return algorighm_exp_id;
            }

            public void setAlgorighm_exp_id(String algorighm_exp_id) {
                this.algorighm_exp_id = algorighm_exp_id;
            }

            public String getFront_exp_id() {
                return front_exp_id;
            }

            public void setFront_exp_id(String front_exp_id) {
                this.front_exp_id = front_exp_id;
            }

            public String getS_value() {
                return s_value;
            }

            public void setS_value(String s_value) {
                this.s_value = s_value;
            }
        }
    }

    public static class DataListBean {
        /**
         * nodeType : 13
         * contList : [{"contId":"1137478","name":"他为共享电动车\"充电\"，一晚500辆","pic":"http://image1.pearvideo
         * .com/cont/20170822/cont-1137478-10533661.jpeg","nodeInfo":{"nodeId":"1232","name":"梨上海",
         * "logoImg":"http://image2.pearvideo.com/node/1232-10425806-logo.png","isOrder":"0"},"link":"http://",
         * "linkType":"0","isVr":"0","aspectRatio":"0","cornerLabel":"3","cornerLabelDesc":"独播","forwordType":"1",
         * "videoType":"1","duration":"00'39\"","liveStatus":"","postHtml":"http://app.pearvideo.com/clt/page/v3/post
         * .jsp?postId=1112367&contId=1137478","postId":"1112367","commentTimes":"0",
         * "summary":"共享电动车已遍布上海，成了很多人的出行必备。但不同于单车，电动车需要更换电瓶。深夜11点，我们在街头遇到了一位更换电瓶的工作人员。",
         * "sharePic":"http://image2.pearvideo.com/cont/20170822/cont-1137478-10533662.jpeg","shareUrl":"http://www
         * .pearvideo.com/detail_1137478","tags":[{"tagId":"0","name":"内容质量差"},{"tagId":"1094","name":"上海"},
         * {"tagId":"1143","name":"工作"}],"videos":[{"videoId":"10785088","url":"http://video.pearvideo
         * .com/mp4/short/20170822/cont-1137478-10785075-hd.mp4","name":"","desc":"","tag":"hd","format":"mp4",
         * "fileSize":"6917588","duration":"39"},{"videoId":"10785087","url":"http://video.pearvideo
         * .com/mp4/short/20170822/cont-1137478-10785075-ld.mp4","name":"","desc":"","tag":"ld","format":"mp4",
         * "fileSize":"1977113","duration":"39"},{"videoId":"10785086","url":"http://video.pearvideo
         * .com/mp4/short/20170822/cont-1137478-10785075-fhd.mp4","name":"","desc":"","tag":"fhd","format":"mp4",
         * "fileSize":"15905074","duration":"39"},{"videoId":"10785085","url":"http://video.pearvideo
         * .com/mp4/short/20170822/cont-1137478-10785075-sd.mp4","name":"","desc":"","tag":"sd","format":"mp4",
         * "fileSize":"3454568","duration":"39"}],"praiseTimes":"60","isFavorited":"0","adExpMonitorUrl":"",
         * "geo":{"namePath":"中国,上海市,上海市,徐汇区","distance":1.2967744E7,"showName":"","address":"地铁9号线","loc":"121.424982,
         * 31.181001|中国,上海市,上海市,徐汇区","placeName":"桂林路","longitude":121.424982,"latitude":31.181001}}]
         */

        private String nodeType;
        private List<ContListBean> contList;

        public String getNodeType() {
            return nodeType;
        }

        public void setNodeType(String nodeType) {
            this.nodeType = nodeType;
        }

        public List<ContListBean> getContList() {
            return contList;
        }

        public void setContList(List<ContListBean> contList) {
            this.contList = contList;
        }

        public static class ContListBean {
            /**
             * contId : 1137478
             * name : 他为共享电动车"充电"，一晚500辆
             * pic : http://image1.pearvideo.com/cont/20170822/cont-1137478-10533661.jpeg
             * nodeInfo : {"nodeId":"1232","name":"梨上海","logoImg":"http://image2.pearvideo.com/node/1232-10425806-logo
             * .png","isOrder":"0"}
             * link : http://
             * linkType : 0
             * isVr : 0
             * aspectRatio : 0
             * cornerLabel : 3
             * cornerLabelDesc : 独播
             * forwordType : 1
             * videoType : 1
             * duration : 00'39"
             * liveStatus :
             * postHtml : http://app.pearvideo.com/clt/page/v3/post.jsp?postId=1112367&contId=1137478
             * postId : 1112367
             * commentTimes : 0
             * summary : 共享电动车已遍布上海，成了很多人的出行必备。但不同于单车，电动车需要更换电瓶。深夜11点，我们在街头遇到了一位更换电瓶的工作人员。
             * sharePic : http://image2.pearvideo.com/cont/20170822/cont-1137478-10533662.jpeg
             * shareUrl : http://www.pearvideo.com/detail_1137478
             * tags : [{"tagId":"0","name":"内容质量差"},{"tagId":"1094","name":"上海"},{"tagId":"1143","name":"工作"}]
             * videos : [{"videoId":"10785088","url":"http://video.pearvideo
             * .com/mp4/short/20170822/cont-1137478-10785075-hd.mp4","name":"","desc":"","tag":"hd","format":"mp4",
             * "fileSize":"6917588","duration":"39"},{"videoId":"10785087","url":"http://video.pearvideo
             * .com/mp4/short/20170822/cont-1137478-10785075-ld.mp4","name":"","desc":"","tag":"ld","format":"mp4",
             * "fileSize":"1977113","duration":"39"},{"videoId":"10785086","url":"http://video.pearvideo
             * .com/mp4/short/20170822/cont-1137478-10785075-fhd.mp4","name":"","desc":"","tag":"fhd","format":"mp4",
             * "fileSize":"15905074","duration":"39"},{"videoId":"10785085","url":"http://video.pearvideo
             * .com/mp4/short/20170822/cont-1137478-10785075-sd.mp4","name":"","desc":"","tag":"sd","format":"mp4",
             * "fileSize":"3454568","duration":"39"}]
             * praiseTimes : 60
             * isFavorited : 0
             * adExpMonitorUrl :
             * geo : {"namePath":"中国,上海市,上海市,徐汇区","distance":1.2967744E7,"showName":"","address":"地铁9号线",
             * "loc":"121.424982,31.181001|中国,上海市,上海市,徐汇区","placeName":"桂林路","longitude":121.424982,"latitude":31.181001}
             */

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

            public static class NodeInfoBean {
                /**
                 * nodeId : 1232
                 * name : 梨上海
                 * logoImg : http://image2.pearvideo.com/node/1232-10425806-logo.png
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

            public static class GeoBean {
                /**
                 * namePath : 中国,上海市,上海市,徐汇区
                 * distance : 1.2967744E7
                 * showName :
                 * address : 地铁9号线
                 * loc : 121.424982,31.181001|中国,上海市,上海市,徐汇区
                 * placeName : 桂林路
                 * longitude : 121.424982
                 * latitude : 31.181001
                 */

                private String namePath;
                private double distance;
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

                public double getDistance() {
                    return distance;
                }

                public void setDistance(double distance) {
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
                 * videoId : 10785088
                 * url : http://video.pearvideo.com/mp4/short/20170822/cont-1137478-10785075-hd.mp4
                 * name :
                 * desc :
                 * tag : hd
                 * format : mp4
                 * fileSize : 6917588
                 * duration : 39
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
    }
}
