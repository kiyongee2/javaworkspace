package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//컴퓨터 용어 사전 만들기
public class Dictionary {

	public static void main(String[] args) {
		// Map 자료구조의 인스턴스 생성
		// ctrl + shift + O (자동 임포트)
		Map<String, String> dic = new HashMap<>();
		
		// 단어와 정의 저장
		dic.put("이진수", "컴퓨터가 사용하는 0과 1만으로 이루어진 수");
		dic.put("비트", "정보기술에서 데이터의 가장 작은 단위로 0 또는 1의 값을 가진다.");
		dic.put("버그", "프로그램이 적절하게 동작하는데 실패하거나 오류가 발생하는 코드");
		dic.put("알고리즘", "어떤 문제를 해결하기 위해 정해진 절차");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=================================");
		System.out.println("프로그램을 종료하려면 Q또는 q를 입력하세요");
		System.out.println("=================================");
		
		while(true) {
			System.out.print("검색할 단어를 입력하세요: ");
			String word = scan.nextLine(); //단어 입력
			
			//종료 조건 - 대문자 Q를 입력하면 소문자로 변경함
			if(word.toLowerCase().equals("q")) {
				System.out.println("사전 프로그램을 종료합니다.");
				break;
			}
			
			String definition = dic.get(word); //정의된 단어 가져옴
			
			if(definition != null) {
				System.out.println(definition);
			}else {
				System.out.println(word + "는 없는 단어입니다.");
			}
		} //while()
		scan.close();
	}
}






