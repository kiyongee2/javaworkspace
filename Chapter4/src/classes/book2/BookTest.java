package classes.book2;

public class BookTest {

	public static void main(String[] args) {
		// Book의 인스턴스 생성
		Book book1 = new Book();
		
		//멤버변수가 private 속성이므로 접근 불가
		//book1.bookNumber
		
		book1.setBookNumber(1001);
		book1.setBookTitle("채식주의자");
		book1.setAuthor("한강");
		
		System.out.println("책번호: " + book1.getBookNumber());
		System.out.println("책제목: " + book1.getBookTitle());
		System.out.println("저자: " + book1.getAutor());

	}

}
