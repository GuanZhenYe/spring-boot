package com.example.ribbon.controller;

import com.example.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hp on 2018/6/28.
 */
@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @RequestMapping(value = "/ribbon")
    public String test(@RequestParam String name) {
        return ribbonService.hiService(name);
    }
}
