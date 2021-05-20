package com.example.junitpractice.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/foo")
	public String getFoo()
	{
		return "foo";
	}

}
