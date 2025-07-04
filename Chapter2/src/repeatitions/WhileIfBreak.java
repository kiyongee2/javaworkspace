package repeatitions;

public class WhileIfBreak {

	public static void main(String[] args) {
		// 1부터 10까지 출력, 합계
		/*int n = 1;  //시작값
		int sum = 0; //합계(초기화)
		while(true) { //무한 반복
			if(n > 10)
				break;
			sum += n;
			//System.out.println(n);
			n++;
		}
		System.out.println("합계: " + sum);
		System.out.println("n = " + n);*/
		
		//1부터 4까지 곱하기 - 1x2x3x4 --> 4!
		int n = 1;
		int gob = 1; //곱한값의 초기값 1
		
		while(n <= 4) {
			gob *= n; //gob = gob * n;
			n++;
		}
		System.out.println("곱한값: " + gob);

	}

}







