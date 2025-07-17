package exceptions;

//다중 예외 처리
public class MultiException {
	
	public static void main(String[] args) {
		
		String[] array = {"100", "123a"};
		
		//int value1 = Integer.parseInt(array[0]);
		//int value2 = Integer.parseInt(array[1]);
		
		//System.out.println(value1);
		//System.out.println(value2); //NumberFormatException(숫자 변환 오류)
		
		for(int i = 0; i <= array.length; i++) {
			try {
				System.out.println(array[i]); //ArrayIndexOutOfBoundsException(배열 범위 초과 오류)
				int value = Integer.parseInt(array[i]);
				System.out.println(value);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 범위를 초과했습니다.");
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없는 항목이 있습니다.");
			}
		}
	}
}
