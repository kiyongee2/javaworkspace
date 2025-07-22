package lambda.mymath;

public class MyMathTest {

	public static void main(String[] args) {
		// 람다식으로 구현
		MyMath math;   //인터페이스 타입으로 인스턴스 생성
		
		//이름이 없는 함수(익명 함수)
		math = (x) -> (x < 0) ? -x : x;
		System.out.println("절대값: " + math.myAbs(-6));

	}

}
