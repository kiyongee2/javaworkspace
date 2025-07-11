package singleton;

public class CarFactory {
	//자동차 공장 클래스의 인스턴스는 1개만 만듬
	private static CarFactory instance;
	
	//생성자 - 접근 제한
	private CarFactory() {}
	
	//getInstance() 메서드
	public static CarFactory getInstance() {
		if(instance == null)
			instance = new CarFactory();
		return instance;
	}
	
	//공장에서 자동차 생성 메서드
	public Car createCar() {
		Car car = new Car();
		return car;
	}
}
