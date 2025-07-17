package abstracts.animal;

//abstract는 추상 클래스이다 - 통일성(공통성)을 위해서 추상으로 만듬
public abstract class Animal {

	String kind;  //종
	
	void breathe() {
		System.out.println("동물은 숨을 쉽니다.");
	}
	
	//추상 메서드 선언 - 선언부만 있고 구현부는 없음
	public abstract void cry();
}
