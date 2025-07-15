package randoms;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// 숫자 추측 게임 : 1~30까지 범위
		// nextInt(n) - (0 ~ n-1)의 숫자 랜덤하게 추출
		Random rand = new Random();
		int com = rand.nextInt(30) + 1;  //컴퓨터가 추측한 수
		//System.out.println(com);
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자(예: 1~30) 입력: ");
			int guess = scan.nextInt(); //사용자 입력
			//정답, 큰 경우, 작은 경우
			//범위 제한 - "범위를 초과했어요. 다시 입력하세요"
			if(guess < 1 || guess > 30) {
				System.out.println("범위를 초과했어요. 다시 입력하세요");
			}else { // guess >= 1 && guess <= 30
				if(guess == com ) {
					System.out.println("정답!");
					break;
				}else if(guess > com) {
					System.out.println("너무 커요!");
				}else {
					System.out.println("너무 작아요");
				}
			}	
		}

		scan.close();
		
		System.out.println("숫자 추측 게임 종료!");
	}
}




