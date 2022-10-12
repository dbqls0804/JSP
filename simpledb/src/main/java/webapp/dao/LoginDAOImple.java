package webapp.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import webapp.model.Login;
import webapp.util.DBConnectionUtil;

public class LoginDAOImple implements LoginDAO {
	Connection connection = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	
	@Override
	public String loginCheck(Login login) {
		
		try {
			String sql = "SELECT * FROM tbl_login WHERE email=? and password=?";
			connection = DBConnectionUtil.openConnection();
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, login.getEmail()); //로그인 객체에 email
			pstmt.setString(2, login.getPassword()); //로그인 객체에 password
			rs = pstmt.executeQuery();
			if (rs.next()) { // DB에 이메일과 패스워드가 있을 때 (로그인 가능)
				return "true";
			} else {
				return "false"; // DB에 없을 때 (로그인 불가능)
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error"; //에러 발생 시
	}
}
