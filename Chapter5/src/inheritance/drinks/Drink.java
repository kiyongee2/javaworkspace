package inheritance.drinks;

//일반 음료 클래스 정의
public class Drink {
	//상속관계에서 자식 클래스에서 접근해야 함으로 protected 사용
	protected String name;  //상품명
	protected int price;    //가격
	protected int quantity; //수량
	
	//public Drink() {} //기본 생성자
	
	//생성자
	public Drink(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//금액 계산 (금액 = 가격 x 수량)
	public int calcPrice() {
		return price * quantity;
	}
	
	//상품 제목 행
	public static void printTitle() {
		System.out.println("상품명\t가격\t수량\t금액");
	}
	
	//상품 데이터 출력
	public void printData() {
		System.out.println(name + "\t" + price + "\t" + 
						quantity + "\t" + calcPrice());
	}
	
	
}






