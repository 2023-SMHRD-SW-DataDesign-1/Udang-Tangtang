package Controller;

import MemberDTO.memberDTO;
import memberDAO.memberDAO;

public class loginController {

	
	
	public String login(memberDTO memdto) {
	    	 memberDAO dao = new memberDAO();
	    	 String result = dao.loginMember(memdto);
	    	
	    	 return result+"님이 로그인하셨습니다.";
	}
	
	
}// class
