package choices;

public class IfEx2 {

	public static void main(String[] args) {
		// 숫자 - 동등 비교
		// 문자가 같은 지 비교
		
		int n1 = 100;
		int n2 = 120;
		
		if(n1 == n2) {
			System.out.println("두 수가 일치합니다.");
		}
		else { // n1 != n2
			System.out.println("두 수가 일치하지 않습니다.");
		}
		
		//문자 비교 - equals() 사용
		String str1 = "apple";
		String str2 = "banana";
		
		System.out.println(str1.equals(str2)); //false
		
		if(str1.equals(str2)) {
			System.out.println("두 단어가 일치합니다.");
		}
		else {
			System.out.println("두 단어가 일치하지 않습니다.");
		}
	}

}









