package operator;

public class CalcOperator {

	public static void main(String[] args) {
		// 산술 연산자 - +, -, *, /, %
		System.out.println("***** 산술 연산 *****");
		int n1 = 4;
		int n2 = 7;
		
		System.out.println(n1 + n2);  //11
		System.out.println(n1 - n2);  //-3
		System.out.println(n1 * n2);  //28
		System.out.println(n1 / n2);  //0(몫)
		System.out.println((float)n1 / n2);  //0.5714286(나누기)
		System.out.printf("%.2f\n", (float)n1 / n2); //0.57
		System.out.println(n1 % n2);  //4
		
		//printf() 포맷 : %d- 정수, %f - 실수, %s - 문자
		
		System.out.println("***** 증감 연산 *****");
		int a = 99;
		
		a++; //a = a + 1;
		System.out.println(a); //100
		
		a++;
		System.out.println(a); //101
		
		a--;  // a = a - 1
		System.out.println(a); //100
		
		a--;
		System.out.println(a); //99
	}
}




