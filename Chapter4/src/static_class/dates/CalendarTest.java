package static_class.dates;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// Calendar 인스턴스 생성
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal);
		System.out.println(cal.getTime()); //현재 시스템의 날짜와 시간
		
		//날짜 - 년, 월, 일
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = cal.get(Calendar.MONTH) + 1; //0이 1월이므로 1 더함
		System.out.println(month);
		
		int date = cal.get(Calendar.DATE);
		System.out.println(date);
		//날짜 출력
		System.out.println(year + "년 " + month + "월 " + date + "일");
		
		//시간 - 시, 분, 초
		int hour = cal.get(Calendar.HOUR);
		System.out.println(hour);
		
		int minute = cal.get(Calendar.MINUTE);
		System.out.println(minute);
		
		int second = cal.get(Calendar.SECOND);
		System.out.println(second);
		//시간 출력
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
		
		//요일 - (1:일, 2:월, 3:화, 4:수, 5:목, 6:금, 7:토)
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		
		//요일 저장할 배열 생성
		String[] days = new String[] {"일", "월", "화", "수", "목", "금", "토"};
		//System.out.println(days[0]); //일
		//System.out.println(days[3]);
		
		System.out.println("오늘은 " + days[day-1] + "요일입니다.");
		
		//날짜 설정
		Calendar theDay = Calendar.getInstance();
		
		theDay.set(2025, 6, 1);  //2025. 7. 1 설정시 6월로 함
		System.out.println(theDay.getTime());

	}

}









