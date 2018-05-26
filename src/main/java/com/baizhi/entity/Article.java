package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2018/4/15.
 */
public class Article implements Serializable {
    private String id;
    private String title;
    private String brief;
    private String url;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date time;
    private String linkurl;
    private String beiy;
    private Teacher teacher;

    public Article(String id, String title, String brief, String url, Date time, String linkurl, String beiy, Teacher teacher) {
        this.id = id;
        this.title = title;
        this.brief = brief;
        this.url = url;
        this.time = time;
        this.linkurl = linkurl;
        this.beiy = beiy;
        this.teacher = teacher;
    }

    public Article() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getLinkurl() {
        return linkurl;
    }

    public void setLinkurl(String linkurl) {
        this.linkurl = linkurl;
    }

    public String getBeiy() {
        return beiy;
    }

    public void setBeiy(String beiy) {
        this.beiy = beiy;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", brief='" + brief + '\'' +
                ", url='" + url + '\'' +
                ", time=" + time +
                ", linkurl='" + linkurl + '\'' +
                ", beiy='" + beiy + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}














