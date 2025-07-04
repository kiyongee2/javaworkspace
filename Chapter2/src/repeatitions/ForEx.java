package repeatitions;

public class ForEx {

	public static void main(String[] args) {
		// for 반복문 - 어떤 범위내에서 반복하는 구문
		// for(초기값; 종료조건; 증감값;){실행문}
		// 1 ~ 10 출력, 합계
		int i;  //반복 변수
		int sum = 0;  //합계
		
		for(i = 1; i <= 10; i++) {
			sum += i;
			System.out.print(i + " ");
		}
		System.out.println("\n합계: " + sum);
		
		//문자(아스키 코드) 반복
		char ch;
		for(ch = 65; ch < 123; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println(); //줄바꿈
		
		//유니코드(한글) 반복
		for(ch = 12593; ch < 12686; ch++) {
			System.out.print(ch + " ");
		}

	}

}









