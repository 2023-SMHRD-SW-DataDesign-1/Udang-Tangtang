package View;

import java.util.Scanner;

import Controller.joinController;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("=======회원가입======");
		System.out.print("[1] 회원가입 [2] 로그인 [3] 게임시작 [4] 랭킹확인 [5] 종료 >> ");
		int select = sc.nextInt();
		while (true) {
			if (select == 1) { // 회원가입
				System.out.print("아이디 입력 : ");
				String id = sc.next();
				System.out.print("비밀번호 입력 : ");
				String pw = sc.next();

				joinController join = new joinController();
				String result = join.Join(id, pw);

				// 회원정보 추가 클래스 (memberDAO)
				// memberDAO 추가 요망

			} else if (select == 2) { // 로그인
				System.out.println("아이디 입력 : ");
				String id = sc.next();
				System.out.println("비밀번호 입력 : ");
				String pw = sc.next();

			} else if (select == 3) {

			} else if (select == 4) {

			} else if (select == 5) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
		} // while
	}// main

}// class
