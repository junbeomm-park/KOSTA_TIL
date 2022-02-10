package kosta.video;

public class GeneralMember {
	private String memberNo;
	private String memberName;
	private String address;
	
	public GeneralMember() {
		
	}
	
	public GeneralMember(String memberNo, String memberName, String address) {
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.address = address;
	}
	
	public void print() {
		System.out.println("회원의 아이디 :" + memberNo);
		System.out.println("회원의 이름 :" + memberName);
		System.out.println("회원의 주소 :" + address);
	}

	public String getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
