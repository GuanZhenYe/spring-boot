package com.example.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

/**
 * Created by hp on 2018/6/28.
 */
@Component
public class CustomFilter extends ZuulFilter{
    public CustomFilter() {
        super();
        System.out.println("CustomFilter init");
    }

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("run");
        return null;
    }
}
