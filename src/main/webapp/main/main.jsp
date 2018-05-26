<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" isELIgnored="false" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="super" uri="http://shiro.apache.org/tags" %>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Document</title>
</head>
<body>
<div>
    <h1 align="center"><font color="blue" size="5">持 &nbsp;&nbsp;&nbsp;&nbsp;名&nbsp;&nbsp;&nbsp;&nbsp;法&nbsp;&nbsp;&nbsp;&nbsp;洲&nbsp;&nbsp;&nbsp;&nbsp;首&nbsp;&nbsp;&nbsp;&nbsp;页</font>
    </h1>
</div>
<div style="font-size: 16px;color: #a52a2a;font-family: 楷体;width: 500px;float:right;padding-top:15px">
    <marquee direction=right>
        <shiro:authenticated>
            <font size="5" color="#7fff00">欢迎你:</font><font size="5" color="#a52a2a"><shiro:principal/></font>
        </shiro:authenticated>
    </marquee>
</div>

<div style="font-size: 16px;color: #a52a2a;font-family: 楷体;width: 100px;padding-top:15px">
    <a href="${pageContext.request.contextPath}/user/logout"><font color="#8a2be2" size="5">退出</font></a>
</div>
<div style="margin-top: 10px">
    <shiro:hasRole name="super">
        <div>系统管理</div>
        <ul>
            <shiro:hasPermission name="system:add">
                <li>增加</li>
            </shiro:hasPermission>
            <shiro:hasPermission name="system:delete">
                <li>删除</li>
            </shiro:hasPermission>
            <shiro:hasPermission name="system:update">
                <li>修改</li>
            </shiro:hasPermission>
            <shiro:hasPermission name="system:select">
                <li>查询</li>
            </shiro:hasPermission>
        </ul>
    </shiro:hasRole>
    <super:hasAnyRoles name="user,admin,super">
    <div>文章管理</div>
    <ul>
        <shiro:hasPermission name="article:add">
            <li>增加</li>
        </shiro:hasPermission>
        <shiro:hasPermission name="article:delete">
            <li>删除</li>
        </shiro:hasPermission>
        <shiro:hasPermission name="article:update">
            <li>修改</li>
        </shiro:hasPermission>
        <shiro:hasPermission name="article:select">
            <li>查询</li>
        </shiro:hasPermission>
    </ul>
    <div>用户管理</div>
    <ul>
        <shiro:hasPermission name="user:add">
            <li>增加</li>
        </shiro:hasPermission>
        <shiro:hasPermission name="user:delete">
            <li>删除</li>
        </shiro:hasPermission>

        <shiro:hasPermission name="user:update">
            <li>修改</li>
        </shiro:hasPermission>
        <shiro:hasPermission name="user:select">
            <li>查询</li>
        </shiro:hasPermission>
    </ul>
    <div>轮播图管理</div>
    <ul>
        <shiro:hasPermission name="picture:add">
            <li>增</li>
        </shiro:hasPermission>
        <shiro:hasPermission name="picture:delete">
            <li>删除</li>
        </shiro:hasPermission>
        <shiro:hasPermission name="picture:update">
            <li>修改</li>
        </shiro:hasPermission>
        <shiro:hasPermission name="picture:select">
            <li>查询</li>
        </shiro:hasPermission>
    </ul>
</div>
</super:hasAnyRoles>

</body>
</html>