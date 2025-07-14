package inheritance.cars;

public class Car {
	//상속 관계만 private -> protected
	protected String brand;  //제조사(브랜드)
	protected String model;  //모델명
	protected int speed;     //속도
	
	//생성자
	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
		this.speed = 0;
	}
	
	//가속 메서드
	public void accelerate(int amount) {
		speed += amount;
		System.out.println(model + " 가속 - 현재 속도: " + speed + "km/h");
	}
	
	//감속 메서드
	public void brake(int amount) {
		speed -= amount;
		System.out.println(model + " 감속 - 현재 속도: " + speed + "km/h");
	}
	
	//차량 정보 출력
	public void showInfo() {
		System.out.println("=== 자동차 정보 ===");
		System.out.println("제조사: " + brand);
		System.out.println("모델명: " + model);
	}
	
}








