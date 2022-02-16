package kosta.phone;

public class Company extends PhoneInfo {
	private String dept; // 부서
	private String position; // 담당업무
	
	public Company() {
		
	}

	public Company(String name, String phone_number, String birth, String dept, String position) {
		super(name, phone_number, birth);
		this.dept = dept;
		this.position = position;
	}
	
	
	
	
	//리스트 출력
	@Override
	public void print() {
		
		super.print();
		System.out.println("부서명 : "+dept);
		System.out.println("담당업무 : "+position);
		System.out.println("==========================");
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	
}
