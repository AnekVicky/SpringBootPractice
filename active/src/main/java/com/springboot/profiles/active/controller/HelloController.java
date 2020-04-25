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

    System.out.println("user details :- "+details.getUsername());
    String s = "Singh, Anek";
    String[] names = s.split(",");
    String firstName = names[1];
    String lastName =  names[0];
    System.out.println("FirstName :- " + firstName);
    System.out.println("LastName : -"  +  lastName);


    return "Hello there !!! ";

}
@GetMapping("/request/exception")

    public ResponseEntity createException(){

    throw new ApiRequestException("bad request");

    }

}
