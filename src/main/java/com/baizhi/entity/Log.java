package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2018/4/21.
 */
public class Log implements Serializable {
    private Integer id;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date time;
    private String detail;
    private String beiy;

    public Log(Integer id, String name, Date time, String detail, String beiy) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.detail = detail;
        this.beiy = beiy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getBeiy() {
        return beiy;
    }

    public void setBeiy(String beiy) {
        this.beiy = beiy;
    }

    public Log() {
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", detail='" + detail + '\'' +
                ", beiy='" + beiy + '\'' +
                '}';
    }
}


















