package singleton;

public class Car {
	//static 변수는 값을 공유(유지)할 때 사용함
	private static int serialNum = 1000;  //기준번호(정적 변수)
	private int carNumber;  //자동차 번호
	
	public Car() {
		serialNum++;  //serialNum = serialNum + 1
		carNumber = serialNum;
	}
	
	//차량 번호 조회
	public int getCarNumber() {
		return carNumber;
	}
}
