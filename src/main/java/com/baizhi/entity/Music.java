package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2018/4/16.
 */
public class Music implements Serializable {
    private String id;
    private String title;
    private Integer size;
    private String url;
    private String duration;//音频时常
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date time;
    private Album album;
    private String beiy;


    public Music(String id, String title, Integer size, String url, String duration, Date time, Album album, String beiy) {
        this.id = id;
        this.title = title;
        this.size = size;
        this.url = url;
        this.duration = duration;
        this.time = time;
        this.album = album;
        this.beiy = beiy;
    }

    public Music() {
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

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getBeiy() {
        return beiy;
    }

    public void setBeiy(String beiy) {
        this.beiy = beiy;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Music{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", size=" + size +
                ", url='" + url + '\'' +
                ", duration='" + duration + '\'' +
                ", time=" + time +
                ", album=" + album +
                ", beiy='" + beiy + '\'' +
                '}';
    }
}
