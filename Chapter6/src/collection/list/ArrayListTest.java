package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// ArrayList(List를 구현한 클래스) 자료 구조 사용
		// 요소 삽입, 삭제시 배열을 기능을 효율적으로 보완한 자료구조
		// String형 사용
		/*String[] list = new String[3];
		list[0] = "양파";
		list[1] = "마늘";
		list[2] = "감자";*/
		
		//부모 타입(List-인터페이스)으로 인스턴스 생성
		List<String> vegeList = new ArrayList<>();
		
		//요소 추가 - add()
		vegeList.add("양파");  //0번 인덱스
		vegeList.add("마늘");  //1
		vegeList.add("감자");  //2
		
		//vegeList 인스턴스 출력
		System.out.println(vegeList); //[양파, 마늘, 감자]
		
		//요소의 개수 - size()
		System.out.printf("총 객체수: %d개\n", vegeList.size()); //3
		
		//특정 요소 검색 - get()
		System.out.println(vegeList.get(1)); //마늘
		
		//요소 수정 - set()
		vegeList.set(2, "고구마");
		
		//전체 요소 출력
		for(int i = 0; i < vegeList.size(); i++) {
			String vegetable =  vegeList.get(i); //1개 가져옴
			System.out.print(vegetable + " ");
		}
		System.out.println();
		
		//요소 삭제 - remove()
		vegeList.remove("마늘");
		
		//범위 기반 for문 - for(자료형 변수이름 : 리스트(배열)이름){}
		for(String vegetable : vegeList)
			System.out.print(vegetable + " ");

	}

}







