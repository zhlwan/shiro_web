package com.baizhi.shiro;

import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/5/7.
 */
@Configuration
public class ShiroConfig {

    //创建shiro的filter,他依赖安全管理器
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        //把安全管理器放里面
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        //设置登录页面
        shiroFilterFactoryBean.setLoginUrl("/main/login.jsp");
        Map<String, String> map = new LinkedHashMap<>();
        map.put("/user/logout", "logout");
        map.put("/user/**", "anon");
        map.put("/**", "authc");
        //设置拦截器链
        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);
        return shiroFilterFactoryBean;
    }

    //安全管理器，依赖自定义Reaml
    @Bean
    public SecurityManager getSecurityManager(Realm realm, CacheManager manager) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(realm);
        //在安全管理器中注入缓存
        securityManager.setCacheManager(manager);
        return securityManager;
    }


    //自定义Reaml
    @Bean
    public Realm getEeaml() {
        MyRealm myRealm = new MyRealm();
        return myRealm;
    }


    //shiro自己提供的缓存
    @Bean
    public CacheManager getCacheManager() {
        EhCacheManager manager = new EhCacheManager();
        return manager;
    }

}
