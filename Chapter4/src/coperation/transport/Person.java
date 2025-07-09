package coperation.transport;

public class Person {
	private String name;  //이름
	private int money;    //가진 돈
	
	//생성자
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//버스를 타다 - 매개변수로 버스 인스턴스를 입력받음
	public void takeBus(Bus bus) {
		//잔액 부족인 경우 오류 처리
		if(this.money >= bus.getFEE()) {
			bus.take();
			this.money -= bus.getFEE();  //가진돈 - 요금
		}
		else {
			System.out.println("잔액 부족!!");
		}
	}
	
	//사람의 정보 
	public void displayInfo() {
		System.out.printf("%s님의 남은 돈은 %d원 입니다.\n", 
				name, money);
	}
}





