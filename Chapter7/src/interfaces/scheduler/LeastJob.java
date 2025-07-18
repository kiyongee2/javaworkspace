package interfaces.scheduler;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 가져오기");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("대기가 가장 적은 상담원에게 배분하기");
		
	}

}
