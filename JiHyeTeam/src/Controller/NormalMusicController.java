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
	   
       NormalMusicList.add(new musicDTO("친구여", "조피디", "music/친구여.mp3"));
       NormalMusicList.add(new musicDTO("죄와벌", "SG워너비", "music/죄와벌.mp3"));
       NormalMusicList.add(new musicDTO("내사람", "SG워너비", "music/내사람.mp3"));
       NormalMusicList.add(new musicDTO("미인", "이기찬", "music/미인.mp3"));
       NormalMusicList.add(new musicDTO("쏘핫", "원더걸스", "music/SoHot.mp3"));
       NormalMusicList.add(new musicDTO("쥐", "소녀시대", "music/Gee.mp3"));
       NormalMusicList.add(new musicDTO("배드걸굿걸", "소녀시대", "music/BadGirlGoodGirl.mp3"));
       NormalMusicList.add(new musicDTO("롤리폴리", "티아라", "music/RolyPoly.mp3"));
       NormalMusicList.add(new musicDTO("강남스타일", "싸이", "music/강남스타일.mp3"));
       NormalMusicList.add(new musicDTO("자니", "프라이머리", "music/자니.mp3"));
      
   }

   public int NormalPlay() {
      int life = 3;
      int correct = 0;
      int i = 0;
      int score = 0;
      
      while(correct <5) {
  
         if (mp3.isPlaying()) {// 음악 정지
            mp3.stop();
         }
         
         NormalMusicList.get(i).getMusicPath();
         System.out.print("노래제목을 입력해주세요 >> ");
         String answer = sc.next();
         
         if (NormalMusicList.get(i).getName().equals(answer)) {
        	 score += 150;
            System.out.println("정답입니다.");
            correct++;
            i++;
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
      return score;
   
   }
}