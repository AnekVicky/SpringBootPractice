package com.springboot.cache;

import com.springboot.cache.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCacheApplication {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(SpringCacheApplication.class, args);

		Thread thread = new Thread(() -> System.out.println(
				Thread.currentThread().getName()+""+Thread.currentThread().getId()), "ANEK");
		thread.start();

		System.out.println("checking two objects checks");

		Student st1 = new Student("101","anek","singh",720l);

		Student st2 = new Student("101","anek","vicky",720l);

		//System.out.println(st1.hashCode());s
		//System.out.println(st2.hashCode());

		System.out.println(
				SpringCacheApplication.class.getClassLoader().getResourceAsStream("index.html")
		);
		System.out.println(st1.equals(st2));

		System.out.println(context.getClass().getSimpleName());
		System.out.println(context.getBeanDefinitionNames());


	}

}
