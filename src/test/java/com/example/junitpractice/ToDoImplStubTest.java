package com.example.junitpractice;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;

import com.example.junitpractice.serviceImpl.ToDoImplementation;
import com.example.junitpractice.services.ToDoService;

import stubs.ToDoServiceStub;

class ToDoImplStubTest {

	@Test
	void stubTest() {
		ToDoServiceStub todoservice = new ToDoServiceStub();
		
		ToDoImplementation todoImpl= new ToDoImplementation(todoservice);
		
		List<String> filteredTodos= todoImpl.retrieveRelatedToString("test");
		
		assertEquals(1,filteredTodos.size());
	}
	
	

	@Test
	void mockTest() {
		ToDoService mockTodoservice = mock(ToDoService.class);
		List<String> returnStrings = new ArrayList<String>();
		//returnStrings.add("itsa Spring");
		returnStrings.add("Spring life");
		
		when(mockTodoservice.retrieveToDos("test")).thenReturn(returnStrings);
		
		ToDoImplementation todoImpl= new ToDoImplementation(mockTodoservice);
		
		List<String> filteredTodos= todoImpl.retrieveRelatedToString("test");
		
		assertEquals(1,filteredTodos.size());
	}

}
