package com.demo.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private ConfigurableApplicationContext applicationContext;
    @RequestMapping("hello/{hello}")
    public String hello(@PathVariable(value = "hello") String hello){
        return hello;
    }
    @GetMapping("/environment")
    public String test(){
        return applicationContext.getEnvironment().getProperty("user.name");
    }
}
