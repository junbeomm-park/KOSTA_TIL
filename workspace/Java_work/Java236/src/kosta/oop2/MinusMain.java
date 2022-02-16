package kosta.oop2;

public class MinusMain {

	public static void main(String[] args) {
		//MinusAccount ma = new MinusAccount("111-111","박길동",5000,10000);
		Account ma = new Account("111-111","박길동",5000);
		
//		try {
//			ma.withdraw(12000); //자식이 오버라이딩한 메소드
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		ma.print(); //부모의 메소드
		
		if(ma instanceof MinusAccount) {
			MinusAccount ma2 = (MinusAccount)ma;
			System.out.println(ma2.getCreditLine());
		}else {
			System.out.println("캐스팅 불가");
		}
		
		
		
	}

}
