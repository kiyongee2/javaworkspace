package interface_impl.concat;

public class StringConcatTest {

	public static void main(String[] args) {
		//객체 지향 방식으로 인터페이스 테스트
		String str1 = "Hill";
		String str2 = "State";
		
		StringConcatImpl concat = new StringConcatImpl();
		concat.makeString(str1, str2);

	}

}
