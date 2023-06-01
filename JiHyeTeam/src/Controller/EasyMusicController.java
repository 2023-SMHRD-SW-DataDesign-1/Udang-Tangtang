package Controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


import javazoom.jl.player.MP3Player;
import musicDTO.musicDTO;

public class EasyMusicController {

	ArrayList<musicDTO> easyMusicList = new ArrayList<>();

	MP3Player mp3 = new MP3Player();

	Random rd = new Random();

	Scanner sc = new Scanner(System.in);

	public EasyMusicController() {
		// 곡세팅

		easyMusicList.add(new musicDTO("썸", "소유&정기고", "music/썸.mp3", "ㅆ"));
		easyMusicList.add(new musicDTO("뱅뱅뱅", "빅뱅", "music/뱅뱅뱅.mp3", "ㅂㅂㅂ"));
		easyMusicList.add(new musicDTO("치얼업", "트와이스", "music/cheerup.mp3", "ㅊㅇㅇ"));
		easyMusicList.add(new musicDTO("첫눈처럼너에게가겠다", "에일리", "music/첫눈처럼너에게가겠다.mp3", "ㅊㄴㅊㄹㄴㅇㄱㄱㄱㄷ"));
		easyMusicList.add(new musicDTO("사랑을했다", "아이콘", "music/사랑을했다.mp3", "ㅅㄹㅇㅎㄷ"));
		easyMusicList.add(new musicDTO("2002", "앤마리", "music/2002.mp3", "숫자4개"));
		easyMusicList.add(new musicDTO("아무노래", "지코", "music/아무노래.mp3", "ㅇㅁㄴㄹ"));
		easyMusicList.add(new musicDTO("셀러브리티", "아이유", "music/Celebrity.mp3", "ㅅㄹㅂㄹㅌ"));
		easyMusicList.add(new musicDTO("러브다이브", "아이브", "music/LOVEDIVE.mp3", "ㄹㅂㄷㅇㅂ"));
		easyMusicList.add(new musicDTO("디토", "뉴진스", "music/Ditto.mp3", "ㄷㅌ"));

	}

	public int EasyPlay() {
		int life = 5;
		int correct = 0;
		int i = 0;
		int score = 0;
		int choice = 0;
		while (i < 10) {

			if (life == 0) {
				System.out.println();
				System.out.println("game over TㅅT");
				System.out.println();

				break;
			}

			if (mp3.isPlaying()) {// 음악 정지
				mp3.stop();
			}

			mp3.play(easyMusicList.get(i).getMusicPath());
			System.out.println();
			System.out.println("**************************************************");
			System.out.println();
			System.out.print("노래제목을 입력해주세요 >> ");
			String answer = sc.next();

			if (easyMusicList.get(i).getName().equals(answer)) {
				score += 100;
				System.out.println("정답입니다.");
				correct++;
				i++;
			} else {
				System.out.println("정답이 아닙니다.");
				life--;
				System.out.println("기회가" + life + "번 남았습니다.");
				if (life != 0) {
					System.out.println("[1]힌트보기 [2]다음노래로 넘어가기 >> ");
					choice = sc.nextInt();
					if (choice == 1) {

						System.out.println("=======================================");
						System.out.println(easyMusicList.get(i).getSinger() + "-" + easyMusicList.get(i).getHint());
						System.out.println("=======================================");
						System.out.print("노래제목을 다시 입력해주세요 >> ");
						String answer2 = sc.next();

						if (easyMusicList.get(i).getName().equals(answer2)) {
							score += 50;
							System.out.println("정답입니다.");
							correct++;
							if(i == easyMusicList.size()-1) {
								System.out.println("모든문제가 출제되었습니다! 게임종료!");
							}

						} else {
							if (i != easyMusicList.size() - 1) {
								System.out.println("정답이 아닙니다.");
								life--;
								System.out.println("기회가" + life + "번 남았습니다.");
								
							}else {
								System.out.println("모든문제 출제완료!");
								System.out.println("=======================================");
							}

						}
					} else {
						if (i != easyMusicList.size() - 1) {
							System.out.println("PASS!");
						} else {
							System.out.println("모든문제가 출제되었습니다! 게임종료!");
							System.out.println();
						}
					}
				}
				i++;
				

			}

			if (mp3.isPlaying()) {
				mp3.stop();
			}
		}
		return score;
	}

	

}