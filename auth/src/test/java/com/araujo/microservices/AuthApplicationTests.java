package com.araujo.microservices;

import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.w3c.dom.ls.LSOutput;

@SpringBootTest
class AuthApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void test(){
		System.out.println(new BCryptPasswordEncoder().encode("user01"));
		// $2a$10$qgj8NcCYXOudNWXrjVVHV.90iNhkjDinH9DQ5IwpA7BuBjGYpSGSy
	}

}
