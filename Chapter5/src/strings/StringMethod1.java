package strings;

public class StringMethod1 {

	public static void main(String[] args) {
		// chartAt(인덱스 번호) - 인덱스의 문자 추출
		String msg = "행운을 빌어요!";
		
		//인덱스 검색
		char ch = msg.charAt(4);
		System.out.println(ch);  //빌
		
		//주민등록번호에서 남여 구분
		String jumin = "020815-4234567";
		char gender = jumin.charAt(7);
		
		//System.out.println(gender); //'4'
		
		switch(gender) {
		case '1': case '3':
			System.out.println("남자입니다.");
			break;
		case '2': case '4':
			System.out.println("여자입니다.");
			break;
		default:
			System.out.println("지원되지 않는 기능입니다.");
			break;
		}
		
		/*
		    검색 : indexOf(문자) - 문자의 위치를 시작 인덱스로 반환
		          문자를 찾지 못하면 -1을 반환함
		 */
		String subject = "자바 프로그래밍 입문";
		int location1 = subject.indexOf("프로그래밍");
		System.out.println(location1); //3
		
		int location2 = subject.indexOf("코딩");
		System.out.println(location2); //-1
		
		//문자열 검색 응용 예제
		if(subject.indexOf("자바") != -1) { //0번에서 칮음
			System.out.println("자바와 관련된 책이군요!!");
		}else {
			System.out.println("자바와 관련이 없는 책이군요!!");
		}
	}

}












