package objects;

//Object 클래스는 모든 클래스의 부모(생략 가능)
public class Book extends Object{
	int bookNumber;   //책 번호
	String bookTitle; //책 제목
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	//객체의 문자열 정보를 출력하는 메서드(재정의)
	@Override
	public String toString() {
		return bookNumber + ", " + bookTitle;
	}
	
//	String showInfo() {
//		return bookNumber + ", " + bookTitle;
//	}
	
	
	
	
}
