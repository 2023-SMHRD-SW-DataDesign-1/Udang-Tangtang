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
	   hardMusicList.add(new musicDTO("잘못된만남", "김건모", "music/잘못된만남.mp3","ㅈㅁㄷㅁㄴ"));
	   hardMusicList.add(new musicDTO("달팽이", "패닉", "music/달팽이.mp3","ㄷㅍㅇ"));
	   hardMusicList.add(new musicDTO("나를슬프게하는사람들", "김경호", "music/나를슬프게하는사람들.mp3","ㄴㄹㅅㅍㄱㅎㄴㅅㄹㄷ"));
	   hardMusicList.add(new musicDTO("포이즌", "엄정화", "music/포이즌.mp3","ㅍㅇㅈ"));
	   hardMusicList.add(new musicDTO("슬픈영혼식", "조성모", "music/슬픈영혼식.mp3","ㅅㅍㅇㅎㅅ"));
	   hardMusicList.add(new musicDTO("아시나요", "조성모", "music/아시나요.mp3","ㅇㅅㄴㅇ"));
	   hardMusicList.add(new musicDTO("벌써일년", "브라운아이드소울", "music/벌써일년.mp3","ㅂㅆㅇㄴ"));
       hardMusicList.add(new musicDTO("넘버원", "보아", "music/넘버원.mp3","ㄴㅂㅇ"));
       hardMusicList.add(new musicDTO("브레이크어웨이", "빅마마", "music/브레이크어웨이.mp3","ㅂㄹㅇㅋㅇㅇㅇ"));
       
   }

   public int HardPlay() {
      int life = 3;
      int correct = 0;
      int i = 0;
      int score = 0;
      
      while(correct <10) {
  
         if (mp3.isPlaying()) {// 음악 정지
            mp3.stop();
         }
         
         mp3.play(hardMusicList.get(i).getMusicPath());
         System.out.print("노래제목을 입력해주세요 >> ");
         String answer = sc.next();
         
         if (hardMusicList.get(i).getName().equals(answer)) {
        	 score += 200;
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