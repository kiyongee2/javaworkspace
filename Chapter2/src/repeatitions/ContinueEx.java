package repeatitions;

public class ContinueEx {

	public static void main(String[] args) {
		// cotinue문 - 이후 반복되는 부분을 수행하지 않고, 위로 올라가서
		// 조건식이나 증감문을 수행함
		
		//1 ~ 10중 4와 8을 제외한 수 출력
		for(int i = 1; i <= 10; i++) {
			if(i == 4 || i == 8)
				continue;
			System.out.println(i);
		}
		System.out.println();
		
		//1 ~ 10중 홀수 만 출력
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0)
				continue;
			System.out.print(i + " ");
		}

	}

}
