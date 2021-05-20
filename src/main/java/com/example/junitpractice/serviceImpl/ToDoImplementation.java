package com.example.junitpractice.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.example.junitpractice.services.ToDoService;

public class ToDoImplementation  {
	
public ToDoImplementation(ToDoService todoService) {
		this.todoService = todoService;
	}

private ToDoService todoService;

public List<String>  retrieveRelatedToString(String user)
{
	List<String> returnList = new ArrayList<String>();
	List<String> todos = todoService.retrieveToDos(user);
	for (String todo: todos)
	{
		if (todo.contains("Spring")) {
			returnList.add(todo);
		}
	

	}
	return returnList;
	
}



	
}
