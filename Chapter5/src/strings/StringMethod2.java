package strings;

public class StringMethod2 {

	public static void main(String[] args) {
		// 1. 문자열 잘라내기 
		// substring(시작인덱스, 끝인덱스) -> 시작 ~ 끝인덱스-1
		// substring(시작인덱스) -> 시작 ~ 끝
		String juminNum = "991125-1234567";
		
		String firstNum = juminNum.substring(0, 6);
		System.out.println(firstNum); //991125
		
		String secondNum = juminNum.substring(7); //1234567
		System.out.println(secondNum);
		
		// 2. 문자열 대체하기
		// replace(변경전 문자, 변경후 문자)
		String str1 = "Hello Java!";
		String result1 = str1.replace('a', '@');
		System.out.println(result1); //Hello J@v@!
		
		String str2 = "한국의 수도는 서울이다.";
		String result2 = str2.replace("한국", "대한민국");
		System.out.println(result2);
		
		//특수문자, 공백문자 제거
		String phone = "010-1234-5678";
		String result3 = phone.replace("-", "");
		System.out.println(result3);
		
		// 3. 문자 분리하기 = split(구분기호)
		//    분리된 문자는 배열로 반환됨
		String carts = "potato strawberry garlic";
		String[] array = carts.split(" "); //공백문자로 분리함
		
		System.out.println(array[0]); //potato
		
		//배열 출력
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(); //줄바꿈
		
		String str = "1,2,3,4,5,6,7,8,9";
		String[] array2 = str.split(",");
		
		System.out.println(array2[0]); //1
		
		for(int i = 0; i < array2.length; i++) {
			System.out.print(array2[i]); //123456789
		}
		System.out.println();
		
		/* 실습
		   123
		   456 
		   789
		 */
		for(int i = 0; i < array2.length; i++) {
			System.out.print(array2[i]); //123456789
			if((i + 1) % 3 == 0)
				System.out.println();
		}
		
	}

}








