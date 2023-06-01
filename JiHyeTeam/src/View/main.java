package View;


import java.util.Scanner;

import Controller.EasyMusicController;
import Controller.HardMusicController;
import Controller.NormalMusicController;
import Controller.ScoreController;
import Controller.joinController;

import MemberDTO.memberDTO;
import javazoom.jl.player.MP3Player;
import memberDAO.memberDAO;


public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MP3Player mp3 = new MP3Player();
		while (true) {
			if(mp3.isPlaying()) {
				mp3.stop();
			}
			mp3.play("music/로비BGM.mp3");
			System.out.println("........ ............. :;.........................");
			System.out.println(".......~#$$#-  ........*=.........................");
			System.out.println("......!,. .-:;!.... .,*:!.........................");
			System.out.println(".....!      -,~*;--~!!~::.........................");
			System.out.println(".....:       ,,,,,,,,.~::. .......................");
			System.out.println(".....;      ,-......-:~!..........................");
			System.out.println(".....;,    .~:~-,,-~:~-;..........................");
			System.out.println("..... =,  .-~~~~~~~~-:*...........................");
			System.out.println("......~~....,$------*: ..,,,......................");
			System.out.println("......,*,....~*;!!;#!;*!;:~:;!!;;.................");
			System.out.println(".......;-....,!~~=!::~--,,,,...--=;-,.............");
			System.out.println("....... ;.....,;,  ..,,,,,.....,.~!-,-*!..........");
			System.out.println("........;,....         .,.......-,  ...,!. .......");
			System.out.println(".........!..          ..--,.....,    ....!........");
			System.out.println("....... !.       ,..        ~..~    ..... =.......");
			System.out.println("..... ~.     .-.             -.-   .....  ~,......");
			System.out.println(".....~~    .,        !@=      ~~   .....  ~,......");
			System.out.println(".....:    -,         @@ .     .-   ....   !.......");
			System.out.println("....:.   ~           =@.       ,-   ...   #.......");
			System.out.println("....!  -,            ,@=-;     --.  ...  ~,.......");
			System.out.println("...~  -               #@@@,     ~;.. ...,;........");
			System.out.println(".. ; -.               :@@@!     -,::.. -!.........");
			System.out.println("...!..                 $@@@     ,--:;!!!-.........");
			System.out.println("...~;                  :@#$=     :,~::::,.........");
			System.out.println("..;,  !@;               .!*~     ;~:::~*..........");
			System.out.println("..;.  $=                         :::::~=..........");
			System.out.println(". !,. ~# .                       ;:::~;...........");
			System.out.println(":,~~ ,@!*.           .-          !::~-;...........");
			System.out.println(".$ ..  #@@-        .;:~,         ::~-;,...........");
			System.out.println(",. . . -@@@      ,::~---        -:~-~~............");
			System.out.println("-   ,.  $#=~    -;:-----        ~~~;;.............");
			System.out.println(".$...,,  .~     -, ,,.        .~~=~..,,,..........");
			System.out.println(".,~..-,         ,,     .     .~;$;!**!!!!**::.....");
			System.out.println("..:~..::         .   ..     .;=~--~:::::::::;$-. .");
			System.out.println("....-~!~-          .      ,;:----~::::::::::::!;..");
			System.out.println("....... ;!!.       ..:--*~:::~--:~::::::::::~  .#.");
			System.out.println(".........,-=$=!;*$!,.....!:::;-:$=~~~:::::~.    ~-");
			System.out.println("............ .!:-~  ......;:::~-......,~*.     ,*.");
			System.out.println("...........,:*:::~     ...!::~:;........-*!-..~! .");
			System.out.println(".........,$:. ,:~:     ..~::~.:$...........!##~...");
			System.out.println(".........=   .~:=--   ..-;::, ~* .................");
			System.out.println(".........-*!!*:!!. ~---;:::~  ~:, ................");
			System.out.println("............ ..=--  .~:::~,   ~~: ................");
			System.out.println("==================================================");
			System.out.println("        우당탕탕 뮤직배틀에 오신것을 환영합니다.          ");
			System.out.println();
			System.out.println("                  [0] 룰 설명");
			System.out.print("[1] 회원가입 [2] 게임시작 [3] 랭킹확인 [4] 종료 >> ");
			int select = sc.nextInt();
			if (select == 0) {// 룰 설명
				System.out.println();
				System.out.println("==================================================");
				System.out.println();
				System.out.println("               <<룰 설명>>");
				System.out.println("- 난이도별로 각각 10개의 문제가 출제됩니다.\r\n"
						+ "- 노래는 60초 동안만 흘러나와요.\r\n"
						+ "- 정답은 띄어쓰기없이 한글로만 작성해주세요.\r\n"
						+ "▶ easy   : 1994 ~ 2003년도 노래"
						+ "▶ normal : 2004 ~ 2013년도 노래"
						+ "▶ hard   : 2014 ~ 2023년도 노래"
						+ "- 노래제목을 맞췄을 경우, 점수를 획득하고 다음 노래로 넘어가요.\r\n"
						+ " >> Easy는 문제당 100점, Normal은 150점, Hard는 200점 획득!\r\n"
						+ "- 노래제목을 맞추지 못했다면? 힌트보기와 패스중 하나를 선택!. \r\n"
						+ "  [1]힌트보기를 선택하면?\r\n"
						+ "  >> 가수명과 제목의 초성이 뜨고 한번 더 입력할 수 있어요.\r\n"
						+"      단! 힌트 사용 시 주어진 점수의 절반만 획득합니다!\r\n"
						+ "  [2]다음노래로 넘어가기를 선택하면?\r\n"
						+ "  >> 추가입력없이 다음노래로 넘어가요.\r\n"
						+ "- 난이도별로 기회의 개수가 다르게 주어져요.\r\n"
						+ "  >> 기회는 Easy는 5번, Normal은 4번, Hard는 3번입니다.\r\n"
						+ "- 주어진 기회를 다 사용하거나 문제가 다 출제되면 게임이 종료!.\r\n"
						+ "- 종료 후 점수를 저장하기위해 로그인을 해주세요.\r\n"
						+ " ☆로그인 실패시 점수가 저장되지 않으니 유의하세요!!☆\r\n"
						+ "");
				System.out.println();
				System.out.print("메인화면으로 돌아가시려면 아무거나 입력해주세요 >>");
				sc.next();
				
			

			} else if (select == 1) { // 회원가입
				System.out.print("아이디 입력 : ");
				String id = sc.next();
				System.out.print("비밀번호 입력 : ");
				String pw = sc.next();

				memberDTO memdto = new memberDTO(id, pw);
				joinController join = new joinController();
				join.Join(memdto);
				
				System.out.println();
				System.out.print("메인화면으로 돌아가시려면 아무거나 입력해주세요 >>");
				sc.next();

			} else if (select == 2) { // 게임 시작
				System.out.println("==================================================");
				System.out.println();
				System.out.print("난이도 선택 [1] Easy   [2] Normal   [3] Hard >> ");
				int choice = sc.nextInt();
				System.out.println();
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				if (choice == 1) {// 이지난이도
					System.out.println("==================================================");
					EasyMusicController easy = new EasyMusicController();
					int score = easy.EasyPlay();

					if(mp3.isPlaying()) {
						mp3.stop();
					}
					mp3.play("music/로비BGM.mp3");
					System.out.println("점수저장을 위해 로그인해주세요 :) ♥");
					System.out.println("☆로그인 실패시 점수가 저장되지 않으니 유의하세요!!☆");
					System.out.println();
					System.out.println("아이디 입력 : ");
					String id = sc.next();
					System.out.println("비밀번호 입력 : ");
					String pw = sc.next();
					
					
					ScoreController scocon = new ScoreController();
					String result = scocon.hardScoreController(new memberDTO(id, pw), score);
					System.out.println(result);
					System.out.println();
					System.out.print("메인화면으로 돌아가시려면 아무거나 입력해주세요 >>");
					sc.next();
					
					
				} else if (choice == 2) {// 노말난이도
					System.out.println("==================================================");
					NormalMusicController normal = new NormalMusicController();
					int score = normal.NormalPlay();
					
					if(mp3.isPlaying()) {
						mp3.stop();
					}
					mp3.play("music/로비BGM.mp3");
					System.out.println("점수저장을 위해 로그인해주세요 :) ♥");
					System.out.println();
					System.out.println("아이디 입력 : ");
					String id = sc.next();
					System.out.println("비밀번호 입력 : ");
					String pw = sc.next();

					ScoreController scocon = new ScoreController();
					String result = scocon.hardScoreController(new memberDTO(id, pw), score);
					System.out.println(result);
					System.out.println();
					System.out.print("메인화면으로 돌아가시려면 아무거나 입력해주세요 >>");
					sc.next();

				} else if (choice == 3) {// 하드난이도
					System.out.println("==================================================");
					HardMusicController hard = new HardMusicController();
					int score = hard.HardPlay();
					
					if(mp3.isPlaying()) {
						mp3.stop();
					}
					mp3.play("music/로비BGM.mp3");
					System.out.println("점수저장을 위해 로그인해주세요 :) ♥");

					System.out.println("아이디 입력 : ");
					String id = sc.next();
					System.out.println("비밀번호 입력 : ");
					String pw = sc.next();

					ScoreController scocon = new ScoreController();
					String result = scocon.hardScoreController(new memberDTO(id, pw), score);
					System.out.println(result);
					System.out.println();
					System.out.print("메인화면으로 돌아가시려면 아무거나 입력해주세요 >>");
					sc.next();
			
					

				}else {
					System.out.println("잘못입력하셨습니다. 메인화면으로 돌아갑니다!");
					
				}

			} else if (select == 3) {// 랭킹확인
				
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				mp3.play("music/랭킹BGM.mp3");
				String result = null;
				memberDAO dao = new memberDAO();
				System.out.println("--------------------------------------------------");
                System.out.println();
                System.out.println();
                System.out.println();
	            System.out.println("	         .dkoooooooooooookl.");              
	            System.out.println("	       ,oox.              .dxol.");
	            System.out.println("	       o0cco               0ld0;");
	            System.out.println("	       oOO0o               O0oo ");
	            System.out.println("	       l0:kd.             .kao0,");
	            System.out.println("	       .cxkKO            .KKkx;");
	            System.out.println("	        .:xKx           ;O0o,");
	            System.out.println("	           .lxdl:;;;:ldxc.");
	            System.out.println("	             .;OKdcxXx,.");
	            System.out.println("	                KdcxXx  ");
	            System.out.println("	              .dk. ,Oc");
	            System.out.println("	              .xKo:xKl.");
	            System.out.println("	             'dkocccdkl.");
	            System.out.println("	         .,;dKOc,,,,;oK0l;.,");
	            System.out.println("	        qkOooolllllllloood0dp");
	            
	            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	            System.out.println("                      ☆1위☆                      ");
	            System.out.println();
	            System.out.println("                    "+dao.Rankck1());
	            System.out.println();
	            System.out.println();
	            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	            System.out.println();
	            dao.Rankingck();
	            System.out.println();
				System.out.print("메인화면으로 돌아가시려면 아무거나 입력해주세요 >>");
				sc.next();

			} else if (select == 4) { // 종료
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
		} // while
	}// main

}// class