package com.demo.consumer.feign.service.fallback;

import com.demo.consumer.feign.service.EchoService;
import org.springframework.stereotype.Component;

@Component
public class EchoServiceFallBack implements EchoService {
    @Override
    public String hello(String message) {
        return "请求失败，请检查网络";
    }
}
