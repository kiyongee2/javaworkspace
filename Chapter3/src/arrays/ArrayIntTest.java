package arrays;

public class ArrayIntTest {

	public static void main(String[] args) {
		// 정수형 배열 선언
		int[] num = new int[4];
		
		//요소 추가
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		
		//배열의 크기
		System.out.println("배열의 크기: " + num.length);
		
		//특정 요소 검색 - 2번 위치
		System.out.println(num[2]);
		
		//전체 출력
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		/*
		    i=0, num[0], 10
		    i=1, num[1], 20
		    i=2, num[2], 0
		    i=3, num[3], 0
		 */
		System.out.println();
		
		//연산
		System.out.println(num[0] + num[1]); //30
	}

}
