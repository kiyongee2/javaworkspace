package array2D;

public class ApartmentTest {

	public static void main(String[] args) {
		// 아파트 구조
		int[][] household = new int[5][3]; //5층 3세대
		household[2] = new int[1];  //3층 1세대 
		
		//행의 크기
		System.out.println(household.length); //5
		
		//열의 크기
		System.out.println(household[0].length); //3
		
		//세대수 출력
		System.out.printf("5층 %d세대\n", household[4].length);
		System.out.printf("4층 %d세대\n", household[3].length);
		System.out.printf("3층 %d세대\n", household[2].length); //1세대
		System.out.printf("2층 %d세대\n", household[1].length);
		System.out.printf("1층 %d세대\n", household[0].length);
	}
}
