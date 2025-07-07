package arrays;

public class ArrayStringTest {

	public static void main(String[] args) {
		// 문자열 배열 관리 - 배열은 순서가 있고(0번에서 시작)
		//String[] cars = new String[] {"Sonata", "EV6", "BMW"};
		String[] cars = {"Sonata", "EV6", "BMW"};
		
		System.out.println(cars.length); 
		
		//요소 검색 - EV6
		System.out.println(cars[1]);
		
		//요소 수정 -  EV6를 Ioniq6로 변경
		cars[1] = "Ioniq6";
		
		//요소 전체 출력
		for(int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}
	}

}
