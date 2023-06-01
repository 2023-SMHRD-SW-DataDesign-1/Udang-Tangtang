package Controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


import javazoom.jl.player.MP3Player;
import musicDTO.musicDTO;

public class HardMusicController {

	ArrayList<musicDTO> hardMusicList = new ArrayList<>();

	MP3Player mp3 = new MP3Player();

	Random rd = new Random();

	Scanner sc = new Scanner(System.in);

	 public HardMusicController() {
	      // 곡세팅
		   hardMusicList.add(new musicDTO("핑계", "김건모", "music/핑계.mp3","ㅍㄱ"));
		   hardMusicList.add(new musicDTO("슬퍼지려하기전에", "쿨", "music/슬퍼지려하기전에.mp3","ㅅㅍㅈㄹㅎㄱㅈㅇ"));
		   hardMusicList.add(new musicDTO("달팽이", "패닉", "music/달팽이.mp3","ㄷㅍㅇ"));
		   hardMusicList.add(new musicDTO("나를슬프게하는사람들", "김경호", "music/나를슬프게하는사람들.mp3","ㄴㄹㅅㅍㄱㅎㄴㅅㄹㄷ"));
		   hardMusicList.add(new musicDTO("포이즌", "엄정화", "music/포이즌.mp3","ㅍㅇㅈ"));
		   hardMusicList.add(new musicDTO("슬픈영혼식", "조성모", "music/슬픈영혼식.mp3","ㅅㅍㅇㅎㅅ"));
		   hardMusicList.add(new musicDTO("커플", "젝스키스", "music/커플.mp3","ㅋㅍ"));
		   hardMusicList.add(new musicDTO("킬러", "베이비복스", "music/킬러.mp3","ㅋㄹ"));
	       hardMusicList.add(new musicDTO("넘버원", "보아", "music/넘버원.mp3","ㄴㅂㅇ"));
	       hardMusicList.add(new musicDTO("비몽", "코요태", "music/비몽.mp3","ㅂㅁ"));
	       
	   }

	public int HardPlay() {
		int life = 3;
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
			System.out.println();
			System.out.println("**************************************************");
			System.out.println();
			mp3.play(hardMusicList.get(i).getMusicPath());
			System.out.print("노래제목을 입력해주세요 >> ");
			String answer = sc.next();

			if (hardMusicList.get(i).getName().equals(answer)) {
				score += 200;
				System.out.println("정답입니다.");
				correct++;
				i++;
				if(i == hardMusicList.size()-1) {
					System.out.println("모든문제가 출제되었습니다! 게임종료!");
				}
			} else {
				System.out.println("정답이 아닙니다.");
				life--;
				System.out.println("기회가" + life + "번 남았습니다.");
				if (life != 0) {
					System.out.println("[1]힌트보기 [2]다음노래로 넘어가기 >> ");
					choice = sc.nextInt();
					if (choice == 1) {

						System.out.println("==================================================");
						System.out.println("                      [Hint]                      ");
						System.out.println();
						System.out.println("                "+hardMusicList.get(i).getSinger() + " - " + hardMusicList.get(i).getHint());
						System.out.println();
						System.out.println("==================================================");
						System.out.print("노래제목을 다시 입력해주세요 >> ");
						String answer2 = sc.next();

						if (hardMusicList.get(i).getName().equals(answer2)) {
							score += 50;
							System.out.println("정답입니다.");
							correct++;
							if(i == hardMusicList.size()-1) {
								System.out.println("모든문제가 출제되었습니다! 게임종료!");
							}

						} else {
							if (i != hardMusicList.size() - 1) {
								System.out.println("정답이 아닙니다.");
								life--;
								System.out.println("기회가" + life + "번 남았습니다.");
								
							}else {
								System.out.println("모든문제 출제완료!");
								System.out.println("==================================================");
							}

						}
					

					} else {
						if (i != hardMusicList.size() - 1) {
							System.out.println("PASS!");
						} else {
							System.out.println("모든문제가 출제되었습니다! 게임종료!");
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