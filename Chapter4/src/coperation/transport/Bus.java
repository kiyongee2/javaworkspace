package coperation.transport;

public class Bus {
	private int busNumber;  //버스 번호
	private int passenger;  //승객수
	private int money;      //수입(기본 0으로 설정)
	private static final int FEE = 1500; //요금(상수)
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//승객을 태우다
	public void take() {
		this.money += FEE; //this.money = this.money + FEE;
		passenger++;  //승객수 1 증가
	}
	
	//요금 조회
	public int getFEE() {
		return FEE;
	}
	
	//버스의 정보 출력
	public void displayInfo() {
		System.out.printf("%d번 버스의 수입은 %d원 이고, 승객수는 %d명 입니다.\n", 
				busNumber, money, passenger);
	}
	
}
