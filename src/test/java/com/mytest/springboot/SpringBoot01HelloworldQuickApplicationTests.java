package com.mytest.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot01HelloworldQuickApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testSout() {
		System.out.println("test");
	}

	@Test
	public void helloWorld() {
		System.out.println("hw");
	}
}
