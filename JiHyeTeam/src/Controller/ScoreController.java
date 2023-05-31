package Controller;

import MemberDTO.memberDTO;
import memberDAO.memberDAO;

public class ScoreController {
	
	public String hardScoreController(memberDTO memdto, int score) {
		
		memberDAO dao = new memberDAO();
		int cnt = dao.insertScore(memdto, score);

		String result = null;
		if (cnt > 0) {
			
			result = memdto.getId()+"님의 점수는"+score+"입니다.";
		} else {
			System.out.println("");
			result = "id나 pw가 틀렸습니다. 다시입력해주세요.";
		}
		return result;
	}

}
