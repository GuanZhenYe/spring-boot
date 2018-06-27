package com.example.web.Configuration;

import com.example.web.filters.LoginFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hp on 2018/2/17.
 * 注册filter
 */
@Configuration
public class FilterConfiguration {

    @Bean
    public FilterRegistrationBean loginFilter(){

        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new LoginFilter());
        filterRegistrationBean.setEnabled(true);
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }
}
