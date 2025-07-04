package repeatitions;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// 구구단 출력
		/*
		   6 x 1 = 6(6*1)
		   6 x 2 = 12(6*2)
		   ...
		 */
		/*Scanner scan = new Scanner(System.in);
		int dan; //단 변수
		
		System.out.print("단 입력: ");
		dan = scan.nextInt(); //단 입력
		
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " x " + i + " = " + (dan * i));
		}
		scan.close();*/
		
		//전체 구구단
		int dan;
		int i;
		
		for(dan = 2; dan <= 9; dan++) {
			System.out.println(" [" + dan + " 단]");
			for(i = 1; i <= 9; i++) {
				System.out.println(dan + " x " + i + " = " + (dan * i));
			}
			System.out.println();
		}
		
		//단보다 곱하는 수가 작거나 같은 경우만 출력
		/*for(dan = 2; dan <= 9; dan++) {
			System.out.println(" [" + dan + " 단]");
			for(i = 1; i <= dan; i++) {
				System.out.println(dan + " x " + i + " = " + (dan * i));
			}
			System.out.println();
		}*/
		
		for(dan = 2; dan <= 9; dan++) {
			System.out.println(" [" + dan + " 단]");
			for(i = 1; i <= dan; i++) {
				if(dan >= i) 
					System.out.println(dan + " x " + i + " = " + (dan * i));
			}
			System.out.println();
		}
	}
}

