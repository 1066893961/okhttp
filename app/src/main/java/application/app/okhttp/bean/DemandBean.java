package application.app.okhttp.bean;

import java.io.Serializable;

import application.app.okhttp.utils.StringUtils;

/**
 * Created by lwz on 2018/4/24.
 */

public class DemandBean implements Serializable {

    private String uuid;             //视频唯一ID
    private String cover;                //封面地址
    private String name;                //视频名称
    private String title;               //视频标题
    private String description;           //描述
    private int size;                //占用空间大小
    private String width;                //宽度
    private String height;                //高度
    private int duration;                //播放时长
    private String neteaseSoruceUrl;      //源文件地址
    private String hdUrl;                //多个高清播放地址以逗号分割
    private String sdUrl;                //多个标清播放地址以逗号分割
    private String shdUrl;                //多个超清播放地址以逗号分割
    private String commentsNum;           //评论数
    private int supportStatus;       //是否点赞
    private int supportTotal;       //点赞数量
    private String shareUrl;            //分享地址
    private long publishDate;        //发布时间
    private int isCollect;          //是否收藏
    private int publishStatus;      //9表示上架，10 表示下架
    private String infoId;

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId;
    }

    private String hitImage1;
    private String hitImage2;

    private String adviceId;       //视频属于资讯的时候，需要传入的资讯ID，接口本生没有返回这id


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getNeteaseSoruceUrl() {
        return neteaseSoruceUrl;
    }

    public void setNeteaseSoruceUrl(String neteaseSoruceUrl) {
        this.neteaseSoruceUrl = neteaseSoruceUrl;
    }

    public String getHdUrl() {
        return hdUrl;
    }

    public void setHdUrl(String hdUrl) {
        this.hdUrl = hdUrl;
    }

    public String getSdUrl() {
        return sdUrl;
    }

    public void setSdUrl(String sdUrl) {
        this.sdUrl = sdUrl;
    }

    public String getShdUrl() {
        return shdUrl;
    }

    public void setShdUrl(String shdUrl) {
        this.shdUrl = shdUrl;
    }

    public String getCommentsNum() {
        return commentsNum;
    }

    public void setCommentsNum(String commentsNum) {
        this.commentsNum = commentsNum;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public int getSupportStatus() {
        return supportStatus;
    }

    public void setSupportStatus(int supportStatus) {
        this.supportStatus = supportStatus;
    }

    public long getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(long publishDate) {
        this.publishDate = publishDate;
    }

    public int getSupportTotal() {
        return supportTotal;
    }

    public void setSupportTotal(int supportTotal) {
        this.supportTotal = supportTotal;
    }

    public int getIsCollect() {
        return isCollect;
    }

    public void setIsCollect(int isCollect) {
        this.isCollect = isCollect;
    }

    public int getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(int publishStatus) {
        this.publishStatus = publishStatus;
    }

    public String getHitImage1() {
        return hitImage1;
    }

    public void setHitImage1(String hitImage1) {
        this.hitImage1 = hitImage1;
    }

    public String getHitImage2() {
        return hitImage2;
    }

    public void setHitImage2(String hitImage2) {
        this.hitImage2 = hitImage2;
    }

    /**
     * 获取超清流
     * @return
     */
    public String getSuperStream(){
        if (shdUrl == null || StringUtils.isEmpty(shdUrl)){
            return null;
        }
        String[] streams = shdUrl.split(",");
        if (streams != null && streams.length>0){
            return streams[0];
        }else{
            return shdUrl;
        }


    }
    /**
     * 获取标准流
     * @return
     */
    public String getStandardStream(){
        if (sdUrl == null ||StringUtils.isEmpty(sdUrl)){
            return null;
        }
        String[] streams = sdUrl.split(",");
        if (streams != null && streams.length>0){
            return streams[0];
        }else {
            return sdUrl;
        }
    }

    /**
     * 获取高清流
     * @return
     */
    public String getHighStream(){
        if (hdUrl == null ||StringUtils.isEmpty(hdUrl)){
            return null;
        }
        String[] streams = hdUrl.split(",");
        if (streams != null && streams.length>0){
            return streams[0];
        }else {
            return hdUrl;
        }
    }

    public String getAdviceId() {
        return adviceId;
    }

    public void setAdviceId(String adviceId) {
        this.adviceId = adviceId;
    }

    public String getPlayUrl(){
        String stream = null;
        if (!StringUtils.isEmpty(getHighStream())){
            stream = getHighStream();
            return stream;
        }else if (!StringUtils.isEmpty(getStandardStream())){
            stream = getStandardStream();
            return stream;
        }else if (!StringUtils.isEmpty(getSuperStream())){
            stream = getSuperStream();
            return stream;
        }else if (!StringUtils.isEmpty(getHdUrl())){
            stream = getHdUrl();
            return stream;
        }else if (!StringUtils.isEmpty(getSdUrl())){
            stream = getHighStream();
            return stream;
        }else if (!StringUtils.isEmpty(getShdUrl())){
            stream = getHighStream();
            return stream;
        }else {
            return stream;
        }
    }

}
