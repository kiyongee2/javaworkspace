package classes.book;

public class BookTest2 {

	public static void main(String[] args) {
		// Book 객체의 배열
		
		Book[] books = {
			new Book(1001, "채식주의자", "한강"),
			new Book(1002, "자바프로그래밍 입문", "박은종"),
			new Book(1003, "모두의 파이썬", "이승찬")
		};
		
		//출력
		for(int i = 0; i < books.length; i++) {
			books[i].displayInfo();
			System.out.println("-------------------------");
		}

	}

}
