package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/5/26.
 */
@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("select")
    public String selectAll() {
        System.out.println("第一次修改");
        System.out.println("第二次修改");
        System.out.println("洪磊的第一次提交 ");
        System.out.println("好帅的提交代码");
        return "index";
    }

}
