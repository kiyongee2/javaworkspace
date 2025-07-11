package reference.scores2;

import reference.scores.Subject;

public class Student {
	private int studentId;      //학번
	private String studentName; //이름
	private Subject[] subjects; //과목을 저장할 배열
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjects = new Subject[10];
	}
	
	//과목 추가
	public void addSubject(String name, int score) {
		/*//과목 인스턴스 1개 생성 
		Subject subject = new Subject();
		subject.setSubjectName(name);
		subject.setScorePoint(score);
		
		//인스턴스 -> 배열에 저장
		for(int i = 0; i < subjects.length; i++) {
			if(subjects[i] == null) {
				subjects[i] = subject;
				break; //과목 저장후 즉시 빠져나옴
			}
		}*/
		
		for(int i = 0; i < subjects.length; i++) {
			if(subjects[i] == null) {
				subjects[i] = new Subject(name, score);
				break; //과목 저장후 즉시 빠져나옴
			}
		}
	}
	
	//학생 정보 출력
	public void displayInfo() {
		//성적 통계 - 평균 계산
		int total = 0;  //총점
		double avg;     //평균
		int count = 0;  //개수
		
		System.out.printf("학번: %d\n", studentId);
		System.out.printf("이름: %s\n", studentName);
		
		for(int i = 0; i < subjects.length; i++) {
			if(subjects[i] != null) { //10개의 공간에서 채워져있는 과목을 출력
				count++;  //순회할때 1 증가
				total += subjects[i].getScorePoint();  //점수 가져와서 더하기
				
				System.out.printf("%s 점수: %d점\n", subjects[i].getSubjectName(), 
					subjects[i].getScorePoint());
			}
		}
		//평균 계산
		avg = (double)total / count;  //명시적 형변환(cast)
		System.out.printf("평균 점수: %.1f점\n", avg);
		
		System.out.println("---------------------------");
	}
}











