package classes.student;

public class StudentTest {

	public static void main(String[] args) {
		// Student 클래스 사용해서 학생 생성
		// 인스턴스(instance) - st1, st2, st3
		Student st1 = new Student(); //기본 생성자로 생성
		Student st2 = new Student(2025102, "신유진", 1); //외부 입력 생성
		Student st3 = new Student(2025103, "김기용", 3);
		
		//멤버 변수에 접근시엔 점(.) 연산자 사용
		//멤버 변수에 직접 접근은 좋지 않음
		st1.studentId = 2025101;
		st1.name = "우영우";
		st1.grade = 2;
		
		System.out.println("***** 학생 정보 *****");
		st1.showInfo();  //메서드 호출
		st2.showInfo();
		st3.showInfo();
		
		System.out.println("***** 인스턴스의 정보 *****");
		//클래스의 이름 - 패키지이름.클래스이름
		System.out.println(st1);
		System.out.println(st2);
		
	}

}
