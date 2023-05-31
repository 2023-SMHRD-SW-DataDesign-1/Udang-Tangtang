package Controller;

import java.util.Timer;
import java.util.TimerTask;

public class Timecount {

	public void timer() {

		Timer timer_m = new Timer();
		TimerTask m_task = new TimerTask() {
			int count = 1;
			int score = 180;

			@Override
			public void run() {
				if (count <= 60) {
					System.out.println();
					System.out.print("[점수" + score + "] ");
					count++;
					score-=3;
					
				} else {
					timer_m.cancel();
					System.out.println("시간이 종료되었습니다.");
				}
			}
		};
		timer_m.schedule(m_task, 1000,1000); // 노래시작과 동시에 카운트다운시작
	}

} // class
