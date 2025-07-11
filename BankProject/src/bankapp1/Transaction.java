package bankapp1;

//트랜잭선 클래스
//작업 단위의 수행 완료(송금 -> 입금)
public class Transaction {
	TransactionType type;  //거래 유형 - enum 자료형 참조
	int amount;     //거래 금액
	
	public Transaction(TransactionType type, int amount) {
		this.type = type;
		this.amount = amount;
	}
}
