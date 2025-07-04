package scores;

public class GetAverage {

	public static void main(String[] args) {
		
		int[] number = new int[5];
		
		//저장
		for(int i = 0; i < number.length; i++) {
			number[i] = 2 * (i + 1); //짝수 저장
		}
		
		for(int i=0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		System.out.println("\n=================");
		
		int sum = 0;
		float avg;
		
		for(int i=0; i < number.length; i++) {
			sum += number[i]; //합계
		}
		//평균
		avg = (float)sum / number.length;
		
		System.out.println("총합: " + sum);
		System.out.println("평균: " + avg);

	}

}

