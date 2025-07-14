package inheritance.drinks;

public class Main {

	public static void main(String[] args) {
		// Drink 인스턴스 생성
		Drink coffee = new Drink("커피", 2500, 4);
		Drink tea = new Drink("녹차", 3500, 3);
		
		//Alcohol의 인스턴스 생성
		Alcohol soju = new Alcohol("소주", 4000, 2, 15.1f);
		Alcohol beer = new Alcohol("맥주", 3000, 3, 5.5f);
		
		//매출 전표
		Drink.printTitle(); //클래스 이름으로 직접 접근
		coffee.printData(); //인스턴스 이름으로 직접 접근
		tea.printData();
		
		Alcohol.printTitle();
		soju.printData();
		beer.printData();
		
		//총금액 계산하기
		int total = 0;
		total = coffee.calcPrice() + tea.calcPrice() + soju.calcPrice() +
				beer.calcPrice();
		
		System.out.println("===== 총 합계 금액: " + total + "원 =====");

	}

}
