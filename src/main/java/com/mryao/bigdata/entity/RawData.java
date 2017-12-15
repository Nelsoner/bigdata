package com.mryao.bigdata.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author: yaohuaiying
 * @Date: 2017/12/5 20:41
 * @Description: 原始数据（网络爬虫扒下来的数据）
 * @Version: 1.0
 */
@Entity
@Table(name ="T_RAW_DATA")
public class RawData {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    //1：文章来源网站
    private String articleUrl;

    //2：标题
    private String title;

    //4：发布时间
    private String publishTime;

    //5：爬取时间
    private String crawlTime;

    //6：分类
    private String classification;

    //7：发布单位
    private String publishUnits;

    //8：地区
    private String area;

    //9：热度
    private String heat;
    //10: 附件*
    private String annex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getCrawlTime() {
        return crawlTime;
    }

    public void setCrawlTime(String crawlTime) {
        this.crawlTime = crawlTime;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getPublishUnits() {
        return publishUnits;
    }

    public void setPublishUnits(String publishUnits) {
        this.publishUnits = publishUnits;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getHeat() {
        return heat;
    }

    public void setHeat(String heat) {
        this.heat = heat;
    }

    public String getAnnex() {
        return annex;
    }

    public void setAnnex(String annex) {
        this.annex = annex;
    }
}
