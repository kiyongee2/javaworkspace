package methods;

public class LocalVar {
	
	/* 지역변수의 유효 범위 
	   메서드(함수) 안에서 생성되고 
	   값을 반환후에 블럭을 벗어나면 메모리에서 소멸 */
	
	//어떤 수를 1 증가시키는 메서드
	public static int oneUp() {
		int x = 0;  //지역 변수
		x++;        // x = 1
		return x;
	}

	public static void main(String[] args) {
		// 지역 변수의 유효 범위(scope)
		System.out.println(oneUp()); //호출
		System.out.println(oneUp()); 
		System.out.println(oneUp());
		
		//x는 정의되지 않은 변수이므로 사용할 수 없음
		//System.out.println(x);
	}

}
