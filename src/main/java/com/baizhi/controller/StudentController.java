package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/5/26.
 */
@Controller
@RequestMapping("student")
public class StudentController {
    @RequestMapping("select")
    public String selectAllStudent() {
        return "index";
    }

}
