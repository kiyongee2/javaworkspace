package classes.thistest;

class Person{
	private String name;
	private int age;
	
	public Person() {
		this("이름 없음", 1);
	} //기본 생성자
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	//this를 반환하는 메서드
	public Person returnSelf() {
		return this;
	}

}

//다른 생성자를 호출하는 생성자 사용
//파일 이름앞에는 public이 있음
public class CallAnotherCons {

	public static void main(String[] args) {
		// 기본 생성자로 생성
		Person noName = new Person();
		Person lee = new Person("이정우", 26);
		
		//정보 출력
		System.out.println(noName.getName());
		System.out.println(noName.getAge());
		
		System.out.println(lee.getName());
		System.out.println(lee.getAge());
		
		Person p1 = noName.returnSelf();
		System.out.println(p1); //this의 정보
		System.out.println(noName); //인스턴스 noName의 정보
		
	}

}
