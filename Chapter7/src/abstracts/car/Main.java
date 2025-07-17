package abstracts.car;

public class Main {

	public static void main(String[] args) {
		// 인스턴스 생성
		System.out.println("===== 사람이 운전하는 자동차 =====");
		Car hisCar = new HumanCar();
		hisCar.run();
		
		
		System.out.println("===== 자율 주행하는 자동차 =====");
		Car myCar = new AICar();
		myCar.run();
		
		//final 클래스 - String
		//String test;

	}

}
