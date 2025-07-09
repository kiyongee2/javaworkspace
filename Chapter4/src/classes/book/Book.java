package classes.book;

//Book 클래스 정의
public class Book {
	//멤버 변수
	private int bookNumber;   //책번호
	private String bookTitle; //책제목
	private String author;    //저자
	
	//생성자
	//생성자 오버로딩 - 이름이 같고 매개변수의 자료형과 개수가 다른 것을 말한다.
	//public Book(){}
	
	public Book(int bookNumber, String bookTitle, String author){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
		this.author = author;
	}
	
	//멤버 메서드
	public void displayInfo() {
		System.out.println("책번호: " + bookNumber);
		System.out.println("책제목: " + bookTitle);
		System.out.println("저자: " + author);
	}
}
