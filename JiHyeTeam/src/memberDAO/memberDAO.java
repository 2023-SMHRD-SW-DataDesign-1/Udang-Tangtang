package memberDAO;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class memberDAO {

	Connection conn;
	PreparedStatement pst;
	ResultSet rs;

	public void getCon() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@project-db-stu.smhrd.com:1524:xe";
			String dbuser = "campus_g_0530_2";
			String dbpw = "smhrd2";

			conn = DriverManager.getConnection(dburl, dbuser, dbpw);

			if (conn != null) {
				System.out.println("conn success");
			} else {
				System.out.println("conn fail");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public int insertMember(String id, String pw) {
		getCon();
		String sql = "insert into member values(?,?)";
		int cnt = 0;
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			pst.setString(2, pw);

			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();

			return cnt;

		}
	}

	public void getClose() {

		try {
			if (pst != null)
				pst.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public String loginMember(String id, String pw) {
		getCon();
		String return_id = null;
		try {
			String sql = "select name from memeber where id = ? and pw = ?";

			pst = conn.prepareStatement(sql);

			pst.setString(1, id);
			pst.setString(2, pw);

			rs = pst.executeQuery();

			if (rs.next()) {
				return_id = rs.getString("id");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return return_id;
	}
}
