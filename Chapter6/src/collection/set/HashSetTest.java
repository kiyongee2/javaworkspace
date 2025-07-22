package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// Set 타입의 자료구조 사용
		Set<String> set = new HashSet<>();
		
		//요소 추가
		set.add("Java");
		set.add("C++");
		set.add("Python");
		set.add("Java");  //중복 저장 불가
		
		//인스턴스 출력
		System.out.println(set); //[Java, C++, Python]
		
		//특정 요소 검색 - 순서가 없으므로 인덱스로 접근 불가
		//set.get(1) //get()를 지원하지 않음
		if(set.contains("C++")) {
			System.out.println("C++");
		}
		
		//요소의 개수
		System.out.println("총 개수: " + set.size());  
		
		//전체 요소 출력 - Iterator 반복자 사용
		Iterator<String> ir = set.iterator();
		while(ir.hasNext()) { //요소를 순회하면서
			String element = ir.next();  //요소가 있으면
			System.out.println("\t" + element);
		}
		
		//요소 삭제 - remove()
		if(set.contains("Python")) {
			set.remove("Python");
		}
		
		System.out.println("== 삭제 후 출력 ==");
		//범위 기반 for문
		for(String element : set)
			System.out.println("\t" + element);
	}

}









