package choices;

public class IfEx3 {

	public static void main(String[] args) {
		// 짝수/홀수 판정하기
		// 조건 - 10보다 큰수와 작은수를 구분하고, 짝수 홀수 판정
		// 중첩 if문
		int num = 25;
		
		if(num >= 10) {
			if(num % 2 == 0) {
				System.out.println("10보다 큰 짝수입니다.");
			}
			else {
				System.out.println("10보다 큰 홀수입니다.");
			}
		}
		else {
			if(num % 2 == 0) {
				System.out.println("10보다 작은 짝수입니다.");
			}
			else {
				System.out.println("10보다 작은 홀수입니다.");
			}
		}
	}
}
