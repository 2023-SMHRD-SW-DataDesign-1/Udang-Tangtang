package Controller;

import MemberDTO.memberDTO;
import memberDAO.memberDAO;

public class joinController {


	// 사용자가 입력한 데이터 확인
	public String Join(memberDTO memdto) {

		memberDAO dao = new memberDAO();
		int cnt = dao.insertMember(memdto);

		String result = null;
		if (cnt > 0) {
			System.out.println();
			System.out.println("회원가입이 완료되었습니다");
			System.out.println();
			System.out.println("♡  "+memdto.getId()+"님 환영합니다  ♡");
			result = "성공";
		} else {
			System.out.println();
			System.out.println();
			System.out.println("이미 존재하는 ID를 입력하여 회원가입에 실패하였습니다 T0T");
			result = "실패";
		}

		
		return result;
	}
}// class
