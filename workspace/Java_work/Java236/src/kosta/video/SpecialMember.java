package kosta.video;

public class SpecialMember extends GeneralMember {
	private int bonusPoint;
	
	public SpecialMember() {
		
	}

	public SpecialMember(String id, String name, String address, int bonusPoint) {
		super(id, name, address);// 부모의 파라미터 값이 있는 생성자를 호출한다.
		this.bonusPoint = bonusPoint;
	}
	
	//부모클래스의 show()메소드를 
	//자식클래스에서 오버라이딩 하여 show메소드에 일반회원 정보 뿐만 아니라 bonusPoint 내용까지 출력
	@Override
	public void show() {
		
		System.out.println("========================");
		super.show();
		System.out.println("회원의 보너스 포인트" + bonusPoint);
	}
	
	public void print() {
		System.out.println("보너스 포인트 : " + bonusPoint);
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	
	
}
