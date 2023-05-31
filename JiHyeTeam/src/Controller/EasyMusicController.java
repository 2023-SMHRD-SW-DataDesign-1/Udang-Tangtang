package Controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;
import musicDTO.musicDTO;

public class EasyMusicController {

	ArrayList<musicDTO> EasyMusicList = new ArrayList<>();

	MP3Player mp3 = new MP3Player();

	Random rd = new Random();

	Scanner sc = new Scanner(System.in);

	public EasyMusicController() {
		// 곡세팅

		EasyMusicList.add(new musicDTO("썸", "소유&정기고", "music/썸.mp3", "ㅆ"));
		EasyMusicList.add(new musicDTO("뱅뱅뱅", "빅뱅", "music/뱅뱅뱅.mp3", "ㅂㅂㅂ"));
		EasyMusicList.add(new musicDTO("치얼업", "트와이스", "music/cheerup.mp3", "ㅊㅇㅇ"));
		EasyMusicList.add(new musicDTO("첫눈처럼너에게가겠다", "에일리", "music/첫눈처럼너에게가겠다.mp3", "ㅊㄴㅊㄹㄴㅇㄱㄱㄱㄷ"));
		EasyMusicList.add(new musicDTO("사랑을했다", "아이콘", "music/사랑을했다.mp3", "ㅅㄹㅇㅎㄷ"));
		EasyMusicList.add(new musicDTO("2002", "앤마리", "music/2002.mp3", "숫자4개"));
		EasyMusicList.add(new musicDTO("아무노래", "지코", "music/아무노래.mp3", "ㅇㅁㄴㄹ"));
		EasyMusicList.add(new musicDTO("셀러브리티", "아이유", "music/Celebrity.mp3", "ㅅㄹㅂㄹㅌ"));
		EasyMusicList.add(new musicDTO("러브다이브", "아이브", "music/LOVEDIVE.mp3", "ㄹㅂㄷㅇㅂ"));
		EasyMusicList.add(new musicDTO("디토", "뉴진스", "music/Ditto.mp3", "ㄷㅌ"));

	}

	public int EasyPlay() {
		int life = 3;
		int correct = 0;
		int i = 0;
		int score = 0;
		int choice = 0;
		while (correct < 10) {

			if (mp3.isPlaying()) {// 음악 정지
				mp3.stop();
			}

			mp3.play(EasyMusicList.get(i).getMusicPath());
			System.out.print("노래제목을 입력해주세요 >> ");
			String answer = sc.next();

			if (EasyMusicList.get(i).getName().equals(answer)) {
				score += 100;
				System.out.println("정답입니다.");
				correct++;
				i++;
			} else {
				System.out.println("정답이 아닙니다.");
				life--;
				System.out.println("기회가" + life + "번 남았습니다.");
				if (life != 0) {
					System.out.println("[1]힌트보기 [2]넘어가기 >> ");
					choice = sc.nextInt();
					if (choice == 1) {
						score = hint1(correct, i, life, score); // 힌트사용 메소드

						if (life != 0) {
							System.out.println("[1]초성힌트보기 [2]넘어가기 >> ");
							int choice2 = sc.nextInt();
							if (choice2 == 1) {
								score = hint2(correct, i, life, score);
								if(life == 0) {
									System.out.println("game over");
									break;
								}
							}
							} else {
								System.out.println("game over");

								break;
							}
						}
				
				} else {
					System.out.println();

				}
				if (life == 0) {
					System.out.println("game over");

					break;

				}
				i++;
			}

		}
		return score;
	}

	public int hint1(int correct, int i, int life, int score) {

		System.out.println("=======================================");
		System.out.println(EasyMusicList.get(i).getSinger());
		System.out.println("=======================================");
		System.out.print("노래제목을 다시 입력해주세요 >> ");
		String answer2 = sc.next();

		if (EasyMusicList.get(i).getName().equals(answer2)) {
			score += 50;
			System.out.println("정답입니다.");
			correct++;

		} else {
			System.out.println("정답이 아닙니다.");
			life--;
			System.out.println("기회가" + life + "번 남았습니다.");

		}
	
		return score;
	}

	public int hint2(int correct, int i, int life, int score) {
		System.out.println("=======================================");
		System.out.println(EasyMusicList.get(i).getHint());
		System.out.println("=======================================");
		System.out.print("노래제목을 다시 입력해주세요 >> ");
		String answer3 = sc.next();

		if (EasyMusicList.get(i).getName().equals(answer3)) {
			score += 25;
			System.out.println("정답입니다.");
			correct++;

		} else {
			System.out.println("정답이 아닙니다.");
			life--;
			System.out.println("기회가" + life + "번 남았습니다.");

		}

		return score;
	}
}