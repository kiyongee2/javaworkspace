package classes.member;

public class MemberTest {

	public static void main(String[] args) {
		//객체 배열
		Member[] members = new Member[3];
		
		//객체 생성 1
		members[0] = new Member("정은하", "j1234");
		members[1] = new Member("김우주", "k0000");
		members[2] = new Member("박하늘", "p4320");
		
		//객체 생성 2
		/*Member[] members = {
				new Member("정은하", "j1234"),
				new Member("김우주", "k0000"),
				new Member("박하늘", "p4320")
		};*/
		
		System.out.println("********** 회원 현황 **********");
		for(int i = 0; i < members.length; i++)
			members[i].showMemberInfo();
	}
}
