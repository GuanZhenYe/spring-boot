package com.example.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by hp on 2018/6/29.
 */
@Component
@FeignClient(value = "eureka-client",fallback = FeignHystrix.class)
public interface FeignSevice {

    @RequestMapping(value = "/test")
    public String loadBlanceForUrl(@RequestParam("name") String name);
}
