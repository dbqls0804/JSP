package webapp.login;

public class LoginService {

	// 임시 관리자 유저 dbqls0804 패스워드 1234 맞으면 참 틀리면 거짓
	public boolean isUserValid(String user, String password) {
		if (user.equals("betty") && password.equals("1234")) {
			return true;
		}
		return false;
	}

}
