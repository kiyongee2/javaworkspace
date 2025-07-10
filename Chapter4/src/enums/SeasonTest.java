package enums;

public class SeasonTest {

	public static void main(String[] args) {
		// Season의 인스턴스 생성
		Season season = null;  //객체를 초기화 - null
		
		season = Season.여름;
		//System.out.println(season); //여름
		
		switch(season) {
		case 봄:
			season = Season.봄;
			break;
		case 여름:
			season = Season.여름;
			break;
		case 가을:
			season = Season.가을;
			break;
		case 겨울:
			season = Season.겨울;
			break;
		default:
			System.out.println("계절이 없습니다.");
			break;
		}
		System.out.println("현재 계절은 " + season + "입니다.");
		
		if(season == Season.여름) {
			System.out.println("무더위와 장마가 옵니다.");
		}else {
			System.out.println("무더위와 장마가 별로 없습니다.");
		}
	}

}
