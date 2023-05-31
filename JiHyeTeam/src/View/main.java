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
			System.out.println(".....:        .......,:~=.........................");
			System.out.println(".....:        .......-:~*.........................");
			System.out.println(".....;      ,-......-:~!..........................");
			System.out.println(".....;,    .~:~-,,-~:~-;..........................");
			System.out.println("..... =,  .-~~~~~~~~-:*...........................");
			System.out.println("......~~....,$------*: ..,,,......................");
			System.out.println("......,*,....~*;!!;#!;*!;:~:;!!;;.................");
			System.out.println(".......;-....,!~~=!::~--,,,,...--=;-,.............");
			System.out.println("....... ;.....,;,  ..,,,,,.....,.~!-,-*!..........");
			System.out.println("........;,....         .,.......-,  ...,!. .......");
			System.out.println(".........!..          ..--,.....,    ....!........");
			System.out.println(".......  =          :..   .:...-     ....~........");
			System.out.println("....... !.       ,..        ~..~    ..... =.......");
			System.out.println(".......*,      .-            -.,     ...  *.......");
			System.out.println("..... ~.     .-              -.-   .....  ~,......");
			System.out.println(".....~~    .,        !@=      ~~   .....  ~,......");
			System.out.println(".....:    -,         @@ .     .-   ....   !.......");
			System.out.println("....:.   ~           =@.       ,-   ...   #.......");
			System.out.println("....!  -,            ,@=-;     --.  ...  ~,.......");
			System.out.println("...~  -               #@@@,     ~;.. ...,;........");
			System.out.println(".. ; -.               :@@@!     -,::.. -!.........");
			System.out.println("...!..                 $@@@     ,--:;!!!-.........");
			System.out.println("...~;                  :@#$=     :,~::::,.........");
			System.out.println("..~,.  .                =:~=     !~::::~..........");
			System.out.println("..;,  !@;               .!*~     ;~:::~*..........");
			System.out.println("..;.  $=                         :::::~=..........");
			System.out.println(". !,. ~# .                       ;:::~;...........");
			System.out.println(":,~~ ,@!*           .-          !::~-;...........");
			System.out.println(".$ ..  #@@-        .;:~,         ::~-;,...........");
			System.out.println(",. . . -@@@      ,::~---        -:~-~~............");
			System.out.println("-   ,.  $#=~    -;:-----        ~~~;;.............");
			System.out.println(",~  -,  ~;:~    --.--,-,       .:~:;     .........");
			System.out.println(".$...,,  -~     -, ,,.        .~~=~..,,,..........");
			System.out.println(".$...,,  -~     -, ,,.        .~~=~..,,,..........");
			System.out.println(".,~..-,         ,,     .     .~;$;!**!!!!**::.....");
			System.out.println("..:~..::         .   ..     .;=~--~:::::::::;$-. .");
			System.out.println("....-~!~-          .      ,;:----~::::::::::::!;..");
			System.out.println(".......;;-             --;:::----::::::::::::~,;,.");
			System.out.println("....... ;!!.       ..:--*~:::~--:~::::::::::~  .#.");
			System.out.println(".........,-=$=!;*$!,.....!:::;-:$=~~~:::::~.    ~-");
			System.out.println("................~!.......,;:::=...;!*-          -~");
			System.out.println("...............~~:........!::::,.....**,        ;-");
			System.out.println("............ .!:-~  ......;:::~-......,~*.     ,*.");
			System.out.println("...........,:*:::~     ...!::~:;........-*!-..~! .");
			System.out.println(".........,$:. ,:~:     ..~::~.:$...........!##~...");
			System.out.println(".........=   .~:=--   ..-;::, ~* .................");
			System.out.println(".........-*!!*:!!. ~---;:::~  ~:, ................");
			System.out.println("............ ..=--  .~:::~,   ~~: ................");
			System.out.println("..............;,  ,,:-. .    ~!~!.................");
			System.out.println("............,;~       .,-----,-.:.................");
			System.out.println("............=                 -,-.................");
			System.out.println("...........!.                  -~ ................");
			System.out.println(".........,*                    -:.................");
			System.out.println(".........*       ,!#!~--,,     ,; ................");
			System.out.println("........:.     ,=:,..-~~~!,    ,~.................");
			System.out.println("........;  ..~;!..........!     -~................");
			System.out.println(".......,~--,$~............;-    -$................");
			System.out.println("....... ;*~-...............*.   -*................");
			System.out.println("...........................,;   ,~................");
			System.out.println("............................::  .,,...............");
			System.out.println(".............................;, ,--...............");
			System.out.println("..............................*~---...............");
			System.out.println("...............................=#!................");
			System.out.println("..............................,...................");
			System.out.println("==================================================");
			System.out.println("         우당탕탕 뮤직배틀에 오신것을 환영합니다.          ");
			System.out.print(" [0] 룰설명 [1] 회원가입 [2] 게임시작 [3] 랭킹확인 [4] 종료 >> ");
			int select = sc.nextInt();
			if (select == 0) {// 룰 설명

			} else if (select == 1) { // 회원가입
				System.out.print("아이디 입력 : ");
				String id = sc.next();
				System.out.print("비밀번호 입력 : ");
				String pw = sc.next();

				memberDTO memdto = new memberDTO(id, pw);
				joinController join = new joinController();
				join.Join(memdto);

			} else if (select == 2) { // 게임 시작

				
				System.out.print("난이도 선택 [1] Easy   [2] Normal   [3] Hard >> ");
				int choice = sc.nextInt();

				if(mp3.isPlaying()) {
					mp3.stop();
				}
				if (choice == 1) {// 이지난이도
					EasyMusicController easy = new EasyMusicController();
					int score = easy.EasyPlay();

					if(mp3.isPlaying()) {
						mp3.stop();
					}
					mp3.play("music/로비BGM.mp3");
					System.out.println("점수저장을 위해 로그인해주세요 :)");
					System.out.println("아이디 입력 : ");
					String id = sc.next();
					System.out.println("비밀번호 입력 : ");
					String pw = sc.next();
					
					
					ScoreController scocon = new ScoreController();
					String result = scocon.hardScoreController(new memberDTO(id, pw), score);
					System.out.println(result);
					System.out.println();
					System.out.print("메인화면으로 돌아가시려면 아무숫자나 입력해주세요 >>");
					sc.nextInt();
					
					
				} else if (choice == 2) {// 노말난이도

					NormalMusicController normal = new NormalMusicController();
					int score = normal.NormalPlay();
					
					if(mp3.isPlaying()) {
						mp3.stop();
					}
					mp3.play("music/로비BGM.mp3");
					System.out.println("점수저장을 위해 로그인해주세요 :)");
					System.out.println("아이디 입력 : ");
					String id = sc.next();
					System.out.println("비밀번호 입력 : ");
					String pw = sc.next();

					ScoreController scocon = new ScoreController();
					String result = scocon.hardScoreController(new memberDTO(id, pw), score);
					System.out.println(result);
					System.out.println();
					System.out.print("메인화면으로 돌아가시려면 아무숫자나 입력해주세요 >>");
					sc.nextInt();

				} else if (choice == 3) {// 하드난이도

					HardMusicController hard = new HardMusicController();
					int score = hard.HardPlay();
					
					if(mp3.isPlaying()) {
						mp3.stop();
					}
					mp3.play("music/로비BGM.mp3");
					System.out.println("점수저장을 위해 로그인해주세요 :)");

					System.out.println("아이디 입력 : ");
					String id = sc.next();
					System.out.println("비밀번호 입력 : ");
					String pw = sc.next();

					ScoreController scocon = new ScoreController();
					String result = scocon.hardScoreController(new memberDTO(id, pw), score);
					System.out.println(result);
					System.out.println();
					System.out.print("메인화면으로 돌아가시려면 아무숫자나 입력해주세요 >>");
					sc.nextInt();
			
					

				}else {
					System.out.println("잘못입력하셨습니다. 메인화면으로 돌아갑니다!");
					
				}

			} else if (select == 3) {// 랭킹확인
				String result = null;
				memberDAO dao = new memberDAO();
				
                
	            System.out.println("	          .dkoooooooooooookl.");              
	            System.out.println("	        ,oox.              .dxol.");
	            System.out.println("	        o0cco               0ld0;");
	            System.out.println("	        oOO0o               O0oo ");
	            System.out.println("	        l0:kd.             .kao0,");
	            System.out.println("	        .cxkKO            .KKkx;");
	            System.out.println("	         .:xKx           ;O0o,");
	            System.out.println("	            .lxdl:;;;:ldxc.");
	            System.out.println("	              .;OKdcxXx,.");
	            System.out.println("	                 KdcxXx  ");
	            System.out.println("	               .dk. ,Oc");
	            System.out.println("	               .xKo:xKl.");
	            System.out.println("	              'dkocccdkl.");
	            System.out.println("	          .,;dKOc,,,,;oK0l;.,");
	            System.out.println("	         qkOooolllllllloood0dp");
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
				System.out.print("메인화면으로 돌아가시려면 아무숫자나 입력해주세요 >>");
				sc.nextInt();

			} else if (select == 4) { // 종료
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
		} // while
	}// main

}// class