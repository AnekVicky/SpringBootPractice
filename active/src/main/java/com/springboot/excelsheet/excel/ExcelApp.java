package com.springboot.excelsheet.excel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active}.properties")
public class ExcelApp {

	public static void main(String[] args) {

		SpringApplication.run(ExcelApp.class, args);
		System.out.println("Here is the Spring boot app ");
	}

}
