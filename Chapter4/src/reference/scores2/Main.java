package reference.scores2;

public class Main {

	public static void main(String[] args) {
		// Student의 인스턴스 생성
		Student lee = new Student(2025101, "이산");
		
		//과목 추가
		lee.addSubject("국어", 90);
		lee.addSubject("Java", 95);
		
		//정보 출력
		lee.displayInfo();
	}

}
