package kosta.oop2;

public class MinusAccount extends Account {
	private int creditLine; //마이너스 한도
	
	public MinusAccount() {
		
	}

	public MinusAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}

	//Account 에 있는 withdraw 메소드는 적합 하지 않아
	//MinusAccount 클래스에서 재정의
	//=> 메소드 오버라이딩 : 부모의 메소드의 시그니쳐 일치(리턴형, 메소드이름, 파라미터(갯수, 데이터형), 예외관련)
	@Override
	public int withdraw(int amount) throws Exception {
		if(getBalance() + creditLine < amount) {
			throw new Exception("잔액 부족");
		}
		
		int balance = getBalance();
		setBalance(balance - amount);
		
		return amount;
	}
	
	
}
