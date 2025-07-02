package operator;

public class SwapValue {

	public static void main(String[] args) {
		
		//대입 연산자 - '='
		int x = 10;  //변수 x에 10을 기억(저장)
		int y = 20;
		int temp;    //교환을 위한 임시 변수 선언
		
		System.out.println("***** 교환 전 *****");
		System.out.println("x = " + x + ", y = " + y);
		
		//교환
		temp = x; 
		x = y;
		y = temp;
		
		System.out.println("***** 교환 후 *****");
		System.out.println("x = " + x + ", y = " + y);
	}
}
