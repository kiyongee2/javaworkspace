package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
	Stream 클래스
	- 배열이나 리스트 처리에 대한 기능을 구현해 놓음
	- 반복자(Iterator) 역할 : 람다식으로 처리함
*/

public class StreamTest {

	public static void main(String[] args) {
		// 리스트 자료구조 사용
		/*ArrayList<String> companyList = new ArrayList<>();
		
		companyList.add("LG");
		companyList.add("Samsung");
		companyList.add("Hyundai");*/
		
		//Arrays 클래스
		List<String> companyList = Arrays.asList("LG", "Samsung", "Hyundai");
		
		//Stream 클래스
		Stream<String> stream = companyList.stream();
		stream.forEach(company -> System.out.println(company));

	}

}










