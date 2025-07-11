package objects;

public class ToStringEx {

	public static void main(String[] args) {
		// String 인스턴스 생성
		//String name = "홍길동";
		String name = new String("홍길동");
		
		//String의 toString()이 이미 문자열 정보 출력이 재정의 되어 있음
		System.out.println(name); //홍길동
		System.out.println(name.toString());
		
		//Book의 인스턴스 생성
		Book book = new Book(100, "개미");
		System.out.println(book);
		System.out.println(book.toString());

	}

}
