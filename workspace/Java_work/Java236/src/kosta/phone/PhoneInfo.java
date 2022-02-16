package kosta.phone;

public class PhoneInfo {
	//상태 : 이름,전화번호,생년월일
	//기능 : 전화번호부 출력
	
	//Company(dept, position)
	//Universe(major, year)
	
	private String name;
	private String phone_number;
	private String birth;
	
	public PhoneInfo() {
		
	}
	
	
	public PhoneInfo(String name, String phone_number, String birth) {
		this.name = name;
		this.phone_number = phone_number;
		this.birth = birth;
	}
	
	public void print() {
		System.out.println("이름 : "+name);
		System.out.println("전화번호 : "+phone_number);
		System.out.println("생년월일 : "+birth);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone_number() {
		return phone_number;
	}


	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}


	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;
	}
	
}
