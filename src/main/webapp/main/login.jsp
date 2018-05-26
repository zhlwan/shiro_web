<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page isELIgnored="false" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Document</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/shiro/css/common.css" type="text/css">
    </link>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/shiro/css/login.css" type="text/css">
    </link>
    <script type="text/javascript" src="${pageContext.request.contextPath}/shiro/script/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/shiro/script/common.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/shiro/js/jquery-1.8.3.js"></script>
    <script type="text/javascript">
        /* $(function () {
         $("#shiroWebForm").submit(function(){
         var name1=$("#shiroName").val();
         var password1=$("#shiroPassword").val();
         $.ajax({
         type:"POST",
         url:"${pageContext.request.contextPath}/admin/login",
         data:"name="+name1+"&password="+password1,
         dataType:"JSON",
         success:function(result){
         console.log(result)
         if (result.success){
         alert("验证正确，欢迎登陆持名法洲首页")
         location.href ="${pageContext.request.contextPath}/main/main.jsp";
         }else{
         alert(result.message);
         }
         }
         })
         return false;//阻止表单提交
         })
         })*/
        /*$(function () {
         var name1=$("#shiroName").val();
         var password1=$("#shiroPassword").val();
         $.ajax({
         type:"POST",
         url:"${pageContext.request.contextPath}/admin/login",
         data:"name="+name1+"&password="+password1,
         dataType:"JSON",
         success:function(result){
         console.log(result)
         if (result.success){
         alert("验证正确，欢迎登陆首页")
         location.href ="${pageContext.request.contextPath}/main/main.jsp";
         }else{
         alert(result.message);
         }
         }
         })
         })*/

    </script>
</head>
<body>
<center>
    <h1><font color="#a52a2a" size="6">登
        &nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;&nbsp;&nbsp;&nbsp;页&nbsp;&nbsp;&nbsp;&nbsp;面</font></h1>
    <div style="margin-top: 70px">
        <form method="post" id="shiroWebForm" action="${pageContext.request.contextPath}/user/userLogin">

            <div style="margin-top: 50px">
                <font size="3">管理员名字：</font> <input type="text" name="name" id="shiroName"/><br/>
            </div>
            <div style="margin-top: 50px">
                <font size="3">密码：</font> <input type="text" name="password" id="shiroPassword"/><br/>
            </div>
            <div style="margin-top: 50px">
                <font size="3">登录：</font> <input type="submit" value="登录"/><br/>
            </div>
        </form>
    </div>
</center>
</body>
</html>