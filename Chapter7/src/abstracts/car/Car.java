package abstracts.car;

public abstract class Car {
	
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	
	public abstract void drive();
	
	public abstract void stop();
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//템플릿 메서드 (시동 시작 - 주행 - 정지 - 시동 종료)
	//상속받는 클래스에서 수정할 수 없도록 final을 붙임
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
