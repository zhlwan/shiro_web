package com.baizhi.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/4/25.
 */
public class copy_Article {
    private String id;
    private String thumbnail;
    private String title;
    private String author;
    private String set_count;
    private Date create_date;

    public copy_Article(String id, String thumbnail, String title, String author, String set_count, Date create_date) {
        this.id = id;
        this.thumbnail = thumbnail;
        this.title = title;
        this.author = author;
        this.set_count = set_count;
        this.create_date = create_date;
    }

    public copy_Article() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "copy_Article{" +
                "id='" + id + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", set_count='" + set_count + '\'' +
                ", create_date=" + create_date +
                '}';
    }
}














