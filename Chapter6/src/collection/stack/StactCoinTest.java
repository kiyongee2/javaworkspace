package collection.stack;

import java.util.Stack;

public class StactCoinTest {

	public static void main(String[] args) {
		
		Stack<Coin> coinBox = new Stack<>();
		
		//동전 객체 생성
		Coin coin500 = new Coin(500);
		Coin coin100 = new Coin(100);
		Coin coin50 = new Coin(50);
		Coin coin10 = new Coin(10);
		
		//스택에 동전 넣기(500 - 100 - 50 - 10)
		coinBox.push(coin500);  //push() - 저장
		coinBox.push(coin100);
		coinBox.push(coin50);
		coinBox.push(coin10);
		
		//스택에서 동전 꺼내기(10 - 50 - 100 - 500)
		while(!coinBox.isEmpty()) { //스택이 비어있지 않은 동안
			Coin coin = coinBox.pop(); //pop() - 삭제
			System.out.println("꺼내온 동전: " + coin.getValue() + "원");
		}

	}

}
