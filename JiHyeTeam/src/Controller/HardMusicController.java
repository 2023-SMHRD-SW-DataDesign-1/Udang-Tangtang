package Controller;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.TimerTask;

import javazoom.jl.player.MP3Player;
import musicDTO.musicDTO;

public class HardMusicController {



	ArrayList<musicDTO> hardMusicList = new ArrayList<>();

	MP3Player mp3 = new MP3Player();

	Random rd = new Random();

	Scanner sc = new Scanner(System.in);

	public HardMusicController() {
		// 곡세팅
		hardMusicList.add(new musicDTO("잘못된만남", "김건모", "hardmusic/잘못된만남.mp3"));
		hardMusicList.add(new musicDTO("핑계", "김건모", "hardmusic/핑계.mp3"));
		hardMusicList.add(new musicDTO("넘버원", "보아", "hardmusic/넘버원.mp3"));
		hardMusicList.add(new musicDTO("아시나요", "조성모", "hardmusic/아시나요.mp3"));
		hardMusicList.add(new musicDTO("벌써일년", "브라운아이드소울", "hardmusic/벌써일년.mp3"));

	}

	public void HardPlay() {

		int life = 3;
		for (int i = 0; i < hardMusicList.size(); i++) {
			
			System.out.println("노래가 나옵니다. 잘들어주세요.");
			mp3.play(hardMusicList.get(i).getMusicPath()); 

			
			System.out.print("노래제목을 입력해주세요 >> ");
			String answer = sc.next();
			System.out.println();
			

			if (hardMusicList.get(i).getName().equals(answer)) {
				System.out.println("정답입니다.");
			} else {
				System.out.println("정답이 아닙니다.");
				life--;
				System.out.println("기회가" + life + "번 남았습니다.");
				if (life == 0) {
					System.out.println("game over");
					break;

				}
			}

		}

	}

}
