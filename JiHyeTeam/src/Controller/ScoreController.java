package Controller;

import MemberDTO.memberDTO;
import memberDAO.memberDAO;

public class ScoreController {
	
	public String hardScoreController(memberDTO memdto,int score) {
		
		memberDAO dao = new memberDAO();
		int cnt = dao.insertScore(memdto,score);

		String result = null;
		if (cnt > 0) {
			result = memdto.getId()+"님의 점수는"+memdto.getScore()+"입니다.";
		} else {
			result = "점수가 저장되지 않았습니다.";
		}
		return result;
	}

}
