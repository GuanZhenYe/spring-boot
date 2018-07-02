package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hp on 2018/7/2.
 */
@RestController
public class TestController {

    @Value("${test}")
    private String value;

    @RequestMapping(value = "/value")
    public String config(){

        return value;
    }
}
