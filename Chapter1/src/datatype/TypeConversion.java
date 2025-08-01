package datatype;

public class TypeConversion {

	public static void main(String[] args) {
		// 묵시적 형변환(자동 형변환)
		int iNum = 20; //4바이트 정수 자료형
		float fNum = iNum; //4바이트 실수 자료형
		
		System.out.println(iNum); //20
		System.out.println(fNum); //20.0
		
		
		// 명시적 형변환(강제 형변환)
		double dNum = 1.5; //표준 8byte
		float fNum2 = 0.7f; //숫자나 'F' or 'f' 붙임
		
		int iNum2 = (int)dNum; //강제로 크기를 맞춤
		int iNum3 = (int)fNum2;
		int iNum4 = (int)(dNum + fNum2);
		
		System.out.println(iNum2); //1
		System.out.println(iNum3); //0
		System.out.println(iNum4); //2

	}

}
