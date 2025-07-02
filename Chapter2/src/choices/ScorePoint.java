package choices;

import java.util.Scanner;

public class ScorePoint {

	public static void main(String[] args) {
		/*
		    90 ~ 100점 - A
		    80 ~ 89점  - B
		    70 ~ 79점  - C
		    70점 미만   - D
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score = scan.nextInt();  //점수 입력
		char grade = ' '; //공백 문자 초기화
		
		if(score >= 90 && score <= 100) {
			grade = 'A';
		}
		else if(score >= 80 && score < 90) {
			grade = 'B';
		}
		else if(score >= 70 && score < 80) {
			grade = 'C';
		}
		else {
			grade = 'D';
		}
		
		System.out.println("학점은 " + grade + "입니다.");
		scan.close();
	}
}
