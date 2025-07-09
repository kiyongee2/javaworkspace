package static_class.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// 날짜와 시간을 표시하는 Date 클래스 사용
		Date today = new Date();
		System.out.println(today); //오늘 날짜와 시간
		
		//날짜 포맷 설정(연도[4]-월[2]-일[2])
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(date.format(today));
		
		//시간 포맷 설정(12시각제 - hh, 24시각제 - HH, a-오전/오후)
		SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss a");
		System.out.println(time.format(today));
	}
}
