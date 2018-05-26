package com.baizhi.dao;

import com.baizhi.entity.role;

/**
 * Created by Administrator on 2018/5/8.
 */
public interface RoleDao extends BaseDao<role> {
    role selectAllRoleResource(String roleName);
}
