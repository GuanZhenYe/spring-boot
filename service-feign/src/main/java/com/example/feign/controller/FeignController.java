package com.example.feign.controller;

import com.example.feign.service.FeignSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hp on 2018/6/29.
 */
@RestController
public class FeignController {

    @Autowired
    private FeignSevice feignSevice;

    @RequestMapping(value = "/feign")
    public String feign(@RequestParam String name){
        return feignSevice.loadBlanceForUrl(name);
    }
}
