package strings;

public class StringTest {

	public static void main(String[] args) {
		// String 인스턴스 생성
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		//메모리 주소(address)값-숫자 비교 - 힙(heap) 메모리
		System.out.println(str1 == str2); //false
		
		//문자열 값 비교
		System.out.println(str1.equals(str2)); //true
		
		//String의 문자열은 메모리의 상수 풀(pool)에 저장됨
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4); //true
		System.out.println(str3.equals(str4)); //true
	}

}
