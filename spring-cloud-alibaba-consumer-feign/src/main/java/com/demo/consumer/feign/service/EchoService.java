package com.demo.consumer.feign.service;

import com.demo.consumer.feign.service.fallback.EchoServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-provider",fallback = EchoServiceFallBack.class)
public interface EchoService {

    @GetMapping(value = "/hello/{message}")
    String hello(@PathVariable("message") String message);
}
