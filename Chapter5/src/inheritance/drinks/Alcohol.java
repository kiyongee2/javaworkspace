package inheritance.drinks;

//주류 클래스
public class Alcohol extends Drink{
	private float alcper;  //알콜 도수

	public Alcohol(String name, int price, int quantity, 
			float alcper) {
		super(name, price, quantity); //부모 멤버 변수 상속
		this.alcper = alcper;
	}
	
	//제목행 재정의 (static 메서드 - @override 사용 불가)
	public static void printTitle() {
		System.out.println("상품명(도수[%])\t가격\t수량\t금액");
	}

	//상품 데이터 재정의(@override)
	@Override
	public void printData() {
		System.out.println(name + "("+ alcper + ")\t" + price + "\t" + 
				quantity + "\t" + calcPrice());
	}
}








