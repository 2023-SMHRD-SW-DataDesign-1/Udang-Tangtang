package Controller;

import MemberDTO.memberDTO;
import memberDAO.memberDAO;

public class joinController {

	String id;
	String pw;

	// 사용자가 입력한 데이터 확인
	public String Join(memberDTO dto) {
		System.out.println("id 는 " + dto.getId());
		System.out.println("pw 는 " + dto.getPw());

	

	memberDAO dao = new memberDAO();
	int row = dao.insertMember(id,pw);

	String result = null;
	if(row>0){
		System.out.println("회원가입 성공");
		result = "성공";
	}else{
		System.out.println("회원가입 실패");
		result = "실패";
	}

	  return result;
	}
}// class
