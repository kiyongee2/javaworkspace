package arrays;

public class ArrayDoubleTest {

	public static void main(String[] args) {
		// 실수값을 저장할 배열 생성
		double[] data = new double[5];
		double total = 0.0;  //합계
		double average;      //평균
		
		//요소 저장
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		//합계 계산
		/*total += data[0]; //total = total + data[0];
		System.out.println(total);
		
		total += data[1]; //total = total + data[0] + data[1];
		System.out.println(total);
		
		System.out.println("=============");*/
		
		//출력
		for(int i = 0; i < data.length; i++) {
			total += data[i];  //합계 계산
			System.out.println(data[i]);
		}
		//평균 계산 - 평균 = 합계 / 개수
		average = total / data.length; 
		
		System.out.println("합계: " + total);
		System.out.println("평균: " + average);
	}
}
