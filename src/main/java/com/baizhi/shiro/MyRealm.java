package com.baizhi.shiro;

import com.baizhi.dao.AdminDao;
import com.baizhi.dao.RoleDao;
import com.baizhi.entity.Admin;
import com.baizhi.entity.Cmfz_Resource;
import com.baizhi.entity.role;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by Administrator on 2018/5/7.
 */
public class MyRealm extends AuthorizingRealm {

    @Resource
    private AdminDao dao;
    @Resource
    private RoleDao dao2;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String principal = (String) principalCollection.getPrimaryPrincipal();
        Admin admin = dao.selectAllRole(principal);
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        int a = 0;
        if (principal.equals(admin.getName())) {
            List<role> role = admin.getRole();
            for (com.baizhi.entity.role role1 : role) {
                simpleAuthorizationInfo.addRole(role1.getRole_name());
                role role2 = dao2.selectAllRoleResource(role1.getRole_name());
                List<Cmfz_Resource> resources = role2.getResources();
                for (Cmfz_Resource resource : resources) {
                    a += 1;
                    simpleAuthorizationInfo.addStringPermission(resource.getResource_name());
                }
            }
            System.out.println("=========================访问数据库次数  ：" + a);
        }
        return simpleAuthorizationInfo;
    }

    //认证
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //从表单中获得用户名
        String principal = (String) authenticationToken.getPrincipal();
        //根据用户名得到用户
        Admin admin = dao.selectStringOne(principal);
        if (admin != null) {
            if (principal.equals(admin.getName())) {
                //返回用户名，密码，和一个随即字符串
                return new SimpleAuthenticationInfo(principal, admin.getPassword(), this.getName());
            }
        }
        return null;
    }


}
