package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2018/4/14.
 */
public class Picture implements Serializable {
    private String id;
    private String url;
    private String de;
    private String status;
    private String beiy;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date time;

    public Picture(String id, String url, String de, String status, String beiy, Date time) {
        this.id = id;
        this.url = url;
        this.de = de;
        this.status = status;
        this.beiy = beiy;
        this.time = time;
    }

    public Picture() {
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

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", de='" + de + '\'' +
                ", status='" + status + '\'' +
                ", beiy='" + beiy + '\'' +
                ", time=" + time +
                '}';
    }
}


















