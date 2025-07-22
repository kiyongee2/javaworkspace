package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		//map 자료구조 - 순서가 없음, 중복 불가(값은 수정 가능)
		// 학생의 이름과 점수를 저장할 Map 인스턴스 생성
		Map<String, Integer> map = new HashMap<>();
		
		//요소 추가 - put(key, value)
		map.put("강감찬", 95);
		map.put("허준", 75);
		map.put("이순신", 80);
		
		System.out.println(map); //{허준=75, 강감찬=95, 이순신=80}
		 
		//요소의 개수 - size()
		System.out.println("총 객체수: " + map.size() + "개"); //3
		
		//특정 요소 조회 - get(key)
		System.out.println(map.get("강감찬")); //95
		
		//요소 수정 - put(key, value)
		map.put("허준", 90); 
		
		//반복자 - Iterator 클래스 사용
		//전체 객체를 대상으로 한 번씩 반복해서 가져오는 클래스
		Iterator<String> iterator = map.keySet().iterator();
		while(iterator.hasNext()) { //순회하는 동안 요소를 가지고 있다면
			String key = iterator.next();  //요소의 키를 저장
			Integer value = map.get(key);  //키로 검색한 값을 저장
			System.out.println(key + " : " + value);
		}
		
		//요소 삭제 - remove()
		//삭제 시에 먼저 요소 포함여부를 확인해야 함
		if(map.containsKey("이순신")) { //요소가 포함되어 있으면
			map.remove("이순신");
		}
		
		System.out.println(map);
	}

}












