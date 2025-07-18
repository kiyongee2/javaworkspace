package collection.queue;

import java.util.ArrayList;

//ArrayList를 사용한 Queue 클래스
class MyQueue{
	private ArrayList<String> arrayQueue;
	
	public MyQueue() {
		arrayQueue = new ArrayList<>();
	}
	
	//요소(문자열) 저장 - 맨 뒤에서 저장
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	//요소 꺼내기(맨 앞에서 꺼냄)
	public String deQueue() {
		//큐가 비었을때 처리(요소의 총개수가 0)
		if(arrayQueue.size() == 0) { 
			System.out.println("큐가 비었습니다.");
			return null;
		}
		
		//맨 앞에서 꺼냄(삭제)
		return arrayQueue.remove(0);
	}
}


public class ArrayQueueTest {

	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue();
		
		//문자열 추가( A - B - C ) 
		queue.enQueue("고객 A");
		queue.enQueue("고객 B");
		queue.enQueue("고객 C");
		
		//문자열 꺼내기(삭제) - (A - B - C)
		System.out.println(queue.deQueue()); 
		System.out.println(queue.deQueue()); 
		System.out.println(queue.deQueue()); 
		System.out.println(queue.deQueue()); 

	}

}









