package reference.scores;

//과목 클래스 정의
public class Subject {
	private String subjectName;  //과목 이름
	private int scorePoint;      //점수
	
	//public Subject() {}
	
	//과목명 설정 - setter
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	//과목명 반환(가져오기)
	public String getSubjectName() {
		return subjectName;
	}
	
	//점수 설정
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	
	//점수 가져오기
	public int getScorePoint() {
		return scorePoint;
	}
	
}
