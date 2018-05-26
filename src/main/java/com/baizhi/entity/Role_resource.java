package com.baizhi.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/8.
 */
public class Role_resource implements Serializable {

    private String role_id;
    private String resource_id;

    public Role_resource(String role_id, String resource_id) {
        this.role_id = role_id;
        this.resource_id = resource_id;
    }

    public Role_resource() {
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getResource_id() {
        return resource_id;
    }

    public void setResource_id(String resource_id) {
        this.resource_id = resource_id;
    }

    @Override
    public String toString() {
        return "Role_resource{" +
                "role_id='" + role_id + '\'' +
                ", resource_id='" + resource_id + '\'' +
                '}';
    }
}
