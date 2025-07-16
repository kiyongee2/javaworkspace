package exceptions;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		
		System.out.println("[프로그램 시작]");
		try {
			//일반예외 - 예외가 발생할 수 있는 영역을 try로 감싸줌
			printLength("Hello");
			printLength(null); //의도적으로 널 데이터 입력
		}catch(NullPointerException e) {
			//예외를 처리하는 메시지 명시
			System.out.println(e.getMessage());
		}
	}
	
	public static void printLength(String data) {
		int length = data.length();
		System.out.println("문자 수: " + length);
	}
	
}
