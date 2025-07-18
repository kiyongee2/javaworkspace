package collection.member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		// MemberArrayList의 인스턴스 생성
		MemberArrayList memberArrayList = new MemberArrayList();
		
		//회원 인스턴스 생성
		/*Member lee = new Member(1001, "이정후");
		Member shin = new Member(1002, "신유진");
		Member woo = new Member(1003, "우상혁");
		
		//회원 추가
		memberArrayList.addMember(lee);
		memberArrayList.addMember(shin);
		memberArrayList.addMember(woo);*/
		
		memberArrayList.addMember(new Member(1001, "이정후"));
		memberArrayList.addMember(new Member(1002, "신유진"));
		memberArrayList.addMember(new Member(1003, "우상혁"));
		
		//회원 삭제
		memberArrayList.removeMember(1002);
		memberArrayList.removeMember(1004);
		
		//회원 검색
		memberArrayList.showAllMember();
		
;
	}

}
