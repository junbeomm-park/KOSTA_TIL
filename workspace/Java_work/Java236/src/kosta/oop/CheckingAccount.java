package kosta.oop;

public class CheckingAccount extends Account {
	private String cardNo;
	
	public CheckingAccount() {
		
	}

	
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance); // super()함수 : 부모의 생성자를 호출 => 자식에서 부모로 데이터를 전달
		this.cardNo = cardNo;
	}
	
	public int pay(String cardNo, int amount) throws Exception{
		if(!cardNo.equals(this.cardNo) || getBalance() < amount) {
			throw new Exception("결제 불능");
		}
		return withdraw(amount);
	}


	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	

}
