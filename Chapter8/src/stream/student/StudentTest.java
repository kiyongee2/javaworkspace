package stream.student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentTest {

	public static void main(String[] args) {
		// Arrays, Stream 클래스
		// 학생 생성
		List<Student> list = Arrays.asList(
			new Student("콩쥐", 90),
			new Student("팥쥐", 70),
			new Student("심청", 80)	
		);
		
		//전체 요소 출력 - 스트림 얻기
		Stream<Student> stream = list.stream();
		stream.forEach(std -> {
			//System.out.println(std.getName() + ":" + std.getScore());
			String name = std.getName();
			int score = std.getScore();
			System.out.println(name + ":" + score);
		});
		
		//학생 이름만 출력
		//stream() 한번 사용하면 소모되므로 다시 생성함
		stream = list.stream();
		stream.map(std -> std.getName()) //중간 연산
		      .forEach(s -> System.out.println(s)); //최종 연산
		
		//점수가 90이상인 학생 이름
		list.stream().filter(std -> std.getScore() >= 90)
		             .map(std -> std.getName())
		             .forEach(s -> System.out.println(s)); //콩쥐

	}

}








