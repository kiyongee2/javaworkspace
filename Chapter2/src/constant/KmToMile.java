package constant;

import java.util.Scanner;

public class KmToMile {

	public static void main(String[] args) {
		// 단위 변환 - 1mile = 1.609km, 1inch = 2.54cm
		// 변환 상수 - 1.609, 2.54
		
		Scanner scan = new Scanner(System.in);
		double kph; //km
		double mph; //mile
		final double RATE_KPH_MPH = 1.609;
		
		System.out.print("당신의 구속을 입력하세요(km/h): ");
		kph = scan.nextDouble(); 
		
		//속도 계산
		mph = kph / RATE_KPH_MPH;
		
		System.out.printf("공의 속도는 %.2f[MPH]입니다.\n", mph);
		scan.close();
	}

}
