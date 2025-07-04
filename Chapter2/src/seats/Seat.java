package seats;

import java.util.Scanner;

public class Seat {

	public static void main(String[] args) {
		// 자리 배치도 프로그램
		// 입장객, 좌석 열, 좌석 줄
		/*
		     20(명) / 5(열) = 4(줄)
		     21 / 5 = 4(줄) + 1(줄)
		     
		     20 % 5 == 0(나누어 떨어지는 경우)
		     20 % 5 != 0(나누어 떨어지는 않는 경우) - 1줄이 더 필요
		 */
		int customer, column, row;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입장객 수 입력: ");
		customer = scan.nextInt();
		
		System.out.print("좌석 열 수 입력: ");
		column = scan.nextInt();
		
		if(customer % column == 0) {
			row = customer / column;
		}
		else {
			row = customer / column + 1;
		}
		//System.out.println(row + "줄이 필요합니다.");
		//바깥쪽 for - 행(row), 안쪽 for - 열(column)
		for(int i = 0; i < row; i++) {
			for(int j = 1; j <= column; j++) {
				int num = i * column + j;  //좌석 번호
				if(num > customer)
					break;
				System.out.print("좌석" + num + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}












