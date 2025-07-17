package interfaces.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		
		try {
			MyCalculator calc = new MyCalculator();
			int num1 = 10, num2 = 0;
			
			System.out.println(calc.add(num1, num2));
			System.out.println(calc.subtract(num1, num2));
			System.out.println(calc.times(num1, num2));
			System.out.println(calc.divide(num1, num2));
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
