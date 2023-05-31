package View;



import java.util.Scanner;

import Controller.HardMusicController;
import Controller.ScoreController;
import Controller.joinController;
import Controller.loginController;
//github.com/2023-SMHRD-SW-DataDesign-1/JiHye-Team.git
import MemberDTO.memberDTO;
import memberDAO.memberDAO;

public class main {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      while (true) {
    	  System.out.println("=======딩가딩가======");
    	  System.out.print("[1] 회원가입 [2] 게임시작 [3] 랭킹확인 [4] 종료 >> ");
    	  int select = sc.nextInt();
         if (select == 1) { // 회원가입
            System.out.print("아이디 입력 : ");
            String id = sc.next();
            System.out.print("비밀번호 입력 : ");
            String pw = sc.next();
            
            memberDTO memdto = new memberDTO(id,pw);
            joinController join = new joinController();
            join.Join(memdto);


            // 회원정보 추가 클래스 (memberDAO)
            // memberDAO 추가 요망

         }  else if (select == 2) { // 게임시작
        	 
            System.out.print("난이도 선택 [1] 상   [2] 중   [3] 하 >> ");
            int choice = sc.nextInt();
            HardMusicController hard = new HardMusicController();
            int score = hard.HardPlay();
            
            System.out.println("아이디 입력 : ");
            String id = sc.next();
            System.out.println("비밀번호 입력 : ");
            String pw = sc.next();
            
            
            ScoreController scocon = new ScoreController();
            String result = scocon.hardScoreController(new memberDTO(id,pw), score);
            System.out.println(result);
           
            
         } else if (select == 3) {
            String result = null;
            System.out.println("순위를 확인합니다.");
            memberDAO dao = new memberDAO();
            dao.Rankingck();
            System.out.println(result);

         } else if (select == 4) { // 종료
            System.out.println("종료되었습니다.");
            break;
         } else {
            System.out.println("다시 입력해주세요.");
         }
      } // while
   }// main

}// class