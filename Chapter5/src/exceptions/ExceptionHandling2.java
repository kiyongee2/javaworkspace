package exceptions;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// 컴파일 예외 - 컴파일러가 미리 인지하는 오류
		// Class - 클래스를 찾는 클래스
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
			//e.printStackTrace();
		}finally {
			//예: 재시동될때 clear()등 예외가 있든 없든 수행되는 부분
			//특히 외부 네트워크 연동시 사용함
			System.out.println("항상 수행됨");
		}
	}

}
