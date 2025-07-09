package operator;

public class LogicOperator {

	public static void main(String[] args) {
		// 비교 연산 결과값 - boolean : true / false
		System.out.println("***** 비교 연산 *****");
		int n1 = 10;
		int n2 = 20;
		
		System.out.println(n1 >= n2); //false
		System.out.println(n1 <= n2); //true
		System.out.println(n1 == n2); //false
		System.out.println(n1 != n2); //true
		
		// 논리 연산 - &&(논리곱), ||(논리합), !(부정)
		/*
		    true && true -> true(두 조건이 모두 참인 경우 참)
		    true && false -> false
		    false && true -> false
		    false && false -> false
		    ------------------------
		    true || true -> true(두 조건중 하나만 참이도 참)
		    true || false -> true
		    false || true -> true
		    false || false -> false
		    ------------------------
		    !true -> false
		    !false -> true
		 */
		
		System.out.println("***** 논리 연산 *****");
		System.out.println((n1 < n2) && (n1 == n2)); //false
		System.out.println((n1 < n2) || (n1 == n2)); //true
		System.out.println(!(n1 != n2)); //false
		
		System.out.println("***** 조건 연산 *****");
		// 조건식 ? 참 : 거짓  
		int fatherAge = 45;
		int motherAge = 48;
		
		boolean result = (fatherAge > motherAge) ? true : false;
		System.out.println(result);  //false
		
		char result2 = (fatherAge > motherAge) ? 'T' : 'F';
		System.out.println(result2); //F
	}
	

}




