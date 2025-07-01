package variable;

public class Variable {

	public static void main(String[] args) {
		// 변수 선언(생성) - 자료형 변수이름
		/*int num;
		num = 11;  //값 저장(초기화)
		
		System.out.println(num);
		
		double num2;  //실수 자료형 변수이름
		num2 = 2.54;
		
		System.out.println(num2);*/
		
		//이정우는 1학년 5반입니다.
		String name = "이정우";
		int grade = 1;
		//int class = 5;  //예약어(이미 자바에서 쓰는 명령어)는 사용불가
		int schoolClass = 5;
		
		//'+' - 연결 연산자
		System.out.println("이름: " + name); 
		System.out.println("학년: " + grade);
		System.out.println("반: " + schoolClass);
		
		/*변수이름 만드는 규칙
		  1. 단어가 합쳐지면 두번째 단어의 첫글자는 대문자(카멜 표기법)
		  2. 예약어는 사용 불가 - if, for, class
		  3. 숫자로 시작 불가
		  4. 공백은 사용 불가
		*/
		
		//int 3grade;
		//String n ame;
		
	}
}





