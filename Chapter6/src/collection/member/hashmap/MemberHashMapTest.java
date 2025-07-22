package collection.member.hashmap;

import collection.member.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		// MemberHashMap 인스턴스 생성
		MemberHashMap hashMap = new MemberHashMap();
		
		//회원 추가
		hashMap.addMember(new Member(1001, "이정후"));
		hashMap.addMember(new Member(1002, "신유빈"));
		hashMap.addMember(new Member(1003, "최민정"));
		hashMap.addMember(new Member(1002, "임시현")); //key는 중복불가, 값은 수정
		
		//회원 전체 검색
		hashMap.showAllMember();
		System.out.println("---------------------------------");
		
		//회원 삭제
		hashMap.removeMember(1003);
		hashMap.removeMember(1004);
		
		//회원 검색
		hashMap.showAllMember();

	}

}
