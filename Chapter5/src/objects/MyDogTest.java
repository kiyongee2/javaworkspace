package objects;

class MyDog{
	String name;
	String type;
	
	MyDog(String name, String type){
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return type + " " + name;
	}

}

public class MyDogTest {

	public static void main(String[] args) {
		
		MyDog dog = new MyDog("백구", "진돗개");
		System.out.println(dog);

	}

}
