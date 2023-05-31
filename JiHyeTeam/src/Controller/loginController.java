package Controller;

import MemberDTO.memberDTO;
import memberDAO.memberDAO;

public class loginController {

   
   
   public memberDTO login(memberDTO memdto) {
           //유저 이용값 확인
           
           memberDAO dao = new memberDAO();
           dao.loginMember(memdto);
           
           System.out.print(memdto.getId()+"님 환영합니다");
           
           return memdto;
           
        } 
   
   
}// class