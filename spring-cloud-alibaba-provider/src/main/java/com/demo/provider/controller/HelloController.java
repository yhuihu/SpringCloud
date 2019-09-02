package com.demo.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    private String port;
    @RequestMapping("hello/{hello}")
    public String hello(@PathVariable(value = "hello") String hello){
        return hello+"I'm from "+port;
    }
}
