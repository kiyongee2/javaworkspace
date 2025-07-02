package choices;

public class IfEx1 {

	public static void main(String[] args) {
		/*
		   if(조건식){실행문} - 조건식이 참일때 실행
		   if(조건식){실행문A} else{실행문B}
		     조건식이 참이면 실행문A, 거짓이면 실행문B
		*/
		
		//조건 : 나이가 15세 이상이면 "관람가 등급"
		int age = 13;
		if(age >= 15) {
			System.out.println("관람가 등급");
		}
		else {
			System.out.println("관람불가 등급");
		}
		System.out.println("나이는 " + age + "세 입니다.");
	}

}
