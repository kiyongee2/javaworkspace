package coperation.transport;

public class Main {

	public static void main(String[] args) {
		// Person, Bus 인스턴스 생성
		Person lee = new Person("이우정", 10000);
		Person choi = new Person("최인정", 2000);
		
		Bus bus100 = new Bus(100);
		
		//버스에 탑승
		lee.takeBus(bus100);
		choi.takeBus(bus100);
		choi.takeBus(bus100);
		
		//정보 출력
		lee.displayInfo();
		choi.displayInfo();
		bus100.displayInfo();
	}
}
