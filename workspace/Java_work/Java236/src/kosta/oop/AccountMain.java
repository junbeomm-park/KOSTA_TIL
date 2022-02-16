package kosta.oop;

public class AccountMain {
	
	public static void main(String[] args) {
		int arr[];
		
		//계좌번호, 계좌주, 잔액, 카드번호
		new CheckingAccount();
		//CheckingAccount ca = new CheckingAccount("1111-1111", "홍길동", 5000, "222-222");
		Account ca = new CheckingAccount("1111-1111", "홍길동", 5000, "222-222");

		try {
			CheckingAccount ca2 = (CheckingAccount)ca; 
			ca2.pay("222-222", 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("계좌주 : "+ ca.getOwnerName());
		System.out.println("잔액 : "+ ca.getBalance());
		
//		ca.setCardNo("11111-11111");
//		System.out.println(ca.getCardNo());
		
		
		
		//객체를 생성(Account)
		//new Account();// 객체가 생성은 되었지만 생성된 곳을 모른다(사용할 수 없다.)
		
//		Account account1,account2,account3;//데이터 타입 -> 클래스 타입(레퍼런스 타입) -> 생성된 객체의 주소값을 담기위한 변수
//		account1 = new Account();//인스턴스화(객체생성) account1 => 인스턴스 변수
//		account2 = new Account();
		
		//생성자를 통해 객체를 생성하고 초기화
//		account1 = new Account("11111-11111", "홍길동", 1000);
//		account2 = new Account("22222-22222", "박길동", 5000);
//		account3 = new Account("22222-22222", "박길동");
		
		//인스턴스변수는 도트(.)를 통해서 객체를 접근해서 사용할 수 있다.
		//객체 초기화
//		account1.accountNo = "11111-11111";
//		account1.ownerName = "홍길동";
//		account1.balance = 10000;
//		
//		account2.accountNo = "22222-22222";
//		account2.ownerName = "박길동";
//		account2.balance = 5000;
		
//		account1.print();
//		account2.print();
//		account3.print();
		
		
		
		
	}
}
