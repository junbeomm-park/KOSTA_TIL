package kosta.phone;

import java.util.Scanner;

public class Manager {
	PhoneInfo[] arr = new PhoneInfo[10];
	Scanner sc = new Scanner(System.in);
	int count = 0;
	
	public void addPhoneInfo() {
		System.out.print("이름 :");
		String name = sc.nextLine();
		
		System.out.print("전화번호 :");
		String phone_number = sc.nextLine();
		
		System.out.print("생년월일 :");
		String birth = sc.nextLine();
		
		arr[count++] = new PhoneInfo(name, phone_number, birth);
	}
	
	public void listPhoneInfo() {
		for(int i = 0; i < count; i++) {
			arr[i].print();
		}
	}
	
	public void searchPhonInfo() {
		System.out.print("검색 :");
		String name = sc.nextLine();
		int idx = -1;
		
		for(int i = 0; i < count; i++) {
			PhoneInfo info = arr[i];
			if(name.equals(info.name)) {
				info.print();
				idx = i;
			}
		}
		if(idx == -1) {
			System.out.println("찾을 수 없습니다.");
		}
	}
}
