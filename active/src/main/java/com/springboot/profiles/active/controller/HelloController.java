package com.springboot.profiles.active.controller;

import com.springboot.profiles.active.exception.ApiRequestException;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:application-${spring.profiles.active}.properties")
public class HelloController {

@GetMapping("/hello/hi")
public String sayHello(@AuthenticationPrincipal UserDetails details){

    String uname = details.getUsername() ;

    return "Hello "+ uname +" !!! ";

}
@GetMapping("/request/exception")

    public ResponseEntity createException(){

    throw new ApiRequestException("bad request");

    }

}
