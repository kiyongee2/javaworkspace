package array2D;

public class ArrayCalc {

	public static void main(String[] args) {
		// 2차원 배열을 활용한 기초 통계
		int[][] numbers = {
			{1, 2, 3, 4},
			{5, 6, 7}
		};
		int i, j;
		int sum = 0; //합계
		int count = 0; //요소의 개수
		double average;
		
		//7을 검색하세요
		System.out.println(numbers[1][2]);
		
		//합계 계산
		//sum += numbers[0][0]; //sum = 1
		//sum += numbers[0][1]; //sum = 3
		for(i = 0; i < numbers.length; i++) {
			for(j = 0; j < numbers[i].length; j++) {
				sum += numbers[i][j];
				count++; //1번 더하기 할때 카운트도 1증가
			}
		}
		//평균 계산
		average = (double)sum / count;
		
		System.out.println("합계: " + sum); //28
		System.out.println("평균: " + average); //4.0
		
		//전체 출력
		for(i = 0; i < numbers.length; i++) {
			for(j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}

}
