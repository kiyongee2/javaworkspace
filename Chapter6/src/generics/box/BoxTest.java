package generics.box;

public class BoxTest {

	public static void main(String[] args) {
		//Box 인스턴스 생성
		//Box<>() - <>안에 자료형 생략 가능
		Box<String> box1 = new Box<>();
		box1.set("행운을 빌어요");
		String msg = box1.get();
		System.out.println(msg);
		
		//정수형 사용
		Box<Integer> box2 = new Box<>();
		box2.set(10);
		Integer num = box2.get();
		System.out.println(num);
		
		Box<Car> box3 = new Box<>();
		box3.set(new Car("아이오닉6"));
		Car car = box3.get();
		System.out.println(car);
	}

}
