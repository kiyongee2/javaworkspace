package bankapp1;

public class Main {

	public static void main(String[] args) {
		// 계좌 3개 생성
		BankAccount[] accounts = new BankAccount[3];
		
		//계좌 인스턴스 생성
		accounts[0] = new BankAccount("101-1234", "허준", 10000);
		accounts[1] = new BankAccount("102-1234", "장영실", 30000);
		accounts[2] = new BankAccount("103-1234", "한강", 20000);
		
		//입금
		accounts[0].deposit(5000);
		accounts[1].deposit(10000);
		
		//출금
		accounts[1].withdraw(20000);
		accounts[1].withdraw(50000); //잔액 초과
		
		//계좌 정보 출력
		for(int i = 0; i < accounts.length; i++) {
			accounts[i].displayInfo();
			accounts[i].getTransactionHistory();
		}

	}

}
