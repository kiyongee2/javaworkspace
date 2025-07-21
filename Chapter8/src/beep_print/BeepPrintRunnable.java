package beep_print;

import java.awt.Toolkit;

public class BeepPrintRunnable {

	public static void main(String[] args) {
		// Runnable의 구현체 정의
		Runnable beepTask = new Runnable() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++) {
					toolkit.beep(); //소리 재생
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		//소리 스레드 생성
		Thread thread = new Thread(beepTask);
		thread.start();
		
		// '띵' 문자를 5번 출력
		for(int i = 0; i < 5; i++) {
			//1초 간격으로 출력
			System.out.println("띵");
			try {
				Thread.sleep(1000); //1000ms = 1s
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
