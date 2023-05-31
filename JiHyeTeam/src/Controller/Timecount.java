package Controller;

import java.util.Timer;
import java.util.TimerTask;

public class Timecount {

	public void timer() {

		Timer timer_m = new Timer();
		TimerTask m_task = new TimerTask() {
			int count = 1;

			@Override
			public void run() {
				if (count <= 5) {
					System.out.println();
					System.out.println("[카운트다운" + count + "초]");
					count++;
				} else {
					timer_m.cancel();
					System.out.println("카운트가 종료되었습니다.");
				}
			}
		};
		timer_m.schedule(m_task, 10000, 1000); // 10초 뒤 카운트다운 실행

	}

} // class
