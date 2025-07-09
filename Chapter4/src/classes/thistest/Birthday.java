package classes.thistest;

//자신의 메모리를 가리키는 this
public class Birthday {
	
	private int year;
	private int month;
	private int day;
	
	//Birthday(){}
	
	//setter
	public void setYear(int year) {
		this.year = year;
	}
	
	//this를 출력하는 메서드
	public void printThis() {
		System.out.println(this);
	}
	
}
