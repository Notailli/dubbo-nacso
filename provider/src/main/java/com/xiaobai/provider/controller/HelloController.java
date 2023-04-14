package com.xiaobai.provider.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {


    @GetMapping(value = "/hello")
    @ResponseBody
    public String index() {
        return "nihao";
    }

}
