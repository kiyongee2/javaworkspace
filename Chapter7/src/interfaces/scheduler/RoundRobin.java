package interfaces.scheduler;

public class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 가져오기");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서의 상담원에게 배분한다.");
		
	}

}
