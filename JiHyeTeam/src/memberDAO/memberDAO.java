package memberDAO;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import MemberDTO.memberDTO;

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
            System.out.println("♥");
         } else {
            System.out.println("연결 실패");
         }
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      } catch (SQLException e) {
         e.printStackTrace();
      }

   }

   public int insertMember(memberDTO memdto) {
      getCon();
      String sql = "insert into member values(?,?,?)";
      int cnt = 0;
      try {
         pst = conn.prepareStatement(sql);
         pst.setString(1, memdto.getId());
         pst.setString(2, memdto.getPw());
         pst.setInt(3, memdto.getScore());

         cnt = pst.executeUpdate();

      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         getClose();

      }
      return cnt;
   }

   public void getClose() {

      try {
    	  if (rs != null)
    		  rs.close();
         if (pst != null)
            pst.close();
         if (conn != null)
            conn.close();
      } catch (SQLException e) {
         e.printStackTrace();
      }

   }

   public memberDTO loginMember(memberDTO memdto) {
      getCon();
      try {
         String sql = "select id from member where id = ? and pw = ?";

         pst = conn.prepareStatement(sql);

         pst.setString(1, memdto.getId());
         pst.setString(2, memdto.getPw());

         rs = pst.executeQuery();

         if (rs.next()) {
            
         }
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         getClose();
      }
      return memdto;
   }
   
   
   public int insertScore(memberDTO memdto, int score) {
	   getCon();
	   int cnt = 0;
	   try {
		   String sql = "update member set score = ? where id = ? pw = ?";
		   pst =  conn.prepareStatement(sql);
		   
		   pst.setInt(1,score);
		   pst.setString(2,memdto.getId());
		   pst.setString(3,memdto.getPw());
		   
		   cnt = pst.executeUpdate();
		   
	   } catch (SQLException e) {

		   e.printStackTrace();
	   }finally {
		   getClose();
	   }
	   return cnt;
	   
   }
   
   public String Rankingck() {
      String result = null;
      getCon();
      try {
      String sql = "select rownum, id, score from(select * from member order by score desc) where rownum <= 10";
      
      pst = conn.prepareStatement(sql);
      
      rs = pst.executeQuery();
      
      while(rs.next()) {
         result = rs.getString("id")+rs.getString("rownum")+rs.getString("score");
         
      }
      } catch (SQLException e) {
         e.printStackTrace();
         
      }finally {
         getClose();
      }
   
      return result;
}
   
   
   

   
}