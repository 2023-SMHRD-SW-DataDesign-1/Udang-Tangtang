package Controller;

import java.util.Timer;
import java.util.TimerTask;

public class Timecount {

	int count_h = 1;
	int score_h = 180;
	public int timer() {

		Timer timer_m = new Timer();
		TimerTask m_task = new TimerTask() {
		
			@Override
			public void run() {
				if (count_h <= 60) {
					
					count_h++;
					score_h-=3;
					
				} else {
					timer_m.cancel();
					System.out.println("시간이 종료되었습니다.");
				}
			}
		};
		timer_m.schedule(m_task, 60000,1000); // 노래시작과 동시에 카운트다운시작
		return score_h;
	}

	
	
	int count_n = 1;
	int score_n = 120;
	public int nomaltimer() {
		Timer timer_n = new Timer();
		TimerTask n_task = new TimerTask() {
			
			@Override
			public void run() {
				if(count_n <= 60) {
					System.out.print("[점수" + score_n + "] ");
					count_n++;
					score_n -=2;
				} else { 
					timer_n.cancel();
					System.out.println("시간이 종료되었습니다.");
				}
				
				
			}
		};
		timer_n.schedule(n_task, 1000, 1000);
		return score_n;
	}
	
	
	int count_e = 1;
	int score_e = 60;
	public int easytiemr() {
		Timer timer_e = new Timer();
		TimerTask e_task = new TimerTask() {
			
			@Override
			public void run() {
				if(count_e <= 60) {
					System.out.print("[점수" + score_e + "] ");
					count_e++;
					score_e--;
				} else {
					timer_e.cancel();
					System.out.println("시간이 종료되었습니다.");
				}
				
			}
		};
		timer_e.schedule(e_task, 1000, 1000);
	
		return score_e;
	}
	
	
	
} // class
