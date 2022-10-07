package webapp.todo;

import java.util.ArrayList;
import java.util.List;

import webapp.todo.Todo;

public class TodoService {

	private static List<Todo> todos = new ArrayList<>();
	// static은 미리 실행됨 (아직 DB가 없으므로 우선 테스트용)
	static {
		todos.add(new Todo("JSP 공부하기", "공부"));
		todos.add(new Todo("Servlet 공부하기", "공부"));
		todos.add(new Todo("Study Spring", "공부"));
		todos.add(new Todo("쉬기", "휴식"));
	}
	
	public List<Todo> getTodos(){
		return todos;
	}
	
	public void addTodo(Todo todo){
		todos.add(todo);
	}
	
	//삭제 할때 리스트의 todo객체와 입력한 todo객체가 같은지(equals 메서드로) 비교해서 같으면 삭제
	public void deleteTodo(Todo todo) {
		todos.remove(todo);
	}

}
