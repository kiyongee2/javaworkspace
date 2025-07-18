package interfaces.scheduler;

//스케줄러 인터페이스 정의
public interface Scheduler {

	public void getNextCall();     //다음 전화 가져오기
	public void sendCallToAgent(); //상담원에게 전화 배분하기
}
