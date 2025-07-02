package practice;

public class Bread {

	public static void main(String[] args) {
		
		int bread = 25;  //빵의 개수
		int person = 4;  //사람수
		
		int share = bread / person;  //몫
		int remainder = bread % person; //나머지
		
		System.out.println("각자의 몫: " + share);
		System.out.println("남은 빵의 개수: " + remainder);
	}
}
