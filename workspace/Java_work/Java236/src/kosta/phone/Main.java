package kosta.phone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		
		Manager m = new Manager();
		PhoneInfo p[] = new PhoneInfo[3];
		
		while(true) {
			System.out.println("1. 추가 2.출력 3.검색 4.수정 5. 삭제 6.정렬 7.저장 8.불러오기 9.종료");
			System.out.print("메뉴선택 : ");
			String menu = DataInput.sc.nextLine();
			
			switch (menu) {
			case "1":
				m.addPhoneInfo();
				
				break;
			case "2": 
				m.listPhoneInfo();
				
				break;
			case "3": 
				m.searchPhonInfo();
				
				break;
			case "4": 
				m.updatePhoneInfo();
				
				break;
			case "5": 
				m.deletePhoneInfo();
				
				break;
			case "6": 
				m.compare();
				
				break;
			case "7": 
				m.save();
				
				break;
			case "8": 
				m.callList();
				
				break;
			case "9": 
				System.out.println("프로그램이 종료 되었습니다");
				return;
			
			}
		}
	}

}
