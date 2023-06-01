package Controller;

import MemberDTO.memberDTO;
import memberDAO.memberDAO;

public class joinController {


	// 사용자가 입력한 데이터 확인
	public String Join(memberDTO memdto) {
		System.out.println("id : " + memdto.getId()+"pw : " + memdto.getPw());
		System.out.println("회원가입이 완료되었습니다");

		memberDAO dao = new memberDAO();
		int cnt = dao.insertMember(memdto);

		String result = null;
		if (cnt > 0) {
			System.out.println("♡  "+memdto.getId()+"님 환영합니다  ♡");
			result = "성공";
		} else {
			System.out.println("회원가입 실패");
			result = "실패";
		}

		return result;
	}
}// class
