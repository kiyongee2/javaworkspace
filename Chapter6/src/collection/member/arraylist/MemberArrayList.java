package collection.member.arraylist;

import java.util.ArrayList;

import collection.member.Member;

//회원을 관리(가입, 검색, 삭제)하는 클래스
public class MemberArrayList {

	//자료 저장할 자료구조 생성
	private ArrayList<Member> arrayList;
	
	//생성자
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	//회원 추가(가입)
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//회원 검색(전체)
	public void showAllMember() {
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);  //member 인스턴스 1명 가져옴
			System.out.println(member);
		}
	}
	
	//회원 삭제
	public boolean removeMember(int memberId) {
		for(int i = 0; i < arrayList.size(); i++) {
			//이미 등록된 memberId를 가져와서 외부에서 입력한 아이디와 비교
			int dbId = arrayList.get(i).getMemberId();
			if(dbId == memberId) {
				arrayList.remove(i); //일치되는 아이디를 가진 회원 삭제
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
}












