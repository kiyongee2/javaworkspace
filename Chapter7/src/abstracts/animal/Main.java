package abstracts.animal;

public class Main {

	public static void main(String[] args) {
		// 다형성으로 인스턴스 생성
		/*Animal cat = new Cat();
		Animal dog = new Dog();
		
		cat.breathe();
		cat.cry();
		
		dog.breathe();
		dog.cry();*/
		
		//매개변수의 다형성
		animalCry(new Cat());
		animalCry(new Dog());
	}

	private static void animalCry(Animal animal) {
		animal.cry();
	}
	
}












