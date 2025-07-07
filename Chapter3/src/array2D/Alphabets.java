package array2D;

public class Alphabets {

	public static void main(String[] args) {
		// 알파벳 대문자를 저장할 이차원 배열 생성
		char[][] alphabets = new char[13][2];
		char ch = 'A';
		
		//ch = (char)(ch + 1); //코드값 66
		//ch++;
		//System.out.println(ch); //B
		
		//알파벳 저장
		for(int i = 0; i < alphabets.length; i++) {
			for(int j = 0; j < alphabets[i].length; j++) {
				alphabets[i][j] = ch;
				ch++;
			}
		}
		
		//출력
		for(int i = 0; i < alphabets.length; i++) {
			for(int j = 0; j < alphabets[i].length; j++) {
				System.out.print(alphabets[i][j] + " ");
			}
			System.out.println();
		}

	}

}
