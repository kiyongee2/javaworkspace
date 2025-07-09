package classes.book2;

//멤버변수에 접근 제어자 - private 사용
public class Book {
	private int bookNumber;   //책번호
	private String bookTitle; //책제목
	private String author;    //저자
	
	public Book() {}  //기본 생성자
	
	//설정자 메서드 - setter -> set + 멤버변수이름()
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//접근자 메서드 - getter -> get + 멤버변수이름()
	public int getBookNumber() {
		return bookNumber;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	
	public String getAutor() {
		return author;
	}
}
