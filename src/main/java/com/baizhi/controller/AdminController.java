package com.baizhi.controller;

import com.baizhi.entity.Admin;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/5/9.
 */
@Controller
@RequestMapping("/user")
public class AdminController {

    @RequestMapping("/login")
    @ResponseBody
    public Map<String, Object> loginAdmin(Admin admin) {
        //获得主体
        Subject subject1 = SecurityUtils.getSubject();
        Map<String, Object> map = new HashMap<>();
        try {
            subject1.login(new UsernamePasswordToken(admin.getName(), admin.getPassword()));

        } catch (UnknownAccountException e) {
            e.printStackTrace();
            map.put("success", false);
            map.put("message", "账户不存在");
        } catch (IncorrectCredentialsException e) {
            e.printStackTrace();
            map.put("success", false);
            map.put("message", "密码错误");
        }
        return map;
    }


    @RequestMapping("/userLogin")
    public String login(Admin admin) {
        Subject subject1 = SecurityUtils.getSubject();
        try {
            subject1.login(new UsernamePasswordToken(admin.getName(), admin.getPassword()));
            return "redirect:/main/main.jsp";
        } catch (UnknownAccountException e) {
            e.printStackTrace();
            System.out.println("账户不存在");
        } catch (IncorrectCredentialsException e) {
            e.printStackTrace();
            System.out.println("密码错误");
        }
        return "redirect:/main/login.jsp";
    }


}
