package repeatitions;

public class NestedFor {

	public static void main(String[] args) {
		// 중첩 for문 - 이중 for문
		// 외부 for - 행(row), 안쪽 for문 - 열(column)
		int i, j;
		
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println(); //행 바꿈
		}

		/*
		   i=1(1행), j=1, 가
		             j=2, 가가
		             j=3, 가가가
		             j=4, 가가가가
		             j=5, 가가가가가(출력)
		   i=2(2행), j=1, 가
		             j=2, 가가
		             j=3, 가가가
		             j=4, 가가가가
		             j=5, 가가가가가(출력)      
		  
		 */
		
		//별찍기 - 직각삼각형
		/*
		   *
		   **
		   ***
		   ****
		   *****
		   
		   1(i)행 - 1(j)
		   2행 - 2
		   3행 - 3
		   4행 - 4
		   5행 - 5
		*/
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(); //행 바꿈
		}
		
		/*
		   *****
		    ****
		     ***
		      **
		       *
		   
		   1(i)행 - 5(j)
		   2행 - 4
		   3행 - 3
		   4행 - 2
		   5행 - 1
		*/
		System.out.println();
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 6 - i; j++) {
				System.out.print("*");
			}
			System.out.println(); //행 바꿈
		}
		
	}

}
