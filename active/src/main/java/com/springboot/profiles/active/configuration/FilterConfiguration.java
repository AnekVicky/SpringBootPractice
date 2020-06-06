package com.springboot.profiles.active.configuration;


import com.springboot.profiles.active.filter.MyFilter1;
import com.springboot.profiles.active.filter.MyFilter2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
/*
@Configuration
public class FilterConfiguration {


    @Bean
    FilterRegistrationBean createFilter1Bean(){
        return registeFilterRegistrationBean(new MyFilter1(),"/hello/*");
    }


    @Bean
    FilterRegistrationBean createFilter2Bean(){
        return registeFilterRegistrationBean(new MyFilter2(),"/request/*");
    }



    FilterRegistrationBean registeFilterRegistrationBean (Filter filter,String urlPattern ){

        FilterRegistrationBean filterRegistrationBean  = new FilterRegistrationBean();
        System.out.println("Filter Type : "+filter.getClass().getName());
        filterRegistrationBean.setFilter(filter);
        filterRegistrationBean.addUrlPatterns(urlPattern);


        return filterRegistrationBean;
    }



}*/
