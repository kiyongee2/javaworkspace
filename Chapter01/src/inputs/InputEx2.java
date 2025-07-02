package inputs;

import java.util.Scanner;

public class InputEx2 {

	public static void main(String[] args) {
		// 짝수, 홀수 판정
		// 짝수 - 2, 4, 6, 8 -> 2의 배수(2로 나눈 나머지 0)
		// num % 2 == 0(짝수),  num % 2 == 1(홀수)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt(); //숫자 입력
		String result;
	
		result = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println(result);
		
		scan.close();
	}

}
