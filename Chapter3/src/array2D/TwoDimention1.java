package array2D;

public class TwoDimention1 {

	public static void main(String[] args) {
		//정수형 2차원 배열
		int[][] a = new int[2][3];
		int i, j;  //반복 변수 행, 열
		
		//배열의 크기
		System.out.println("행의 크기: " + a.length); //2
		System.out.println("열의 크기: " + a[0].length); //3
		System.out.println("열의 크기: " + a[1].length); //3
		
		//출력
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println(); //행 바꿈
		}
		
		//값 저장 1
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		
		//출력
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println(); //행 바꿈
		}
		
		//정수형 2차원 배열 a2 생성
		int a2[][] = {
			{1, 2, 3},
			{4, 5, 6}
		};
		
		for(i = 0; i < a2.length; i++) {
			for(j = 0; j < a2[i].length; j++) {
				System.out.print(a2[i][j] + " ");
			}
			System.out.println(); //행 바꿈
		}
	}

}






