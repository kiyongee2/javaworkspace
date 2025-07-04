package scores;

import java.util.Scanner;

public class CalcScore2 {

	public static void main(String[] args) {
		//성적 처리 프로그램(if 문)
		Scanner scan = new Scanner(System.in);
		boolean run = true;  //run(상태 변수) run = true(실행) / false(종료)
		int studentNum;  //학생수
		int[] scores = null; //점수 배열
		
		while(run) {
			System.out.println("==================================================");
			System.out.println("1.학생수 | 2.점수 입력 | 3.점수 리스트 | 4.분석 | 5.종료");
			System.out.println("==================================================");
			System.out.print("선택> ");
			
			int menu;  //번호 선택
			menu = scan.nextInt();  //번호 입력(키 입력 대기)
			
			if(menu == 1) {
				System.out.print("학생수> ");
				studentNum = scan.nextInt();
				scores = new int[studentNum]; //점수 배열 생성
			}
			else if(menu == 2) {
				if(scores != null) {
					for(int i = 0; i < scores.length; i++) {
						System.out.print("scores[" + i + "]>");
						scores[i] = scan.nextInt();
					}
				}
			}
			else if(menu == 3) {
				if(scores != null) {
					for(int i = 0; i < scores.length; i++) {
						System.out.println("scores[" + i + "]=" + scores[i]);
					}
				}
			}
			else if(menu == 4) {
				if(scores != null) {
					//평균 점수, 최고 점수
					int sum = 0;
					double avg;
					int max = 0;  //최고 점수
			
					max = scores[0]; //첫째값을 최대값 설정
					for(int i = 0; i < scores.length; i++) {
						sum += scores[i]; //합계
						if(scores[i] > max)
							max = scores[i];
					}
					
					//평균
					avg = (float)sum / scores.length;
					
					System.out.printf("평균 점수: %.1f점\n", avg);
					System.out.println("최고 점수: " + max + "점");
				}
			}
			else if(menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}
			else {
				System.out.println("잘못된 선택입니다. 다시 선택하세요");
			}
		}//while 닫기
		scan.close();
	}
}
