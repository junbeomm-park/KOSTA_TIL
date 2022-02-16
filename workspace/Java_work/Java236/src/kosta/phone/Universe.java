package kosta.phone;

public class Universe extends PhoneInfo {
	private String major;
	private String year;
	
	public Universe() {
		
	}

	public Universe(String name, String phone_number, String birth, String major, String year) {
		super(name, phone_number, birth);
		this.major = major;
		this.year = year;
	}
	
	

	@Override
	public void print() {
		super.print();
		System.out.println("전공 : "+major);
		System.out.println("학번 : "+year);
		System.out.println("==========================");
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	
}
