package application.app.okhttp.bean;

import java.util.List;
/**
 * Created by lwz on 2018/4/24.
 */

public class AdviceBean implements MultiItemEntity {
    /**
     * contentType
     * 内容类型（1：图文，2：图集，3：通栏，4：视频，5：直播）
     */
    public static final int ONE_IMAGE_TYPE = 3;
    public static final int LEFT_IMG_TYPE = 1;
    public static final int THREE_IMAGE_TYPE = 2;
    public static final int LIVING_VIEW_TYPE = 5;
    public static final int VIDEO_VIEW_TYPE = 4;

    private int itemType;

    @Override
    public int getItemType() {
        return Integer.parseInt(contentType);
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    /**
     * infoId : 06ae8d7085394427b17d61476797015e
     * title : 最新
     * author : 最新
     * weight : 100
     * contentType : 05
     * contentTypeName : 直播
     * firstStageType : 01
     * firstStateTypeName : 头条
     * secondStageType :
     * source : 最新
     * summary : 最新
     * columnTag : 08e7dc6e8a2c424e92b1ec5e0f67ec85
     * columnTagName : 栏目标签2
     * status : 1
     * hotFlag : 1
     * content : <p style="text-align: center;"><img src="http://img.ph.126.net/XZ1LqlyLunpEXrZSaEza1A==/3301420001840535361.jpg" width="500"/></p><p style="text-align: center;">水水水水水水水水水水水水水水水水水水水</p><p style="text-align: center;"><img src="http://img.ph.126.net/XZ1LqlyLunpEXrZSaEza1A==/3301420001840535361.jpg" width="500"/></p>
     * publishTime : 1498141347000
     * collFlag : 0
     * nominates : [{"naminateTitle":"最新","nominateId":"06ae8d7085394427b17d61476797015e"},{"naminateTitle":"最新","nominateId":"06ae8d7085394427b17d61476797015e"}]
     * photos : [{"photoId":"875ac2db5d8d4995905cea9bf67d02c2","url":"http://img.ph.126.net/XZ1LqlyLunpEXrZSaEza1A==/3301420001840535361.jpg"}]
     * keyWords : [{"tagId":"240be44593b4458ea068afe0e8d0ffec","name":"品牌聚焦"},{"tagId":"ebe523b817da4bbe88169986c0aa46ef","name":"创业故事"}]
     * commentEntity : {"code":"0","pageNum":0,"pageSize":0,"pages":0,"total":0}
     * activityEntity : {"activityId":"04709c1a6b294f92ad71e621e806ea50","chartRoomId":"9276767","title":"王小钊","province":"1","city":"2","simExplanation":"王小钊","up":"王小钊","startTime":1497339360000,"endTime":1498203360000,"detailDesc":"王小钊","introPic":"http://kuaidao-dev2.oss-cn-beijing.aliyuncs.com/activity/ydGCfPrBia.jpg","chartRoomName":"王小钊","delStatus":"0","commentNumber":"0","upvoteNumber":"0","highStream":"","lowStream":"","standardStream":"","videoStatus":"2","isLike":"0","isSubscribe":"0","orderNumPrimary":0,"orderNumMinor":0}
     */

    private String infoId;
    private String title;
    private String author;
    private int weight;
    private String contentType;
    private String contentTypeName;
    private String firstStageType;
    private String firstStateTypeName;
    private String secondStageType;
    private String source;
    private String summary;
    private String columnTag;
    private String columnTagName;
    private String status;
    private String hotFlag;
    private String content;
    private String videoId;
    private long publishTime;
    private int collFlag;
    private int likes;
    private int likeNum;
    private CommentEntityBean commentEntity;
    private ActivityEntityBean activityEntity;
    private DemandBean vodEntity;
    private List<NominatesBean> nominates;
    private List<PhotosBean> photos;
    private List<KeyWordsBean> keyWords;

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getContentTypeName() {
        return contentTypeName;
    }

    public void setContentTypeName(String contentTypeName) {
        this.contentTypeName = contentTypeName;
    }

    public DemandBean getVodEntity() {
        return vodEntity;
    }

    public void setVodEntity(DemandBean vodEntity) {
        this.vodEntity = vodEntity;
    }

    public String getFirstStageType() {
        return firstStageType;
    }

    public void setFirstStageType(String firstStageType) {
        this.firstStageType = firstStageType;
    }

    public String getFirstStateTypeName() {
        return firstStateTypeName;
    }

    public void setFirstStateTypeName(String firstStateTypeName) {
        this.firstStateTypeName = firstStateTypeName;
    }

    public String getSecondStageType() {
        return secondStageType;
    }

    public void setSecondStageType(String secondStageType) {
        this.secondStageType = secondStageType;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getColumnTag() {
        return columnTag;
    }

    public void setColumnTag(String columnTag) {
        this.columnTag = columnTag;
    }

    public String getColumnTagName() {
        return columnTagName;
    }

    public void setColumnTagName(String columnTagName) {
        this.columnTagName = columnTagName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHotFlag() {
        return hotFlag;
    }

    public void setHotFlag(String hotFlag) {
        this.hotFlag = hotFlag;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(long publishTime) {
        this.publishTime = publishTime;
    }

    public int getCollFlag() {
        return collFlag;
    }

    public void setCollFlag(int collFlag) {
        this.collFlag = collFlag;
    }

    public CommentEntityBean getCommentEntity() {
        return commentEntity;
    }

    public void setCommentEntity(CommentEntityBean commentEntity) {
        this.commentEntity = commentEntity;
    }

    public ActivityEntityBean getActivityEntity() {
        return activityEntity;
    }

    public void setActivityEntity(ActivityEntityBean activityEntity) {
        this.activityEntity = activityEntity;
    }

    public List<NominatesBean> getNominates() {
        return nominates;
    }

    public void setNominates(List<NominatesBean> nominates) {
        this.nominates = nominates;
    }

    public List<PhotosBean> getPhotos() {
        return photos;
    }

    public void setPhotos(List<PhotosBean> photos) {
        this.photos = photos;
    }

    public List<KeyWordsBean> getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(List<KeyWordsBean> keyWords) {
        this.keyWords = keyWords;
    }

    public static class CommentEntityBean {
        /**
         * code : 0
         * pageNum : 0
         * pageSize : 0
         * pages : 0
         * total : 0
         */

        private String code;
        private int pageNum;
        private int pageSize;
        private int pages;
        private int total;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public int getPageNum() {
            return pageNum;
        }

        public void setPageNum(int pageNum) {
            this.pageNum = pageNum;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }
    }

    public static class ActivityEntityBean {
        /**
         * activityId : 04709c1a6b294f92ad71e621e806ea50
         * chartRoomId : 9276767
         * title : 王小钊
         * province : 1
         * city : 2
         * simExplanation : 王小钊
         * up : 王小钊
         * startTime : 1497339360000
         * endTime : 1498203360000
         * detailDesc : 王小钊
         * introPic : http://kuaidao-dev2.oss-cn-beijing.aliyuncs.com/activity/ydGCfPrBia.jpg
         * chartRoomName : 王小钊
         * delStatus : 0
         * commentNumber : 0
         * upvoteNumber : 0
         * highStream :
         * lowStream :
         * standardStream :
         * videoStatus : 2
         * isLike : 0
         * isSubscribe : 0
         * orderNumPrimary : 0
         * orderNumMinor : 0
         */

        private String activityId;
        private String chartRoomId;
        private String title;
        private String province;
        private String city;
        private String simExplanation;
        private String up;
        private long startTime;
        private long endTime;
        private String detailDesc;
        private String introPic;
        private String chartRoomName;
        private String delStatus;
        private String commentNumber;
        private String upvoteNumber;
        private String highStream;
        private String lowStream;
        private String standardStream;
        private String videoStatus;
        private String isLike;
        private String isSubscribe;
        private String watchNumber;
        private int orderNumPrimary;
        private int orderNumMinor;

        public String getWatchNumber() {
            return watchNumber;
        }

        public void setWatchNumber(String watchNumber) {
            this.watchNumber = watchNumber;
        }

        public String getActivityId() {
            return activityId;
        }

        public void setActivityId(String activityId) {
            this.activityId = activityId;
        }

        public String getChartRoomId() {
            return chartRoomId;
        }

        public void setChartRoomId(String chartRoomId) {
            this.chartRoomId = chartRoomId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getSimExplanation() {
            return simExplanation;
        }

        public void setSimExplanation(String simExplanation) {
            this.simExplanation = simExplanation;
        }

        public String getUp() {
            return up;
        }

        public void setUp(String up) {
            this.up = up;
        }

        public long getStartTime() {
            return startTime;
        }

        public void setStartTime(long startTime) {
            this.startTime = startTime;
        }

        public long getEndTime() {
            return endTime;
        }

        public void setEndTime(long endTime) {
            this.endTime = endTime;
        }

        public String getDetailDesc() {
            return detailDesc;
        }

        public void setDetailDesc(String detailDesc) {
            this.detailDesc = detailDesc;
        }

        public String getIntroPic() {
            return introPic;
        }

        public void setIntroPic(String introPic) {
            this.introPic = introPic;
        }

        public String getChartRoomName() {
            return chartRoomName;
        }

        public void setChartRoomName(String chartRoomName) {
            this.chartRoomName = chartRoomName;
        }

        public String getDelStatus() {
            return delStatus;
        }

        public void setDelStatus(String delStatus) {
            this.delStatus = delStatus;
        }

        public String getCommentNumber() {
            return commentNumber;
        }

        public void setCommentNumber(String commentNumber) {
            this.commentNumber = commentNumber;
        }

        public String getUpvoteNumber() {
            return upvoteNumber;
        }

        public void setUpvoteNumber(String upvoteNumber) {
            this.upvoteNumber = upvoteNumber;
        }

        public String getHighStream() {
            return highStream;
        }

        public void setHighStream(String highStream) {
            this.highStream = highStream;
        }

        public String getLowStream() {
            return lowStream;
        }

        public void setLowStream(String lowStream) {
            this.lowStream = lowStream;
        }

        public String getStandardStream() {
            return standardStream;
        }

        public void setStandardStream(String standardStream) {
            this.standardStream = standardStream;
        }

        public String getVideoStatus() {
            return videoStatus;
        }

        public void setVideoStatus(String videoStatus) {
            this.videoStatus = videoStatus;
        }

        public String getIsLike() {
            return isLike;
        }

        public void setIsLike(String isLike) {
            this.isLike = isLike;
        }

        public String getIsSubscribe() {
            return isSubscribe;
        }

        public void setIsSubscribe(String isSubscribe) {
            this.isSubscribe = isSubscribe;
        }

        public int getOrderNumPrimary() {
            return orderNumPrimary;
        }

        public void setOrderNumPrimary(int orderNumPrimary) {
            this.orderNumPrimary = orderNumPrimary;
        }

        public int getOrderNumMinor() {
            return orderNumMinor;
        }

        public void setOrderNumMinor(int orderNumMinor) {
            this.orderNumMinor = orderNumMinor;
        }
    }

    public static class NominatesBean {
        /**
         * naminateTitle : 最新
         * nominateId : 06ae8d7085394427b17d61476797015e
         */

        private String naminateTitle;
        private String nominateId;

        public String getNaminateTitle() {
            return naminateTitle;
        }

        public void setNaminateTitle(String naminateTitle) {
            this.naminateTitle = naminateTitle;
        }

        public String getNominateId() {
            return nominateId;
        }

        public void setNominateId(String nominateId) {
            this.nominateId = nominateId;
        }
    }

    public static class PhotosBean {
        /**
         * photoId : 875ac2db5d8d4995905cea9bf67d02c2
         * url : http://img.ph.126.net/XZ1LqlyLunpEXrZSaEza1A==/3301420001840535361.jpg
         */

        private String photoId;
        private String url;
        private String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPhotoId() {
            return photoId;
        }

        public void setPhotoId(String photoId) {
            this.photoId = photoId;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class KeyWordsBean {
        /**
         * tagId : 240be44593b4458ea068afe0e8d0ffec
         * name : 品牌聚焦
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
}
