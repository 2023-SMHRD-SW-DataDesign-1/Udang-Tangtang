package Controller;

import MemberDTO.memberDTO;
import memberDAO.memberDAO;

public class loginController {

	
	memberDTO dto = new memberDTO();
	
	
	public String login( String id, String pw) {
	    	 //유저 이용값 확인
		System.out.println("id는 "+dto.getId());
	    	 System.out.println("pw는 "+dto.getPw());
	    	 memberDAO dao = new memberDAO();
	    	 String result = dao.loginMember(id, pw);
	    	 
	    	 return result;
	    	 
	     } 
	
	
}// class
