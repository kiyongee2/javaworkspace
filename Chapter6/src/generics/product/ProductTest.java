package generics.product;

public class ProductTest {

	public static void main(String[] args) {
		// 제네릭 프로그래밍 테스트
		//Product<클래스(제품종류), 클래스(문자열)>
		Product<TV, String> prod1 = new Product<>();
		TV tv = new TV();
		
		prod1.setKind(tv);
		prod1.setModel("스마트TV");
		System.out.println("모델: " + prod1.getModel());
		System.out.println(tv.making());
		
		//Car 제품
		Product<Car, String> prod2 = new Product<>();
		Car car = new Car();
		
		prod2.setKind(car);
		prod2.setModel("전기차");
		System.out.println("모델: " + prod2.getModel());
		System.out.println(car.making());

	}

}
