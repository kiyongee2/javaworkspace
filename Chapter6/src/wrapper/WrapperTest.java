package wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		// Integer(큼) = int(작은) -> 자동 형변환
		Integer num1 = 100;
		int num2 = 200;
		int sum = 0;
		
		//intValue()는 Integer를 int형으로 변환
		sum = num1.intValue() + num2;
		
		System.out.println(num1);
		System.out.println(sum);
		
		//valueOf() -> 문자열을 정수형으로 변환
		Integer n1 = Integer.valueOf("12");
		System.out.println(n1); //12
		
		//parseInt() -> 문자열을 정수형으로 변환
		//parseDouble() -> 문자열을 실수형으로 변환
		//사용자 입력 처리시 숫자를 입력하더라도 실제는 문자가 입력됨
		int n2 = Integer.parseInt("13");
		System.out.println(n2);
		
		double dNum = Double.parseDouble("1.609");
		System.out.println(dNum);
	}
}








