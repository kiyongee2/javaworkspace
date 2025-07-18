package collection.member;

//회원 클래스(참조 자료형) 정의
public class Member {
	private int memberId;       //회원 아이디
	private String memberName;  //회원 이름
	
	//생성자
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	//접근자 - getter
	public int getMemberId() {
		return memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}

	//Member 인스턴스의 문자열 정보 출력
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}
	
}







