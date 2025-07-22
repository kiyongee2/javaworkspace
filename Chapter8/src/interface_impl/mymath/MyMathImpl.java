package interface_impl.mymath;

//MaMath 인터페이스를 구현한 클래스
public class MyMathImpl implements MyMath{

	@Override
	public int myAbs(int n) {
		//조건 연산자를 사용한 절대값 계산
		int value = (n < 0) ? -n : n;
		return value;
	}

}
