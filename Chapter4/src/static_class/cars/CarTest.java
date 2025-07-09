package static_class.cars;

public class CarTest {

	public static void main(String[] args) {
		// Car의 인스턴스 생성
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		System.out.println(car1.getCarNumber()); //1001
		System.out.println(car2.getCarNumber()); //1002
		System.out.println(car3.getCarNumber()); //1003
	}
}
