package typing;

import java.util.Random;
import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		
		String str = "sun moon earth galaxy mountain flower tree bird girl human";
		int n = 1;  //문제 번호(10문제 출제)
		long start, end;   //시작, 종료 시간
		double elapsedTime;  //소요 시간
		
		Scanner scan = new Scanner(System.in);
		System.out.println("[타자 게임], 준비되면 엔터> ");
		scan.nextLine(); //엔터
		
		// s(초) > ms(1/1000초) > 마이크로초(1/백만) > 나노(1/10억)
		//1970. 1. 1. 자정(유닉스 운영체제 시스템이 시작) 이후부터 현재까지의 시간을 반환
		start = System.currentTimeMillis();  //시작 시간
		//System.out.println(start);  //1752560908633(ms초)
		
		while(n <= 10) {
			//문자열 분리(split()) -> 단어 리스트
			String[] words = str.split(" ");
			Random rand = new Random();
			int rndIdx = rand.nextInt(words.length); //0~3
			String question = words[rndIdx];  //문제(랜덤)
			
			System.out.println("\n문제 번호 " + n);
			System.out.println(question); //문제 출력
			String answer = scan.nextLine(); //사용자 입력
			
			if(answer.equals(question)) {
				System.out.println("통과!");
				n++; //다음 번호
			}else {
				System.out.println("오타! 다시 도전");
			}
		}//while()
		
		end = System.currentTimeMillis(); //종료 시간
		elapsedTime = (double)(end - start) / 1000; //밀리초를 초로 환산
		System.out.printf("게임 소요 시간: %.2f초", elapsedTime);
		
		scan.close();
	}
}
