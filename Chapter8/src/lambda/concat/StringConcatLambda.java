package lambda.concat;

public class StringConcatLambda {

	public static void main(String[] args) {
		//함수형 프로그래밍 방식
		StringConcat concat;
		String str1 = "힐";
		String str2 = "스테이트";
		
		//람다식 구현 - 익명 함수
		concat = (s, v) -> System.out.println(s + ", " + v);
		concat.makeString(str1, str2);
	}
}
