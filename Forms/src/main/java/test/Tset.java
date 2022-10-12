package test;

import beans.User;

public class Tset {

	public static void main(String[] args) {
		User user = new User("ckdbqls0804@naver.com", "1234");
		
		if(user.validate()) {
			System.out.println("검사 성공!");
		} else {
			System.out.println("오류메세지 : " + user.getMessage());
		}
	}

}
