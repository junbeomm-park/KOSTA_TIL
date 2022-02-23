package kosta.phone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Manager extends PhoneInfo {
	//PhoneInfo[] arr = new PhoneInfo[3];
	List<PhoneInfo> list = new ArrayList<PhoneInfo>();
	
	//Company c = new Company();
	//Universe u = new Universe();
	//Scanner sc = new Scanner(System.in);
	int count = 0;
	
	public void addPhoneInfo() {
		System.out.println("1.일반 2.동창 3.직장");
		System.out.print("선택 :");
		String menu = DataInput.sc.nextLine();
		
		System.out.print("이름 :");
		String name = DataInput.sc.nextLine();
		
		System.out.print("전화번호 :");
		String phone_number = DataInput.sc.nextLine();
		
		System.out.print("생년월일 :");
		String birth = DataInput.sc.nextLine();
		
		switch (menu) {
		case "1":
			list.add(new PhoneInfo(name, phone_number, birth));
//			arr[count++] = new PhoneInfo(name, phone_number, birth);
			break;
		case "2":
			
			System.out.print("전공 :");
			String major = DataInput.sc.nextLine();
			
			System.out.print("학번 :");
			String year = DataInput.sc.nextLine();
			list.add(new Universe(name, phone_number, birth, major, year));
//			arr[count++] = new Universe(name, phone_number, birth, major, year);
			break;
		case "3":
			
			System.out.print("부서명 : ");
			String dept = DataInput.sc.nextLine();
			
			System.out.print("담당업무 : ");
			String position = DataInput.sc.nextLine();
			
			list.add(new Company(name, phone_number, birth, dept, position));
//			arr[count++] = new  Company(name, phone_number, birth, dept, position);
			break;
		
		}
		
		
	}
	
	public void listPhoneInfo() {
		System.out.println("1.전체 2.동창 3.직장");
		System.out.print("선택 :");
		String menu = DataInput.sc.nextLine();
		
		switch (menu) {
		case "1":
			
			for(int i = 0; i < list.size(); i++) {
				list.get(i).print();
			}
			
			break;
			
		case "2":
			
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i) instanceof Universe) {
					list.get(i).print();
				}
			}
			break;
			
		case "3":
			
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i) instanceof Company) {
					list.get(i).print();
				}
			}
			break;

		
		}
		
		
	}
	
	public void searchPhonInfo() {
		System.out.print("검색 :");
		String name = DataInput.sc.nextLine();
		int idx = -1;
		
		for(int i = 0; i < list.size(); i++) {
			PhoneInfo info = list.get(i);
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
		String name = DataInput.sc.nextLine();
		
		for(int i = 0; i < list.size(); i++) {
			if(name.equals(list.get(i).getName())) {
				System.out.print("전화 번호 수정 : ");
				String update_number = DataInput.sc.nextLine();
				list.get(i).setPhone_number(update_number);
//				arr[i].setPhone_number(update_number);
			}
		}
	}
	
	public void deletePhoneInfo() {
		System.out.print("삭제할 이름 입력 : ");
		String name = DataInput.sc.nextLine();
		int idx = -1;
		
		for(int i = 0; i < list.size(); i++) {
			PhoneInfo info = list.get(i);
			if(name.equals(info.getName())) {
				list.remove(i);
			}
		}
		
//		if(idx == -1) {
//			System.out.println("찾을 수 없습니다.");
//		}
//		
//		if(idx != -1) {
//			for(int i = idx; i < list.size(); i++) {
//				if(i == list.size()-1) { //마지막 위치
//					list.get(i) = null;
////					arr[i] = null;
//				}else {
////					arr[i] = arr[i+1];
//				}
//			}
//			count--;
//		}
		
		
	}

	public void compare() {
		Collections.sort(list,new Comparator<PhoneInfo>() {

			@Override
			public int compare(PhoneInfo o1, PhoneInfo o2) {
				if(o1.getName().compareTo(o2.getName()) > 0 ) {
					return 1;
				}else if(o1.getName().compareTo(o2.getName()) < 0) {
					return -1;
				}
				return 0;
			}
		});
		System.out.println("이름 순으로 정렬 되었습니다.");
	}
	
}
