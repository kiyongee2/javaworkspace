package methods;

public class Practice {

	public static void main(String[] args) {
		// 절대값을 계산하는 함수 myAbs()를 정의하고 실행하기
		System.out.println("myAbs(-4)=" + myAbs(-4));
		System.out.println("myAbs(4)=" + myAbs(4));
	}
	
	//myAbs() 함수 정의
	public static int myAbs(int x) {
		if(x < 0) {
			return -x;
		}
		else { //x >= 0
			return x;
		}
	}
}
