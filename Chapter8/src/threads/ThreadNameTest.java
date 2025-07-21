package threads;

public class ThreadNameTest {

	public static void main(String[] args) {
		// 메인 스레드
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + " 실행");
		
		// 직접 작업 스레드 생성
		// Runnable 인터페이스를 구현한 객체(인스턴스)
		Runnable task = new Runnable() {

			@Override
			public void run() {
				Thread thread = Thread.currentThread();
				System.out.println(thread.getName() + " 실행");
			}
		};
		
		//자동 이름이 부여되는 스레드 2개
		for(int i = 0; i < 2; i++) {
			Thread thread = new Thread(task);
			thread.start();
		}
		
		//이름을 직접 지정한 스레드 2개
		for(int i = 0; i < 2; i++) {
			Thread thread = new Thread(task);
			thread.setName("chat-thread" + i);
			thread.start();
		}
	}
}
