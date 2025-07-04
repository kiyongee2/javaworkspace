package seats;

public class NestedFor {

	public static void main(String[] args) {
		// 중첩 for문에서 숫자 출력
		/*
		    1 2 3 4 5
		    6 7 8 9 10
		    11 12 13 14 15 
		    16 17 18 19 20
		    21 22 23 24 25
		 */
		int i, j;
		for(i=0; i<5; i++) {
			for(j=1; j<=5; j++) {
				int num = i*5+j;
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
		/*
		    1 2 3 4 5
		    6 7 8 9 10
		    11 12 13 14 15 
		    16 17 18 19 20
		    21 22 
	    */
		for(i=0; i<5; i++) {
			for(j=1; j<=5; j++) {
				int num = i*5+j;
				if(num > 22)
					break;
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

}
