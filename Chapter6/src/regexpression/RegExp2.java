package regexpression;

public class RegExp2 {

	public static void main(String[] args) {
		// 비빌번호 보안 처리
		String password = "P@ssw0rd!";
		
		//replaceAll(정규표현식, 대체할 문자)
		//^ - 부정(~ 아니다)
		String masked = password.replaceAll("[^a-zA-Z0-9]", "*");
		System.out.println(masked); //P*ssw0rd*
		
		// 게시글 금칙어 처리
		String text = "안녕@하세요! #스팸";
		//한글과 공백 만 허용
		String filterd = text.replaceAll("[^ㄱ-힣\\s]", "*");
		System.out.println(filterd); //안녕*하세요* *스팸
		
		//실습 예제
		String str = "THANK!@YOU%/";
		String result = str.replaceAll("[^ㄱ-힣a-zA-Z]", "*");
		System.out.println(result); //THANK**YOU**
	}

}






