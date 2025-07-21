package lambda;

public class MyFunctionalInterfaceTest {

	public static void main(String[] args) {
		// 함수형 인터페이스 - 람다식으로 구현
		MyFunctionalInterface fi;
		
		//매개변수가 없으므로 소괄호 사용, ->(화살표 연산자)
		fi = () -> {
			String str = "Hello~ lambda";
			System.out.println(str);
		};
		fi.method();

	}

}
