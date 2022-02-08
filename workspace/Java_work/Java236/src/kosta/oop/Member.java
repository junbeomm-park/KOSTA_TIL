package kosta.oop;

public class Member {
	//상태(필드, 멤버변수)
	String name;
	int age;
	String address;
	
	//기능(메소드) 회원등록
	public void addMember(String name, int age, String address) {//지역변수(매개변수)
		this.name = name;
		this.age = age;
		this.address = address;
		
	}
	//기능(메소드) 회원출력
	public void printMember() {
		System.out.println("회원 이름 :"+name);
		System.out.println("회원 나이 :"+age);
		System.out.println("회원 주소 :"+address);
		System.out.println("===================");
	}
}
