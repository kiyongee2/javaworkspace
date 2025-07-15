package wrapper;

public class TypeSize {

	public static void main(String[] args) {
		// 자료형의 크기 확인(복제 - alt + ctrl + 화살키(아래))
		// 기본 자료형(byte, int, float 등)
		// Wrapper 클래스(Byte, Integer, Double) - java.lang 패키지 소속
		System.out.printf("byte형의 크기  ===> %dbit\n", Byte.SIZE);  //8(1byte)
		System.out.printf("short형의 크기 ===> %dbit\n", Short.SIZE); //16(2byte)
		System.out.printf("int형의 크기   ===> %dbit\n", Integer.SIZE); //32(4byte)
		System.out.printf("long형의 크기  ===> %dbit\n", Long.SIZE); //64(8byte)
		System.out.printf("float형의 크기 ===> %dbit\n", Float.SIZE); //32
		System.out.printf("double형의 크기===> %dbit\n", Double.SIZE); //64
		System.out.printf("char형의 크기===>   %dbit\n", Character.SIZE); //16
	}

}
