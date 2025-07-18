package interfaces.scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("전화 상담 배분 방식을 선택하세요.");
		System.out.println("R: 한 명씩 차례로 배분");
		System.out.println("L: 대기가 적은 상담원에게 배분");
		
		//System.in.read() 사용하여 키보드 입력
		int ch = System.in.read();
		
		//인터페이스형으로 인스턴스 생성
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}else if(ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		}else {
			System.out.println("지원되지 않는 기능입니다.");
		}
		
		scheduler.getNextCall();   //입력받은 정책의 메서드 호출
		scheduler.sendCallToAgent();
	}

}
