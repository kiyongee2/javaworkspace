package datatype;

public class NumberType {

	public static void main(String[] args) {
		/* 자료형의 범위
		   데이터의 용량 - 바이트(byte)
		   숫자 3, 영문자 - 1byte(8bit)
		   1bit - 0, 1
		   byte - 8bit - 2의8승 - 256
		*/ 
		//8bit -> -128 ~ 127
		byte bData1 = 127; 
		//byte bData2 = 128; //오버플로우로 인한 오류 발생
		System.out.println(bData1); //127
		
		//int - 4byte(32비트) - 2의32승(-21억 ~ 21억)
		int money = 2000000000;
		System.out.println(money);
		
		//long - 8byte(64비트) - 2의64승
		//범위 벗어남(오버플로우) 방지하려면 적절한 자료형 사용
		long money2 = 3000000000L; //'L' or 'l'
		System.out.println(money2);

	}

}
