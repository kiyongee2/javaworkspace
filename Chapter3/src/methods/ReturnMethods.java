package methods;

public class ReturnMethods {
	
	public static void main(String[] args) {
		
		float value = add(10.0f, 20.0f);
		System.out.println(value); //30.0
		
		int value2 = square(4);
		System.out.println(value2); //16
		
		String msg = message();
		System.out.println(msg); //Good Luck!
		
	}
	//응원 메시지를 출력하는 기능을 하는 함수
	public static String message() {
		return "Have a nice day!";
	}

	//더하기 기능을 하는 메서드 정의
	//반환 자료형 - float
	public static float add(float x, float y) {
		return x + y;
	}
	
	//제곱수를 반환하는 기능 메서드
	public static int square(int n) {
		int result;     //지역 변수(Local Variable)
		result = n * n;
		return result;
	}
}











