package methods;

public class StaticVar {
	
	static int x = 0;  //정적 변수, 위치 - main() 위에 위치
	
	public static int oneUp() {
		x++;
		return x;
	}

	public static void main(String[] args) {
		/*
		   정적(static) 변수의 유효범위
		   main()함수 내부에서 생성되고, 프로그램이 종료(main()이 종료)되면
		   메모리에서 해제된다.
		   값이 유지되고 공유된다.
		   
		 */
		System.out.println(oneUp()); //1
		System.out.println(oneUp()); //2
		System.out.println(oneUp()); //3
	}

}
