package polymorphism.animal2;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{

	@Override //상속 받음 - 재정의
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Horse extends Animal{

	@Override
	public void move() {
		System.out.println("말이 네 발로 뜁니다.");
	}
	
	public void run() {
		System.out.println("말이 사람을 태우고 빠르게 달립니다.");
	}
	
}

class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("독수리가 날개를 펴고 날아갑니다.");
	}
	
	public void hunting() {
		System.out.println("독수리가 물고기를 사냥합니다.");
	}
	
}

public class AnimalTest {
	//전역 공간
	public static Animal[] animals = new Animal[3];

	public static void main(String[] args) {
		/*//부모 타입으로 인스턴스 생성(업캐스팅- upcasting)
		Animal animal = new Human();
		animal.move();
		
		//자식타입으로 인스턴스 생성(다운 캐스팅 - downcasting)
		if(animal instanceof Human) {
			Human human = (Human)animal;
			human.readBook();
		}*/
		
		System.out.println("== 원래 형으로 다운 캐스팅하기 ==");
		//인스턴스를 저장할 객체 배열 생성
		animals[0] = new Human();
		animals[1] = new Horse();
		animals[2] = new Eagle();
		
		//downCasting() 호출
		downCasting();
		
	}//main()
	
	public static void downCasting() {
		for(int i = 0; i < animals.length; i++) {
			//1개의 인스턴스를 각각 저장
			Animal animal = animals[i];
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readBook();
			}else if(animal instanceof Horse) {
				Horse horse = (Horse)animal;
				horse.run();
			}else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.hunting();
			}else {
				System.out.println("지원하지 않는 타입니다.");
			}
		}
	}

}












