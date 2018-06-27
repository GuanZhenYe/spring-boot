package com.example.web.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by hp on 2018/2/16.
 */
@Component
@ConfigurationProperties(prefix = "custom.conf")
public class CustomConfig {

    private String redisUrl;

    private int redisPort;

    public CustomConfig() {
    }


    public String getRedisUrl() {
        return redisUrl;
    }

    public void setRedisUrl(String redisUrl) {
        this.redisUrl = redisUrl;
    }

    public int getRedisPort() {
        return redisPort;
    }

    public void setRedisPort(int redisPort) {
        this.redisPort = redisPort;
    }
}
