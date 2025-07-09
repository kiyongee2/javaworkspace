package inputs;

import java.util.Scanner;

public class InputEx1 {

	public static void main(String[] args) {
		// 입력 처리 - Scanner 클래스
		// 당신의 이름은 무엇입니까? 신유진
		// scan 인스턴스 생성
		// 문자열 입력 - nextLine(), 숫자 입력 - nextInt()
		Scanner scan = new Scanner(System.in);
		System.out.print("당신의 이름은 무엇입니까? ");  //java.lang 패키지
		String name = scan.nextLine();  //이름 입력
		System.out.println("이름: " + name);
		
		System.out.print("당신의 나이는 몇 세입니까?");
		int age = scan.nextInt();  //나이 입력
		System.out.println("나이: " + age + "세");
		
		scan.close();
	}

}
