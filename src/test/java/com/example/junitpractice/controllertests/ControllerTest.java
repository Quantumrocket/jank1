package com.example.junitpractice.controllertests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.junitpractice.resource.TestController;

@ExtendWith(SpringExtension.class)
@WebMvcTest(TestController.class)
public class ControllerTest {

	@Autowired
	private MockMvc mvc;
	
		@Test
		void checkAPI() throws Exception
		{
			RequestBuilder request = MockMvcRequestBuilders.get("/foo");
			
			MvcResult result = mvc.perform(request).andReturn();
			assertEquals("foo",result.getResponse().getContentAsString());
		}
	
}
