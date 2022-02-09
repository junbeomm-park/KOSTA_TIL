package kosta.phone;

public class PhoneInfo {
	//상태 : 이름,전화번호,생년월일
	//기능 : 전화번호부 출력
	String name;
	String phone_number;
	String birth;
	
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
		System.out.println("==================");
	}
}
