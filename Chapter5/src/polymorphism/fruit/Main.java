package polymorphism.fruit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//사용자 선택 화면 
		System.out.println("1.포도 | 2.복숭아 | 3.바나나");
		System.out.print("선택> ");
		
		int choice = scanner.nextInt();
		
		//다형성으로 인스턴스 생성
		Fruit fruit = null;
		if(choice == 1) {
			fruit = new Grape();
		}else if(choice == 2) {
			fruit = new Peach();
		}else if(choice == 3) {
			fruit = new Banana();
		}
		fruit.showInfo();  //각각 자신의 인스턴스에 메서드가 바인딩 됨
		
		scanner.close();
	}

}
