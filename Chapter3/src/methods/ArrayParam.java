package methods;

public class ArrayParam {

	public static void main(String[] args) {
		// 배열을 메서드의 매개변수로 전달(입력)
		//int[] numbers = new int[] {1, 2, 3, 4};
		int[] numbers = {1, 2, 3, 4, 5};
		double average;
		
		average = getAverage(numbers); //메서드 호출
		System.out.println("평균: " + average);
	}
	
	public static double getAverage(int[] nums) {
		//평균 = 합계 / 개수
		int sum = 0;
		double avg;  //평균
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i]; //sum = sum + nums[i];
		}
		
		avg = (double)sum / nums.length;
		
		return avg;
	}

}










