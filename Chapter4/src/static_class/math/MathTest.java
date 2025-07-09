package static_class.math;

class MyMath{
	//절대값 계산 메서드
	//static이 있는 메서드 생성
	public static int myAbs(int x) {
		if(x < 0)
			return -x;
		else
			return x;
	}
	
	//거듭제곱을 계산 메서드
	public static int myPow(int x, int y) {
		//2의 3승 = (1 x )2 x 2 x 2
		int num = 1; //곱하기 결과값
		for(int i = 0; i < y; i++) {
			num *= x; //num = num * x;
		}
		return num;
		/*
		    i=0, 1 x 2 = 2
		    i=1, 2 x 2 = 4
		    i=2, 4 x 2 = 8
		    i=3, for문 종료
		 */
	}
}

public class MathTest {

	public static void main(String[] args) {
	
		//static이 붙여진 메서드는 클래스 이름으로 직접 접근 사용
		System.out.println("=== 내가 직접 만든 MyMath 사용 ===");
		System.out.println(MyMath.myAbs(-10)); //절대값 계산
		System.out.println(MyMath.myPow(2, 3)); //8
		
		System.out.println("=== java.lang.Math 사용 ===");
		System.out.println(Math.abs(-10));
		System.out.println((int)Math.pow(2, 3)); //8
	}

}
