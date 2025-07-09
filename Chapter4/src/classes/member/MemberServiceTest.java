package classes.member;

public class MemberServiceTest {

	public static void main(String[] args) {
		// MemberService의 인스턴스 생성
		MemberService memberService = new MemberService();
		
		String id = "hangang";
		String password = "k2025";
		
		//로그인
		boolean result = memberService.login(id, password);
		if(result) {
			System.out.println("로그인 되었습니다.");
			System.out.println(id + "님, 환영합니다.");
		}
		else {
			System.out.println("아이디나 비밀번호가 일치하지 않습니다.");
		}
		
		//로그 아웃
		memberService.logout(id);
	}
}
