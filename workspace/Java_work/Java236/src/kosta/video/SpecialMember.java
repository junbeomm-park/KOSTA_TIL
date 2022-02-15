package kosta.video;

public class SpecialMember extends GeneralMember {
	private int bonusPoint;
	
	public SpecialMember() {
		
	}

	public SpecialMember(String id, String name, String address, int bonusPoint) {
		super(id, name, address);// 부모의 파라미터 값이 있는 생성자를 호출한다.
		this.bonusPoint = bonusPoint;
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
