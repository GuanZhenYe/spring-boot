package com.example.web.filters;

import com.example.web.Constant.Constant;
import com.example.web.beans.SessionInfo;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by hp on 2018/2/16.
 */
@Component
@ServletComponentScan
@WebFilter(urlPatterns = "/*",filterName = "loginFilter")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        SessionInfo sessionInfo=new SessionInfo();
        sessionInfo.setCellphone("13246667458");
        sessionInfo.setUserId(1);
        sessionInfo.setUserName("GUANZHENYE");

        servletRequest.setAttribute(Constant.SESSION_KEY,sessionInfo);

        System.out.println("------ 111111");

        //下一个过滤链处理
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
