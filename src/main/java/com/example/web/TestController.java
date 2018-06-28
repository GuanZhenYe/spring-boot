package com.example.web;

import com.example.web.annotation.SessionUser;
import com.example.web.beans.CustomConfig;
import com.example.web.beans.SessionInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hp on 2018/2/16.
 */
@RestController
public class TestController {

    @Autowired
    private CustomConfig customConfig;

    @RequestMapping(value = "/test",produces = "text/plain;charset=utf-8")
    public Object test(@SessionUser SessionInfo sessionInfo){

        System.out.println(customConfig.getRedisUrl()+":"+customConfig.getRedisPort());
        if(sessionInfo!=null){
//            return sessionInfo;
            System.out.println(sessionInfo.toString());
            return sessionInfo;
        }
        return "123  "+customConfig.getRedisUrl()+":"+customConfig.getRedisPort();
    }
}
