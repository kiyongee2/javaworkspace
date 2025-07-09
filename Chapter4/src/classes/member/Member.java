package classes.member;

public class Member {
	private String id;
	private String password;
	
	public Member(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public void showMemberInfo() {
		System.out.println("id: " + id + ", password: " + password);
	}
}
