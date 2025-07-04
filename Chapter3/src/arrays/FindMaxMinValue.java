package arrays;

public class FindMaxMinValue {

	public static void main(String[] args) {
		// 최대값 찾기
		//int[] array = new int[]{ 11, 50, 3, 45, 77};
		int[] array = { 11, 50, 3, 45, 77};
		int maxVal, minVal;
		maxVal = array[0];  // 첫번째 값을 최대값으로 설정함
		
		for(int i = 1; i < array.length; i++) {
			if(array[i] > maxVal)
				maxVal = array[i];
		}
		System.out.println("최대값: " + maxVal);
		
		//최소값 찾기
		minVal = array[0];
		
		for(int i = 1; i < array.length; i++) {
			if(array[i] < minVal)
				minVal = array[i];
		}
		System.out.println("최대값: " + minVal);
		
		/*
		   11, 50, 3, 45, 77
		   array[0]  max = 11
		   array[1] > 11, max = 50
		   array[2] > 50
		   array[3] > 50
		   array[4] > 50, max = 77
		 */
		

	}

}
