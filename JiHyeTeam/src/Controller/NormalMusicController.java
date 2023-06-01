package Controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


import javazoom.jl.player.MP3Player;
import musicDTO.musicDTO;

public class NormalMusicController {

	ArrayList<musicDTO> normalMusicList = new ArrayList<>();

	MP3Player mp3 = new MP3Player();

	Random rd = new Random();

	Scanner sc = new Scanner(System.in);

	public NormalMusicController() {
		// 곡세팅

		normalMusicList.add(new musicDTO("친구여", "조피디", "music/친구여.mp3", "ㅊㄱㅇ"));
		normalMusicList.add(new musicDTO("죄와벌", "SG워너비", "music/죄와벌.mp3", "ㅈㅇㅂ"));
		normalMusicList.add(new musicDTO("내사람", "SG워너비", "music/내사람.mp3", "ㄴㅅㄹ"));
		normalMusicList.add(new musicDTO("미인", "이기찬", "music/미인.mp3", "ㅁㅇ"));
		normalMusicList.add(new musicDTO("쏘핫", "원더걸스", "music/SoHot.mp3", "ㅆㅎ"));
		normalMusicList.add(new musicDTO("쥐", "소녀시대", "music/Gee.mp3", "ㅈ"));
		normalMusicList.add(new musicDTO("배드걸굿걸", "소녀시대", "music/BadGirlGoodGirl.mp3", "ㅂㄷㄱㄱㄱ"));
		normalMusicList.add(new musicDTO("롤리폴리", "티아라", "music/RolyPoly.mp3", "ㄹㄹㅍㄹ"));
		normalMusicList.add(new musicDTO("강남스타일", "싸이", "music/강남스타일.mp3", "ㄱㄴㅅㅌㅇ"));
		normalMusicList.add(new musicDTO("자니", "프라이머리", "music/자니.mp3", "ㅈㄴ"));

	}

	public int NormalPlay() {
		int life = 4;
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

			mp3.play(normalMusicList.get(i).getMusicPath());
			System.out.print("노래제목을 입력해주세요 >> ");
			String answer = sc.next();

			if (normalMusicList.get(i).getName().equals(answer)) {
				score += 150;
				System.out.println("정답입니다.");
				correct++;
				i++;
				if(i == normalMusicList.size()-1) {
					System.out.println("모든문제가 출제되었습니다! 게임종료!");
				}
			} else {
				System.out.println("정답이 아닙니다.");
				life--;
				System.out.println("기회가" + life + "번 남았습니다.");
				if (life != 0) {
					System.out.println("[1]힌트보기 [2]다음노래로 패스 >> ");
					choice = sc.nextInt();
					if (choice == 1) {


						System.out.println("=======================================");
						System.out.println(normalMusicList.get(i).getSinger() + "-" + normalMusicList.get(i).getHint());
						System.out.println("=======================================");
						System.out.print("노래제목을 다시 입력해주세요 >> ");
						String answer2 = sc.next();

						if (normalMusicList.get(i).getName().equals(answer2)) {
							score += 50;
							System.out.println("정답입니다.");
							correct++;
							if(i == normalMusicList.size()-1) {
								System.out.println("모든문제가 출제되었습니다! 게임종료!");
							}

						} else {
							if (i != normalMusicList.size() - 1) {
								System.out.println("정답이 아닙니다.");
								life--;
								System.out.println("기회가" + life + "번 남았습니다.");
								
							}else {
								System.out.println("모든문제 출제완료!");
								System.out.println("=======================================");
							}

						}
					

					} else {
						if (i != normalMusicList.size() - 1) {
							System.out.println("PASS!");
						} else {
							System.out.println("모든문제가 출제되었습니다! 게임종료!");
						}
					}
				}
				i++;
				if (life == 0) {
					System.out.println("game over TㅅT");
					System.out.println();
					break;
				}
			}

			if (mp3.isPlaying()) {
				mp3.stop();
			}
		}
		return score;
	}

	

}