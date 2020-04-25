package com.springboot.profiles.active.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.profiles.active.exception.ApiRequestException;
import com.springboot.profiles.active.exception.ApiRequestExceptionHandler;
import com.springboot.profiles.active.exception.ResponsePayload;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFilter1 implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {


        System.out.println("In do filter 1");
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse ;


        ServletContext servletContext = request.getServletContext();
        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        ApiRequestExceptionHandler handler = webApplicationContext.getBean(ApiRequestExceptionHandler.class);






        System.out.println("URL Path : - "+request.getRequestURL());
        System.out.println("request URI"+request.getMethod());
        System.out.println("user "+request.getRemoteUser());
        System.out.println("Auth Type"+request.getAuthType());

        String requestMethod = request.getMethod();
        System.out.println("Request Method :- "+requestMethod);

        try {
            if (requestMethod.equals("GET")){
                System.out.println("throwing exceptions : : ");
                throw new ApiRequestException("Users GET request");
            }

        }catch (ApiRequestException e){

           ResponseEntity<ResponsePayload> entity = handler.handleException(e);
           response.setContentType("application/json");


            ObjectMapper mapper = new ObjectMapper();
            PrintWriter out = response.getWriter();
            out.print(mapper.writeValueAsString(entity.getBody().toString()));
            out.flush();
        }

        filterChain.doFilter(servletRequest,servletResponse);

    }
}
