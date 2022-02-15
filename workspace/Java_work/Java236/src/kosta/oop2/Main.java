package kosta.oop2;

public class Main {

	public static void main(String[] args) {
		Salary s = new Salary("홍길동", 26, "경찰관", 300);
		
		s.print(); // person 클래스 안에 있는 메소드
		System.out.println("===================");
		s.raisePay(50);// 월급 인상
		//s.downPay(30);// 월급 삭감
		s.show(); // salary 클래스 안에 있는 메소드
	}
}
