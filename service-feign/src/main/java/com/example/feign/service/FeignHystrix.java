package com.example.feign.service;

import org.springframework.stereotype.Component;

/**
 * Created by hp on 2018/6/29.
 * fallback 熔断器处理
 */
@Component
public class FeignHystrix implements FeignSevice {
    @Override
    public String loadBlanceForUrl(String name) {
        return "error";
    }
}
