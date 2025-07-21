package beep_print;

public class BeepPrintTest2 {

	public static void main(String[] args) {
		// 메인 스레드와 작업 스레드 동시에 실행
		Runnable beepTask = new BeepTask();
		//구현된 객체로 작업 스레드를 생성
		Thread thread = new Thread(beepTask);
		thread.start();
		
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
