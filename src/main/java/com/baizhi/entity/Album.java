package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/4/16.
 */
public class Album implements Serializable {
    private String id;
    private String url;//图片路径
    private String title;//专辑标题
    private Integer count; //专辑里的音频数量
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date time;
    private Integer score;//分数
    private String author;//作者
    private String broadcast;//播音员
    private String brief;//内容简介
    private String status;//状态
    private String beiy;
    private List<Music> children;

    public Album(String id, String url, String title, Integer count, Date time, Integer score, String author, String broadcast, String brief, String status, String beiy, List<Music> children) {
        this.id = id;
        this.url = url;
        this.title = title;
        this.count = count;
        this.time = time;
        this.score = score;
        this.author = author;
        this.broadcast = broadcast;
        this.brief = brief;
        this.status = status;
        this.beiy = beiy;
        this.children = children;
    }

    public Album(String id) {
        this.id = id;
    }

    public Album() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(String broadcast) {
        this.broadcast = broadcast;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBeiy() {
        return beiy;
    }

    public void setBeiy(String beiy) {
        this.beiy = beiy;
    }

    public List<Music> getChildren() {
        return children;
    }

    public void setChildren(List<Music> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", count=" + count +
                ", time=" + time +
                ", score=" + score +
                ", author='" + author + '\'' +
                ", broadcast='" + broadcast + '\'' +
                ", brief='" + brief + '\'' +
                ", status='" + status + '\'' +
                ", beiy='" + beiy + '\'' +
                ", children=" + children +
                '}';
    }
}
