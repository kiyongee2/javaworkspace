package exceptions;

public class ThrowNewTest {

	public static void main(String[] args) {
		
		//나이를 체크하는 메서드 호출
		try {
			//checkAge(-10);
			checkAge(17);
		} catch(IllegalArgumentException e) {
			System.out.println("예외 발생: " + e.getMessage());
		} catch(ArithmeticException e) {
			System.out.println("예외 발생: " + e.getMessage());
		}
	}
	
	private static void checkAge(int age) {
		//throw new - 강제로 예외 발생 시킴
		if(age < 0) {
			throw new IllegalArgumentException("나이는 음수가 될 수 없습니다.");
		}else if(age < 20) {
			throw new ArithmeticException("미성년자는 입장할 수 없습니다.");
		}else {
			System.out.println("입장 가능합니다.");
		}
	}

}
