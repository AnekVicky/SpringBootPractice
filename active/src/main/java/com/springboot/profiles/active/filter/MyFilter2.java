package com.springboot.profiles.active.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class MyFilter2 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("In do filter 2 ");
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse ;

        System.out.println("request URI : - "+request.getRequestURI());
        System.out.println("user :-         "+request.getRemoteUser());
        System.out.println("Auth Type : - "  +request.getAuthType());
        System.out.println("request URI  :- "+request.getRequestURI());


        filterChain.doFilter(servletRequest,servletResponse);

    }

}
