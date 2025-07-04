package constant;

public class FinalEx {

	public static void main(String[] args) {
		//상수 - 변수에 상대되는 용어이며, 변하지 않는 값을 말한다.
		// 0 ~ 100 -> MIN_NUM ~ MAX_NUM
		final int MIN_NUM = 0;
		final int MAX_NUM = 100;
		
		//MIN_NUM = 1;  //상수는 변경할 수 없다.
		
		//복제 - ctrl + alt + 방향키(아래)
		System.out.println(MIN_NUM); //0
		System.out.println(MAX_NUM); //100
		
		//원의 넓이 계산 - 원주율 * 반지름 * 반지름
		int radius = 5; //반지름
		final double PI = 3.1415; //원주율(상수)
		double area;
		
		area = PI * radius * radius;
		
		System.out.printf("%.3f\n", area); //소수 세째자리
	}

}









