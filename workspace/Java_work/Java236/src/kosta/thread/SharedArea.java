package kosta.thread;

public class SharedArea {
	Account account1;
	Account account2;
	
	void transfer(int amount) {
		synchronized (this) {
			account1.withdraw(1000000);
			System.out.println("이몽룡 계좌 : 100만원 인출");
			account2.deposit(1000000);
			System.out.println("성춘향 계좌 : 100만원 입금");
		}
	}
	
	int getTotal() {
		synchronized (this) {
			return account1.getBalance() + account2.getBalance();
		}
	}

}
