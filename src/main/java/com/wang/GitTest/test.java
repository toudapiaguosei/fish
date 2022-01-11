package com.wang.GitTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @RequestMapping(value = "test")
    public String test(){
        return "测试";
    }
}
