package webapp.model;

public class Employee {
	//필드 변수
	private Integer id; //직원아이디
	private String name; //이름
	private String department; //부서
	private String dob; //생년월일
	
	public Employee() {}
	
	// id 없는것(입력할때 없어도됨)
	public Employee(String name, String department, String dob) {
		super();
		this.name = name;
		this.department = department;
		this.dob = dob;
	}
	
	// id 있는것(수정할땐 있어야함)
	public Employee(Integer id, String name, String department, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.dob = dob;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", dob=" + dob + "]";
	}
	
	
}
