package classes.student;

//Student 클래스(자료형) 정의
//클래스의 구성요소 - 멤버 변수, 생성자, 멤버 메서드
public class Student {
	//멤버 변수
	int studentId;  //학번
	String name;    //이름
	int grade;      //학년
	
	Student(){}    //기본 생성자(컴파일러가 자동으로 명시함)
	
	//매개변수를 가진 생성자
	Student(int _id, String _name, int _grade){
		studentId = _id;
		name = _name;
		grade = _grade;
	}
	
	//멤버 메서드(함수) 
	void showInfo() { //학생 정보 출력 함수
		System.out.println("학번: " + studentId); 
		System.out.println("이름: " + name);
		System.out.println("학년: " + grade);
	}
}
