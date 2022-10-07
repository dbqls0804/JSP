package webapp.todo;

import java.util.Objects;

public class Todo {

	private String name; //할일
	private String category; //할일종류
	
	public Todo(String name, String category) {
		this.name = name;
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Todo [name=" + name + ", category=" + category + "]";
	}

	//오른쪽 마우스 sorce에서 -> hashcode와 equals 메소드를 다시 만듬
	//문자열 이름이 같으면 같은 객체로 판단
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override //문자열 이름이 같으면 같은 객체로 판단
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		return Objects.equals(name, other.name);
	}
	
}
