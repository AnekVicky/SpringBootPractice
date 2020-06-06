package com.springboot.servicelocatorexample;
/*
created by ANEK SINGH on 5/12/2020
*/

import com.springboot.profiles.active.ProfilesApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ServiceLocatorExample {
    public static void main(String[] args) {

        SpringApplication.run(ProfilesApplication.class, args);
        System.out.println("Here is the Spring boot app ");



    }
}
