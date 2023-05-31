package Controller;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;
import musicDTO.musicDTO;

public class NormalMusicController {

	ArrayList<musicDTO> NormalMusicList = new ArrayList<>();

	MP3Player mp3 = new MP3Player();

	Random rd = new Random();

	Scanner sc = new Scanner(System.in);

	public NormalMusicController() {
		// 곡세팅
		NormalMusicList.add(new musicDTO("", "", "normalmusic/.mp3"));
		NormalMusicList.add(new musicDTO("", "", "normalmusic/.mp3"));
		NormalMusicList.add(new musicDTO("", "", "normalmusic/.mp3"));
		NormalMusicList.add(new musicDTO("", "", "normalmusic/.mp3"));
		NormalMusicList.add(new musicDTO("", "", "normalmusic/.mp3"));
		
		
	}

	public void NormalPlay() {

		int life = 3;
		for (int i = 0; i < NormalMusicList.size(); i++) {
			
			Timecount tcnomal = new Timecount();
			tcnomal.nomaltimer();
			System.out.print("노래제목을 입력해주세요 >> ");
			mp3.play(NormalMusicList.get(i).getMusicPath()); 
			String answer = sc.next();
			
			if (NormalMusicList.get(i).getName().equals(answer)) {
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