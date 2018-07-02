package com.example.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by hp on 2018/6/28.
 */
@Service
public class RibbonService {

    private static Logger log= LoggerFactory.getLogger(RibbonService.class);

    @Autowired
    private RestTemplate restTemplate;

    //断路由
    @HystrixCommand(fallbackMethod = "breaker")
    public String hiService(String name) {

        log.debug("ribbon loads balancing");
        return restTemplate.getForObject("http://eureka-client/test?name="+name,String.class);
    }

    public String breaker(String name){
        return "server unreachable"+name;
    }
}
