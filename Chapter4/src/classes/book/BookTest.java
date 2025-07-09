package classes.book;

public class BookTest {

	public static void main(String[] args) {
		// Book의 인스턴스 생성
		//Book book1 = new Book(1001, "채식주의자", "한강");
		
		//책 정보
		//book1.displayInfo();
		
		//배열로 관리하기
		Book[] books = new Book[3]; //빈 3개의 공간을 가진 배열
		
		for(int i = 0; i < books.length; i++) {
			System.out.print(books[i] + " "); //null null null
		}
		System.out.println();
		
		//인스턴스 3개 생성
		books[0] = new Book(1001, "채식주의자", "한강");
		books[1] = new Book(1002, "자바프로그래밍 입문", "박은종");
		books[2] = new Book(1003, "모두의 파이썬", "이승찬");
		
		//책 정보 출력
		for(int i = 0; i < books.length; i++) {
			books[i].displayInfo();
		}
		

	}

}
