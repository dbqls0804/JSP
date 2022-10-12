package beans;

public class User {
	private String email;
	private String password;

	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User() {
	}

	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getUser() {
		return email;
	}

	public void setUser(String user) {
		this.email = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
//	이메일과 패스워드가 형식에 체크해서 맞으면 true리턴
	
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", message=" + message + "]";
	}

	public boolean validate() {
		if (email == null) {
			message = "이메일을 입력 해주세요";
			return false;
		}

		if (password == null) {
			message = "패스워드를 입력 해주세요";
			return false;
		}

		if (!email.matches("\\w+@\\w+\\.\\w+")) {
			message = "이메일 형식에 맞지 않습니다.";
			return false;
		}

		if (password.length() < 4) {
			message = "패스워드는 4자 이상";
			return false;
		} else if (password.matches("\\w*\\s+\\w*")) {
			message = "패스워드에 스페이스가 포함되면 안됩니다.";
			return false;
		}
		//모든 체크가 완료되었을 때 true 반환
			return true;
		}


	}

