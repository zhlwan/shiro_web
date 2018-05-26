package com.baizhi.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/8.
 */
public class Cmfz_Resource implements Serializable {
    private String id;
    private String resource_name;
    private String beiy;

    public Cmfz_Resource(String id, String resource_name, String beiy) {
        this.id = id;
        this.resource_name = resource_name;
        this.beiy = beiy;
    }

    public Cmfz_Resource() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResource_name() {
        return resource_name;
    }

    public void setResource_name(String resource_name) {
        this.resource_name = resource_name;
    }

    public String getBeiy() {
        return beiy;
    }

    public void setBeiy(String beiy) {
        this.beiy = beiy;
    }

    @Override
    public String toString() {
        return "Cmfz_Resource{" +
                "id='" + id + '\'' +
                ", resource_name='" + resource_name + '\'' +
                ", beiy='" + beiy + '\'' +
                '}';
    }
}
