package Controller;

import MemberDTO.memberDTO;
import memberDAO.memberDAO;

public class loginController {

	
	
	public String login(memberDTO memdto) {
	    	 //유저 이용값 확인
		System.out.println("id는 "+memdto.getId());
	    	 System.out.println("pw는 "+memdto.getPw());
	    	 memberDAO dao = new memberDAO();
	    	 String result = dao.loginMember(memdto);
	    	 
	    	 
	    	 return result;
	    	 
	     } 
	
	
}// class