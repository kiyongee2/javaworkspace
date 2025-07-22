package collection.member.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.member.Member;

//HashMap으로 회원 관리하는 클래스(추가, 검색, 삭제)
public class MemberHashMap {
	
	HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	//회원 추가
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	//전체 검색
	public void showAllMember() {
		//반복자 인스턴스 ir 생성
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next(); //key가 있으면
			Member member = hashMap.get(key); //key로 검색해서 값(value) 저장
			System.out.println(member);
		}
		System.out.println();
	}
	
	//회원 삭제
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		
		System.out.println(memberId + " 회원이 존재하지 않습니다.");
		return false;
	}
}






