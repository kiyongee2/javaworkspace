package built_in_methods;

public class MathTest {

	public static void main(String[] args) {
		// Math 클래스의 주요 메서드
		// Math는 메서드에 직접 접근 - java.lang 패키지는 임포트하지 않음
		
		int v1 = Math.abs(-10); //절대값
		System.out.println(v1); //10
		
		long v2 = Math.round(5.6); //반올림
		System.out.println(v2);  //6
		
		double v3 = Math.floor(5.6); //내림(버림)
		System.out.println(v3); //5.0
		
		int v4 = (int)Math.floor(5.6); //강제 형변환
		System.out.println(v4); //5
		
		// 0.0 <= rand < 1.0
		double rand = Math.random(); //난수 값(random)
		System.out.println(rand);
		
		//동전 - 앞면(0), 뒷면(1)
		int coin = (int)(Math.random() * 2);  //0 ~ 1
		//System.out.println(coin);
		
		if(coin == 0) {
			System.out.println("앞면");
		}
		else {
			System.out.println("뒷면");
		}
		
		//주사위 던지기
		int dice = (int)(Math.random() * 6 + 1); //1 ~ 6
//		System.out.println(dice);
		
		//주사위 10번 던지기
		for(int i = 1; i <= 10; i++) {
			dice = (int)(Math.random() * 6 + 1);
			System.out.println(dice);
		}
		
		//배열에서 문차 추출하기
		String[] word = {"나", "너", "우리", "세계"};
		
		/*System.out.println(word[0]); //나
		System.out.println(word[3]); //세계*/
		
		//System.out.println("배열의 크기: " + word.length); //4
		
		int rndIdx = (int)(Math.random() * word.length); //0 ~ 3
		System.out.println(word[rndIdx]);
	}

}





