package generics.box;

//일반화 자료형으로 클래스 생성
//제네릭(일반화) 프로그래밍
public class Box<T> {
	
	private T type;  //멤버 변수
	
	//set()
	public void set(T type) {
		this.type = type;
	}
	
	//get()
	public T get() {
		return type;
	}
	
}
