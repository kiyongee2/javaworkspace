package methods;

public class VoidMethods {
	
	//void - 반환 자료형이 없음
	//인사하는 기능을 하는 메서드 정의
	public static void sayHello() {
		System.out.println("안녕하세요~");
	}
	
	//매개변수, 입력변수 - String name
	public static void sayHello(String name) { //String name = "유진"
		System.out.println(name + "님 안녕하세요~");
	}
	
	//main() 메서드
	public static void main(String[] args) {
		//반환 자료형이 없는 함수
		sayHello(); //메서드 호출
		
		sayHello("유진");
		sayHello("John");
	}
	
}
