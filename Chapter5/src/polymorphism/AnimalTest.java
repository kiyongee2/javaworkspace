package polymorphism;

class Animal{
	
	//public Animal() {} //기본 생성자
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

//Animal을 상속 받는 Human
class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
}

//Animal을 상속 받는 Horse
class Horse extends Animal{

	@Override
	public void move() {
		System.out.println("말이 네 발로 뜁니다.");
	}
	
}

class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("독수리가 날개를 펴고 날아갑니다.");
	}
	
}

public class AnimalTest {

	public static void main(String[] args) {
		// 다형성이 아닌 방법
		/*Human human = new Human();
		human.move();*/
		
		/* 다형성인 방법
		   부모 타입으로 인스턴스 생성(자동 형변환)
		   상위 타입(큰) = 하위 타입(작은)
		   동적 바인딩 - 메서드는 동적으로 인스턴스를 찾아 갑니다.
		*/
		/*Animal human = new Human();
		human.move();
		
		Animal horse = new Horse();
		horse.move();
		
		Animal eagle = new Eagle();
		eagle.move();*/
		
		//배열로 관리 - 다형성의 장점
		Animal[] animals = {
			new Human(),
			new Horse(),
			new Eagle()
		};
		
		//범위 기반 for(자료형 변수 : 배열이름){}
		for(Animal animal : animals) {
			animal.move();
		}
		System.out.println("============================");
		
		//메서드를 만들어 매개변수의 다형성 구현
		moveAnimal(new Human());
		moveAnimal(new Horse());
		moveAnimal(new Eagle());

	}//main() 닫기
	
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}








