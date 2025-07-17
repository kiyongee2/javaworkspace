package interfaces.calculator;

//MyCalculator는 Calculator 인터페이스를 구현한 클래스임
public class MyCalculator implements Calculator{

	@Override
	public int add(int n1, int n2) {
		return n1 + n2;
	}

	@Override
	public int subtract(int n1, int n2) {
		return n1 - n2;
	}

	@Override
	public int times(int n1, int n2) {
		return n1 * n2;
	}

	@Override
	public int divide(int n1, int n2) {
		if(n2 == 0) {
			//에러(예외) 발생 시키기
			throw new ArithmeticException("0으로 나눌 수 없습니다.");
		}
		return n1 / n2;
	}

}







