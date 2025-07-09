package classes.thistest;

public class BirthdayTest {

	public static void main(String[] args) {
		// Birthday의 인스턴스 생성
		Birthday bDay = new Birthday();
		
		//연도 입력
		bDay.setYear(2025);
		
		//출력
		bDay.printThis(); //this 출력
		System.out.println(bDay); //인스턴의 정보
	}

}
