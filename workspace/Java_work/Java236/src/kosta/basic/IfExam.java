package kosta.basic;

public class IfExam {
	public static void main(String[] args) {
		
		int menu = 1;
		
		switch (menu) {
		case 1:
			System.out.println("햄버거 선택");
			break;
		case 2:
			System.out.println("콜라 선택");
			break;
		case 3:
			System.out.println("피자 선택");
			break;
		default:
			System.out.println("기타 선택");
			break;
		}
	}
}
