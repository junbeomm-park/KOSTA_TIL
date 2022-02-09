package kosta.phone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();
		PhoneInfo p[] = new PhoneInfo[3];
		
		while(true) {
			System.out.println("1. 추가 2.전체출력 3.검색 4.종료");
			System.out.print("메뉴선택 : ");
			String menu = sc.nextLine();
			
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
				System.out.println("프로그램이 종료 되었습니다");
				return;
			
			}
		}
	}

}
