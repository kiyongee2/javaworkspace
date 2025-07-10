package enums;

import java.util.Calendar;

public class WeekTest {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		//System.out.println(cal.getTime());
		//요일 보기
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//System.out.println(week); //5
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		}
		System.out.println("Today is " + today);
	}

}
