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
	   
       EasyMusicList.add(new musicDTO("썸", "소유&정기고", "music/썸.mp3"));
       EasyMusicList.add(new musicDTO("뱅뱅뱅", "빅뱅", "music/뱅뱅뱅.mp3"));
       EasyMusicList.add(new musicDTO("치얼업", "트와이스", "music/cheerup.mp3"));
       EasyMusicList.add(new musicDTO("첫눈처럼너에게가겠다", "에일리", "music/첫눈처럼너에게가겠다.mp3"));
       EasyMusicList.add(new musicDTO("사랑을했다", "아이콘", "music/사랑을했다.mp3"));
       EasyMusicList.add(new musicDTO("2002", "앤마리", "music/2002.mp3"));
       EasyMusicList.add(new musicDTO("아무노래", "지코", "music/아무노래.mp3"));
       EasyMusicList.add(new musicDTO("셀러브리티", "아이유", "music/Celebrity.mp3"));
       EasyMusicList.add(new musicDTO("러브다이브", "아이브", "music/LOVEDIVE.mp3"));
       EasyMusicList.add(new musicDTO("디토", "뉴진스", "music/Ditto.mp3"));
       
      
   }

   public int EasyPlay() {
      int life = 3;
      int correct = 0;
      int i = 0;
      int score = 0;
      while(correct <10) {
  
         if (mp3.isPlaying()) {// 음악 정지
            mp3.stop();
         }
         
         EasyMusicList.get(i).getMusicPath();
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
            if (life == 0) {
               System.out.println("game over");

               break;
            }
         }
         

      }
      return score;
   
   }
}