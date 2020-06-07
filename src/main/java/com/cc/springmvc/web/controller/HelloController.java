package com.cc.springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    //通过访问这个url就能访问到这个方法
    @RequestMapping(path="/hello")
    public String hello(){
        return "success";
    }

}
