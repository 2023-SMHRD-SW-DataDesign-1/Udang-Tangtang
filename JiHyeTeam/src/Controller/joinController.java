package Controller;

import MemberDTO.memberDTO;

public class joinController {

	public void Join(memberDTO memberDTO) {
		System.out.println("id 는 " + memberDTO.getId());
		System.out.println("pw 는 " + memberDTO.getPw());

	}

}// class
