package kosta.phone;

import java.util.Scanner;

public class Manager {
	PhoneInfo[] arr = new PhoneInfo[3];
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
			if(name.equals(info.getName())) {
				info.print();
				idx = i;
			}
		}
		if(idx == -1) {
			System.out.println("찾을 수 없습니다.");
		}
	}
	
	public void updatePhoneInfo() {
		System.out.print("수정할 이름 입력 :");
		String name = sc.nextLine();
		
		for(int i = 0; i < count; i++) {
			if(name.equals(arr[i].getName())) {
				System.out.print("전화 번호 수정 : ");
				String update_number = sc.nextLine();
				
				arr[i].setPhone_number(update_number);
			}
		}
	}
	
	public void deletePhoneInfo() {
		System.out.print("삭제할 이름 입력 : ");
		String name = sc.nextLine();
		int idx = -1;
		
		for(int i = 0; i < count; i++) {
			PhoneInfo info = arr[i];
			if(name.equals(info.getName())) {
				idx = i;
			}
		}
		
		if(idx == -1) {
			System.out.println("찾을 수 없습니다.");
		}
		
		if(idx != -1) {
			for(int i = idx; i < count; i++) {
				if(i == arr.length-1) { //마지막 위치
					arr[i] = null;
				}else {
					arr[i] = arr[i+1];
				}
			}
			count--;
		}
	}
}
