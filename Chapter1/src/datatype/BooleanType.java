package datatype;

public class BooleanType {

	public static void main(String[] args) {
		// boolean - 결과값이 true / false일 경우 사용하는 자료형
		// 1바이트
		boolean value1 = true;
		System.out.println(value1); //true
		
		boolean value2;
		value2 = (10 > 20);
		System.out.println(value2);
		
		System.out.println("***** 사원의 정보 *****");
		String name = "오상식";
		int age = 41;
		boolean isMerried = true;
		int numberOfChildren = 3;
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("결혼유무: " + isMerried);
		System.out.println("자녀수: " + numberOfChildren);

	}
}





