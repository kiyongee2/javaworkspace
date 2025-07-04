package switch_case;

public class DayOfMonth {

	public static void main(String[] args) {
		// 31일(1, 3, 5, 7, 8, 10, 12), 30일(4, 6, 9, 11), 28일
		
		int month = 7;
		int day = 0;
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		default:
			System.out.println("달이 없습니다.");
			return; //즉시 종료
		}
		System.out.println(month + "월은 " + day + "일까지 있습니다.");
	}
}






