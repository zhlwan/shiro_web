package com.baizhi.dao;

import com.baizhi.entity.Admin;

/**
 * Created by Administrator on 2018/4/14.
 */
public interface AdminDao extends BaseDao<Admin> {
    public Admin selectAllRole(String name);
}
