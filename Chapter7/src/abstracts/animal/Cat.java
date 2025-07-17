package abstracts.animal;

//상속받는 클래스는 부모 클래스의 추상메서드를 반드시 구현해야 함
public class Cat extends Animal{

	@Override
	public void cry() {
		System.out.println("야~ 옹!");
	}
	
}
