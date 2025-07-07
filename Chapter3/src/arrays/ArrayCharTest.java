package arrays;

public class ArrayCharTest {

	public static void main(String[] args) {
		// 알파벳 대문자 저장할 배열 생성
		char[] alphabets = new char[26];
		char ch = 'A';  //코드값 - 65
		
		/*ch = (char)(ch + 1);
		System.out.println(ch); //B
		System.out.println((int)ch); //66
		
		ch++; //ch = ch + 1
		System.out.println(ch); //C
		System.out.println((int)ch); //67*/
		
		//배열에 저장
		for(int i = 0; i < alphabets.length; i++) {
			alphabets[i] = ch;
			ch++;
		}
		
		for(int i = 0; i < alphabets.length; i++) {
			System.out.println(alphabets[i] + ", " + (int)alphabets[i]);
		}
		
		//배열 복사하기
		int[] arr1 = {10, 20, 30, 40}; //배열의 선언과 동시에 초기화
		int[] arr2 = new int[4];
		
		//arr1을 arr2에 저장
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		//arr2 출력
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		//거꾸로 복사
		char[] array1 = {'N', 'E', 'T'};
		char[] array2 = new char[3];
		
		//array1을 array2에 복사
		for(int i = 0; i < array1.length; i++) {
			array2[i] = array1[2-i];
		}
		
		//array2를 출력
		for(int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + "");
		}
	}
}










