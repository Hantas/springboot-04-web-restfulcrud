package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public  String hello(){
        return "Hello world";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> maps){
        maps.put("name","<h1>zhangsan</h1>");
        maps.put("users", Arrays.asList("zhangsan","lisi","wangwu"));
        return "success";
    }

}
