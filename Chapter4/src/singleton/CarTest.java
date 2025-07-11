package singleton;

public class CarTest {

	public static void main(String[] args) {
		// 자동차 회사 인스턴스 생성
		//getInstance()가 static 메서드이므로 클래스 이름으로 직접 접근함
		CarFactory factory = CarFactory.getInstance();
		
		// 자동차 인스턴스 생성
		Car car1 = factory.createCar();
		Car car2 = factory.createCar();
		Car car3 = factory.createCar();
		
		System.out.println("신차 번호: " + car1.getCarNumber());
		System.out.println("신차 번호: " + car2.getCarNumber());
		System.out.println("신차 번호: " + car3.getCarNumber());
	}

}
