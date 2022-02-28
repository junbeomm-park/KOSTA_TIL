package kosta.thread;

public class Account {
	//(상태 : 계좌번호, 계좌주, 잔액 => 변수     기능 : 입금하다. 출금하다. => 메소드)
	
	//멤버 변수 = 필드(객체생성될때, 객체가 소멸) => 멤버 변수는 초기화를 안해줘도 된다
	private String accountNo; //계좌번호
	private String ownerName; //계좌주
	private int balance; //잔액
	
	public Account() {
		
	}
	
	public Account(String accountNo, String ownerName) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
	}
	//생성자 : 객체를 초기화 하기 위해서
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	//기능 구현 => 메소드로 표현
	//입금하다.
	public void deposit(int amount) {
		balance += amount;
	}
	
	//출금하다.
	public int withdraw(int amount) {
		if(balance < amount) {
			return 0;
		}
		balance -= amount;
		
		return amount;
		
	}
	
	//객체의 내용을 출력하는 메소드
	public void print() {
		System.out.println("계좌번호: "+accountNo);
		System.out.println("계좌주: "+ownerName);
		System.out.println("잔액: "+balance);
		System.out.println("=========================");
	
		
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}
	
	

	@Override
	public boolean equals(Object obj) {
//		if(obj instanceof Account) {
//			return this.getOwnerName() == ((Account)obj).getOwnerName();
//		}else { 
//			return false;
//		}
		if(ownerName.equals(((Account)obj).ownerName)){
			return true;
		}else {
			return false;
		}
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	

	
}
