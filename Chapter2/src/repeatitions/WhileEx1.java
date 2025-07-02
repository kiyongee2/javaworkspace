package repeatitions;

public class WhileEx1 {

	public static void main(String[] args) {
		/*
		   시작값
		   while(종료 조건){
		   	  증감값
		   	  실행문
		   }
		  
		 */
		//1부터 10까지 합계 출력
		int n = 1;  //시작값
	    int sum = 0;
	    
		while(n <= 10) { //종료 조건(n=11)
			sum += n; //sum = sum + n;
			System.out.println("n = " + n + ", sum = " + sum);
			n++; // n += 1
		}
		System.out.println("합계: " + sum);
		
		/*
		    sum = 0
		    sum = sum + n;
		    
		    n = 1, sum = 0 + 1
		    n = 2. sum = 1 + 2
		    n = 3, sum = 3 + 3
		  
		 */
		/*System.out.println(n);
		
		n++;
		System.out.println(n);
		
		n++;
		System.out.println(n);*/

	}

}
