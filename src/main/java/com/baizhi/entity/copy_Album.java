package com.baizhi.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/4/25.
 */
public class copy_Album {
    private String id;
    private String thumbnail;//插图
    private String title;//标题
    private String author;
    private String type;
    private String set_count;
    private Date create_date;

    public copy_Album(String id, String thumbnail, String title, String author, String type, String set_count, Date create_date) {
        this.id = id;
        this.thumbnail = thumbnail;
        this.title = title;
        this.author = author;
        this.type = type;
        this.set_count = set_count;
        this.create_date = create_date;
    }

    public copy_Album() {

    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSet_count() {
        return set_count;
    }

    public void setSet_count(String set_count) {
        this.set_count = set_count;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "copy_Album{" +
                "id='" + id + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", set_count='" + set_count + '\'' +
                ", create_date=" + create_date +
                '}';
    }
}

















