package reference.scores;

public class Main {

	public static void main(String[] args) {
		// Student의 인스턴스 생성
		Student st1 = new Student(2025101, "이강");
		Student st2 = new Student(2025102, "김산");
		
		//과목 설정
		st1.setKoreanSubject("국어", 85);
		st1.setMathSubject("수학", 80);
		st2.setKoreanSubject("국어", 90);
		st2.setMathSubject("수학", 87);
		
		//정보 출력
		st1.showInfo();
		st2.showInfo();

	}

}
