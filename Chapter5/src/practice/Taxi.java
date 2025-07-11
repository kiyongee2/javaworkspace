package practice;


class Car{
	protected String brand;
	protected int carNumber;
	
	public Car(String brand) {
		this.brand = brand;
	}
}

public class Taxi extends Car{
	
	private int passenger;  //승객수

	//오류 발생 이유 : 부모 멤버 변수를 상속하지 않음
	public Taxi(String brand) {
		super(brand);
	}
	
	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}
	
	public int getPassenger() {
		return passenger;
	}

}
