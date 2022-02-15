package kosta.oop2;

public class Salary extends Person {
	private int pay;
	
	public Salary() {
		
	}

	public Salary(String name, int age, String job, int pay) {
		super(name, age, job);
		this.pay = pay;
	}
	
	public void show() {
		System.out.println("이름 : " + getName()); // 부모 클래스인 person클래스의 필드가 private 으로 선언 되었으니 set/get 으로 간접 접근
		System.out.println("나이 : " + getAge());
		System.out.println("직업 : " + getJob());
		System.out.println("연봉 : " + salayInfo(pay));
	}
	
	// 연봉 계산 하는 메소드
	public int salayInfo(int pay) {
		return this.pay = pay * 12;
	}
	
	public int raisePay(int pay) {
		return this.pay += pay;
	}
	
	public int downPay(int pay) {
		return this.pay -= pay;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	
	
}
