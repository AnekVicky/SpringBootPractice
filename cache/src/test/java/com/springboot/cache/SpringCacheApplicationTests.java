package com.springboot.cache;

import com.springboot.cache.model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.io.IOException;

@SpringBootTest
class SpringCacheApplicationTests {

	@Test
	void testContextLoads() throws IOException {
		System.out.println("checking two objects equality");
		/*System.out.println(
				SpringCacheApplicationTests.class.getClassLoader().getResourceAsStream("index.html")

		);*/
		System.out.println(getClass().getClassLoader().getResourceAsStream("1.html").read());


	}

}
