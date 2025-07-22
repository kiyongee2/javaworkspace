package lambda.mymath;

@FunctionalInterface  //함수형 인터페이스 애너테이션
public interface MyMath {

	//추상 메서드 1개 밖에 사용 못함
	public int myAbs(int n);
	
	//public int myPow(int x, int y);
}
