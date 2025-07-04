package repeatitions;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		/* 키 입력에 따른 반복 구문
		   y or Y - "계속 반복합니다."
		   n or N - "반복을 중단합니다."
		   그 이외의 키 - "지원하지 않는 기능입니다."
		*/
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("계속 반복할까요?(y/n): ");
			
			//char 'y' 가 아닌 String "y" 사용
			String key = scan.nextLine(); //문자 입력
			
			if(key.equals("y") || key.equals("Y")) {
				System.out.println("계속 반복합니다.");
			}
			else if(key.equals("n") || key.equals("N")) {
				System.out.println("반복을 중단합니다.");
				break; //while 빠져 나감
			}
			else {
				System.out.println("지원하지 않는 기능입니다.");
			}
		}
		System.out.println("프로그램을 종료합니다.");
		scan.close();
	}
}












