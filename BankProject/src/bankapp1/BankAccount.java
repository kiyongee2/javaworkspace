package bankapp1;

//은행 계좌 클래스
public class BankAccount {
	private String accountNumber; //계좌 번호
	private String owner;         //계좌주
	private int balance;          //잔고
	Transaction[] transactions;   //거래
	
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
		}
	}
	
	
	//거래 추가
	
	
	
	
	
	
}
