package com.example.junitpractice;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JunitPracticeApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void test() {
		assertTrue(true);
	}

}
