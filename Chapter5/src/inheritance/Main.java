package inheritance;

public class Main {

	public static void main(String[] args) {
		// EV의 인스턴스 생성
		EV myEV = new EV("kia", "EV6", 70);
		
		//기능 테스트
		myEV.accelerate(60);
		myEV.brake(30);
		myEV.charge(20);
		myEV.charge(50); //배터리 잔량 한도 제한 - 100
		
		//정보 출력
		myEV.showInfo();

	}

}
