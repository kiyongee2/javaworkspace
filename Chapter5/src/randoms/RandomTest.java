package randoms;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// Random 클래스 - nextInt() : 정수형 랜덤하게 추출
		Random rand = new Random();
		//시드 배정 - 한 번만 랜덤 추출
		//rand.setSeed(0);
		 
		//System.out.println(rand.nextInt()); 
		
		//nextInt(n) - n 미만 정수가 랜덤 추출
		int n1 = rand.nextInt(2);
		System.out.println(n1);
		
//		int n2 = (int)(Math.random() * 2);
//		System.out.println(n2);
		
		//동전 던지기(1-앞면, 2-뒷면)
		int coin = rand.nextInt(2) + 1;
		System.out.println(coin);
		if(coin == 1) {
			System.out.println("앞면");
		}
		else {
			System.out.println("뒷면");
		}
		
		//주사위 10번 던지기
		for(int i = 1; i <= 10; i++) {
			int dice = rand.nextInt(10) + 1;
			System.out.println(dice);
		}
		
		//문자열 자르기 -> 단어를 랜덤하게 추출
		String season = "봄 여름 가을 겨울";
		String[] seasons = season.split(" ");
		
		//System.out.println(seasons[1]); //여름
		System.out.println("배열의 길이: " + seasons.length); //4
		
		int rndIdx = rand.nextInt(seasons.length); //0 ~ 3
		System.out.println(rndIdx);
		System.out.println(seasons[rndIdx]);
		
		//가위 바위 보 추출
		String str = "가위 바위 보";
		String[] result = str.split(" ");
		
		int idx = rand.nextInt(result.length);
		System.out.println(result[idx]);

	}

}









