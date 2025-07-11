package bankapp1;

//은행 계좌 클래스
public class BankAccount {
	private String accountNumber; //계좌 번호
	private String owner;         //계좌주
	private int balance;          //잔고
	Transaction[] transactions;   //거래(참조 자료형)
	
	//생성자
	public BankAccount(String accountNumber, String owner, int balance) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
		transactions = new Transaction[100];
	}
	
	//입금
	public void deposit(int amount) {
		if(amount <= 0) {
			System.out.println("유효한 금액을 입력하세요.");
		}else {
			this.balance += amount;
			System.out.println(amount + "원이 입금되었습니다. 현재 잔액: " + 
					this.balance + "원");
			
			//거래 추가 - 입금
			addTransaction(TransactionType.입금, amount);
		}
	}
	
	//출금
	public void withdraw(int amount) {
		if(amount <= 0) {
			System.out.println("유효한 금액을 입력하세요.");
		}else if(amount > this.balance) {
			System.out.println("잔액이 부족합니다!!");
		}else {
			this.balance -= amount;
			System.out.println(amount + "원이 출금되었습니다. 현재 잔액: " + 
					this.balance + "원");
			
			//거래 추가 - 출금
			addTransaction(TransactionType.출금, amount);
		}
	}
	
	//거래 추가
	public void addTransaction(TransactionType type, int amount) {
		//트랜잭션 인스턴스(1개) 트랜잭션 배열에 저장
		for(int i = 0; i < transactions.length; i++) {
			//비어 있는 공간에 저장(채워져 있지 않은)
			if(transactions[i] == null) {
				transactions[i] = new Transaction(type, amount);
				break; //인스턴스 저장후 즉시 빠져나옴
			}
		}
	}
	
	//거래 내역 추가
	public void getTransactionHistory() {
		//토글(toggle) 변수 - 2가지 상태(변화)
		boolean hasTransaction = false;
		for(int i = 0; i < transactions.length; i++) {
			//널(null)이 아닐때 출력
			if(transactions[i] != null) {
				hasTransaction = true;
				//조건 연산 방식
				System.out.print(" |" + (transactions[i].type == TransactionType.입금 ? 
						"입금" : "출금"));
				System.out.println("| " + transactions[i].amount + "원");
			}
		}
		
		if(!hasTransaction) {//for문 안에 있으면 null인 경우 계속 반복되므로 for 밖에 위치 시킴.
			System.out.println("거래 내역이 없습니다.");
		}
	}
	
	//계좌 정보 출력
	public void displayInfo() {
		System.out.println("계좌 정보");
		System.out.println("   계좌 번호: " + accountNumber);
		System.out.println("   계좌주: " + owner);
		System.out.println("   잔고: " + balance);
	}
}









