package com.baizhi.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2018/5/7.
 */
public class role implements Serializable {
    private String id;
    private String role_name;
    private String beiy;
    private List<Cmfz_Resource> resources;

    public role(String id, String role_name, String beiy, List<Cmfz_Resource> resources) {
        this.id = id;
        this.role_name = role_name;
        this.beiy = beiy;
        this.resources = resources;
    }

    public role() {
    }

    public List<Cmfz_Resource> getResources() {
        return resources;
    }

    public void setResources(List<Cmfz_Resource> resources) {
        this.resources = resources;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getBeiy() {
        return beiy;
    }

    public void setBeiy(String beiy) {
        this.beiy = beiy;
    }

    @Override
    public String toString() {
        return "role{" +
                "id='" + id + '\'' +
                ", role_name='" + role_name + '\'' +
                ", beiy='" + beiy + '\'' +
                ", resources=" + resources +
                '}';
    }
}













