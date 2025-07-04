package repeatitions;

public class ForEx2 {

	public static void main(String[] args) {
		// 1 ~ 10중 홀수 만 출력
		int i;
		for(i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// 1 ~ 20 중 3의 배수를 출력, 3의 배수의 개수
		int count = 0;  //개수 저장
		for(i = 1; i <= 20; i++) {
			if(i % 3 == 0) {
				System.out.print(i + " "); //3,6,9,12,15,18
				count++; //count = count + 1; //1,2,3,4,5,6
			}
		}
		System.out.println("3의 배수의 개수: " + count);

	}

}
