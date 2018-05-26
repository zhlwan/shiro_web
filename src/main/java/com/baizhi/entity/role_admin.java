package com.baizhi.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/7.
 */
public class role_admin implements Serializable {
    private String admin_id;
    private String role_id;

    public role_admin(String admin_id, String role_id) {
        this.admin_id = admin_id;
        this.role_id = role_id;
    }

    public role_admin() {
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    @Override
    public String toString() {
        return "role_admin{" +
                "admin_id='" + admin_id + '\'' +
                ", role_id='" + role_id + '\'' +
                '}';
    }
}
