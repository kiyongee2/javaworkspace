package classes.member;

//로그인, 로그아웃 기능을 가진 클래스
public class MemberService {
	
	//MemberService(){}
	
	//로그인 메서드 - boolean 결과 - true/false
	public boolean login(String id, String password) {
		if(id.equals("hangang") && password.equals("k2025"))
			return true;
		return false;
	}
	
	//로그아웃 메서드
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
