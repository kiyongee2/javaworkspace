package reference.scores;

//학생 클래스 정의
public class Student {
	private int studentId;       //학번
	private String studentName;  //이름
	Subject korean;  //국어 과목, Subject 클래스 참조
	Subject math;    //수학 과목
	
	//생성자
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		korean = new Subject();
		math = new Subject();
	}
	
	//국어 점수 설정
	public void setKoreanSubject(String name, int score) {
		korean.setSubjectName(name);
		korean.setScorePoint(score);
	}
	
	//수학 점수 설정
	public void setMathSubject(String name, int score) {
		math.setSubjectName(name);
		math.setScorePoint(score);
	}
	
	//학생의 정보 출력
	public void showInfo() {
		/*System.out.println(
			"학번: " + studentId +
			"\n이름: " + studentName + 
			"\n" + korean.getSubjectName()  + " 점수: " + 
						korean.getScorePoint() + "점" +
			"\n" + math.getSubjectName() + " 점수: " + 
						math.getScorePoint() + "점");
		System.out.println("------------------------");*/
		
		System.out.printf("학번: %s\n", studentId);
		System.out.printf("이름: %s\n", studentName);
		System.out.printf("%s 점수: %d점\n", korean.getSubjectName(), korean.getScorePoint());
		System.out.printf("%s 점수: %d점\n", math.getSubjectName(), math.getScorePoint());
		System.out.println("------------------------");
	}
}









