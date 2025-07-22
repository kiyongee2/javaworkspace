package stream;

import java.util.Arrays;

/*
    Arrays 클래스 - 자료형의 데이터를 순차적으로 저장하는 자료구조
    - 배열의 특징을 가지고 있음
    - 여러가지 다양한 메서드를 구현하고 있음
 */

public class ArraysTest1 {

	public static void main(String[] args) {
		// 배열로 부터 스트림 얻기
		String[] fruits = {"apple", "banana", "grape"};
		
		//for() 문
		for(String fruit : fruits)
			System.out.println(fruit);
		
		//Arrays 클래스의 stream() - forEach() 문
		Arrays.stream(fruits).forEach(fruit -> System.out.println(fruit));
		
		//정수형 배열 처리
		int[] numbers = {1, 2, 3, 4};
		
		//for()
		for(int number : numbers)
			System.out.println(number);
		
		//Arrays로 stream() - forEach()
		Arrays.stream(numbers).forEach(number -> System.out.println(number));
		
		//연산
		int sumVal = Arrays.stream(numbers).sum();
		//count()의 반환값이 long형이므로 강제 형변환
		int count = (int)Arrays.stream(numbers).count(); 
		float average = (float)sumVal / count;
		
		System.out.println("합계: " + sumVal);
		System.out.println("개수: " + count);
		System.out.println("평균: " + average);
	}
}







