package test;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.mysql.jdbc.Connection;

import webapp.dao.EmployeeDAOImple;
import webapp.model.Employee;
import webapp.util.DBConnectionUtil;

public class Test {

	public static void main(String[] args) {
		EmployeeDAOImple dao = new EmployeeDAOImple();
		
		//1. 리스트 불러오기
		//List<Employee> list = dao.get();
		//list.forEach(e -> System.out.println(e));
		
		//2. id 하나만 불러오기
		//Employee employee = dao.get(2);
		//System.out.println(employee);
		
		//3. 저장하기
		//dao.save(new Employee("펭수", "지원부", "2000-12-12"));
		
		//4. 삭제하기
		//dao.delete(6);
		
		//5. 업데이트 하기
		dao.update(new Employee(5, "펭수", "개발부", "2020-12-12"));
		
		
		List<Employee> list = dao.get();
		list.forEach(e -> System.out.println(e));
	}	
}
