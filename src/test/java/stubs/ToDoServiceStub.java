package stubs;

import java.util.ArrayList;
import java.util.List;

import com.example.junitpractice.services.ToDoService;

public class ToDoServiceStub implements ToDoService {

	@Override
	public List<String> retrieveToDos(String user) {
		List<String> someStrings = new ArrayList<String>();
		someStrings.add("Spring life");
		someStrings.add("sad life");
		someStrings.add("boy life");
		someStrings.add("spring life");
		
		return someStrings;
	}

}
