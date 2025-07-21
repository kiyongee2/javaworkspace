package beep_print;

import java.awt.Toolkit;

public class BeepPrintTest {

	public static void main(String[] args) {
		// 메인 스레드만 실행됨으로 순차적으로 작업이 이루어짐
		// 비프음과 문자를 출력 - 문자 출력후 소리 재생
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
		
		// '띵' 소리 5번 재생
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

}




