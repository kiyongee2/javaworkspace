package datatype;

public class CharStringType {

	public static void main(String[] args) {
		
		System.out.println("***** 문자 자료형 *****");
		
		//문자 자료형 - 2byte(16bit) - 2의 16승, 범위: -32000 ~ 32000
		//아스키 코드: 128개 -> 영대-26, 영소-26, 숫자-10, 특수-33, 제어-33
		//7bit - 2의7승
		char ch1 = 'A';
		System.out.println(ch1);  //A
		System.out.println((int)ch1); //65, 형변환
		
		char ch2 = 66;
		System.out.println(ch2); //B
		
		char kor1 = '가';
		System.out.println(kor1); //가
		
		//유니코드 - 2의16승 - 16비트
		char kor2 = '\uAC00'; //유니코드
		System.out.println(kor2); //가
		
		System.out.println("***** 문자열 자료형 *****");
		String jdk = "jdk";
		String version = "21";
		String java = jdk + version;
		
		System.out.println(java);
		
		//연산
		System.out.println(20 + 21); //41
		System.out.println(20 + "21"); //2021
		
		String kor3 = "가"; //한 문자여도 String형 이므로 쌍따옴표 사용함
		
		String cart = "라면";
		System.out.println(cart);
		
		//배열 - 여러 개의 자료를 저장할 때 사용
		String[] carts = {"라면", "빵", "초코파이"};
		System.out.println(carts[2]);  //초코파이
	}

}









