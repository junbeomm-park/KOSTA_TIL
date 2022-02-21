package kosta.oop;

public class AccountMain2 {
	
	public static void main(String[] args) {
		Account account1 = new Account("111-111","홍길동",1000);
		//System.out.println(account.toString()); //toString() 호출 => 없으면 부모클래스 Object 호출 : 주소값을 출력
												//Account toString() 오버라이딩 = 자신 객체의 내용이 출력된다.
		
		Account account2 = new Account("222-222", "홍길동", 5000);
		
		if(account1.equals(account2)) {		//Object equals()호출 : 주소값을 기준으로 비교
			System.out.println("동일인 계좌");
		}else {
			System.out.println("서로다른 계좌");
		}
	}
	
	
}
