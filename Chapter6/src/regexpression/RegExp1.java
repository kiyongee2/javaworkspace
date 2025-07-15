package regexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp1 {

	public static void main(String[] args) {
		// 정규 표현식을 사용하여 유효성 검사
		// a+b - a가 1번 이상 반복
		// a*b - a가 0번 이상(허용 범위가 넓음)
		 Pattern pat = Pattern.compile("a*b"); //정규 표현식
		 Matcher mat = pat.matcher("aaab"); //문자열
		 boolean bool =  mat.matches();
		 System.out.println(bool);
		 
		 //숫자만 허용하는 패턴 검사
		 //Pattern.matches(정규표현식, 문자열)
		 String pattern = "^[0-9]+$";
		 String str = "abc103";
	
		 boolean bool2 = Pattern.matches(pattern, str);
		 System.out.println(bool2); //false
		 
		 //한글 이름과 전화번호 패턴 검사
		 String name = "을지문덕장군";
		 String phone = "010-123-5678";
		 
		 //{2,5} - 2자~5자까지임, 띄어쓰기 불가, [ㄱ-ㅣ가-힣] - 자음, 모음 포함
		 // 이클립스 IDE는 \\d{3} - '\' 한개 더 붙임, () - 소괄호(그룹 만듬)
		 boolean name_check = Pattern.matches("^[가-힣]{2,5}$", name);
		 boolean phone_check = Pattern.matches("^010-(\\d{3}|\\d{4})-\\d{4}$", phone);
		 
		 System.out.println(name_check); //false
		 System.out.println(phone_check); //true
		 
		 //사용자 처리 - 한글 이름 유효성(validation) 검사
		 Scanner sc = new Scanner(System.in);
		 System.out.print("한글 이름을 입력하세요: ");
		 String inputName = sc.nextLine(); //사용자 이름 입력
		 if(!Pattern.matches("^[가-힣]{2,5}$", inputName)) { //!는 논리부정
			 System.out.println("올바른 한글 이름이 아닙니다.");
		 }
		 
		 System.out.println("이름: " + inputName);
		 sc.close();
	}
}







