package repeatitions;

import java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {
		/*
		    커피 자동 판매기
		    - 동전 500원 -> 커피가 나옴
		    - 동전 500원 초과 -> 커피 나오고, 거스름돈이 나옴
		    - 동전 500원 미만 -> 커파 안나오고, 동전은 돌려 받음
		    - 커피는 5개이고 모두 소진되면 판매 중단
		 */
		Scanner scan = new Scanner(System.in);
		
		int coffee = 5;
		while(true) {
			System.out.print("돈을 넣어주세요: ");
			int money = scan.nextInt();  //동전 입력
			
			if(money == 500) {
				System.out.println("커피가 나옵니다.\n");
				coffee--; //coffee -= 1  //커피 개수 1감소
			}
			else if(money > 500) {
				System.out.println("커피가 나오고, 거스름돈 " + (money - 500) + "을 돌려줍니다.\n");
				coffee--;
			}
			else {
				System.out.println("커피가 나오지 않고 " + money + "원을 돌려줍니다\n");
			}
			
			//커피 모두 소진
			if(coffee == 0) {
				System.out.println("커피가 모두 소진되었습니다. \n판매를 중지합니다.");
				break; //반복 종료
			}
		}

	}

}













