package exceptions;

public class ThrowsTest {

	public static void main(String[] args) {
		// findClass() 호출한 곳에서 예외 처리
		try {
			findClass();
			System.out.println("클래스를 찾았습니다.");
		}catch(ClassNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다. " + e.getMessage());
		}
	}

	private static void findClass() throws ClassNotFoundException {
		//클래스 이름을 인자로 호출 - 예외 미루기
		Class.forName("java.lang.Math2");
	}
	
	

}
