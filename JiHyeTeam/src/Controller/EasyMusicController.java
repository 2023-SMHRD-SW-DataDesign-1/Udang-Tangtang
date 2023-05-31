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
		EasyMusicList.add(new musicDTO("", "", "easymusic/.mp3"));
		EasyMusicList.add(new musicDTO("", "", "easymusic/.mp3"));
		EasyMusicList.add(new musicDTO("", "", "easymusic/.mp3"));
		EasyMusicList.add(new musicDTO("", "", "easymusic/.mp3"));
		EasyMusicList.add(new musicDTO("", "", "easymusic/.mp3"));
		
	}

	public void EasyPlay() {

		int life = 3;
		for (int i = 0; i < EasyMusicList.size(); i++) {
			
			Timecount tce = new Timecount();
			tce.easytiemr();
			System.out.print("노래제목을 입력해주세요 >> ");
			mp3.play(EasyMusicList.get(i).getMusicPath()); 
			String answer = sc.next();
			
			if (EasyMusicList.get(i).getName().equals(answer)) {
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
