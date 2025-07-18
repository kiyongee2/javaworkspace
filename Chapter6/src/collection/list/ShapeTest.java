package collection.list;

import java.util.ArrayList;

class Shape{
	
	public void draw() {
		System.out.println("도형");
	}
}

class Circle extends Shape{
	
	@Override
	public void draw() {
		System.out.println("원");
	}
}

class Triangle extends Shape{

	@Override
	public void draw() {
		System.out.println("삼각형");
	}
	
}


public class ShapeTest {

	public static void main(String[] args) {
		//Shape 인스턴스를 저장할 자료구조인 list 생성
		ArrayList<Shape> list = new ArrayList<>();
		
		list.add(new Shape());
		list.add(new Circle());
		list.add(new Triangle());
		
		for(Shape s : list)
			s.draw();
	}

}
