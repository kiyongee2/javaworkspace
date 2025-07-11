package inheritance;

public class EV extends Car{
	
	private int battery; //배터리 잔량(0 ~ 100%)

	public EV(String brand, String model, int battery) {
		//부모 멤버 변수 상속은 super() 사용
		super(brand, model);
		this.battery = battery;
	}
	
	//충전 메서드
	public void charge(int amount) {
		battery += amount; 
		if(battery > 100)
			battery = 100;  //최대값 한도 제한
		System.out.println(model + " 충전됨 - 배터리: " + battery + "%");
	}

	//정보 출력(메서드 재정의)
	@Override
	public void showInfo() {
		super.showInfo();  //부모의 메서드 상속
		System.out.println("배터리 잔량: " + battery + "%");
	}

}







