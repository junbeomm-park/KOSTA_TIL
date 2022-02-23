package kosta.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListMission {

	public static void main(String[] args) {
		//List 자료구조를 활용하여 키보드로 부터 문자열을 입력 받아 처리
		//1.데이터 추가 2.데이터 삭제 3. 출력
		ListMission l = new ListMission();
		Scanner sc = new Scanner(System.in);
		List<String> list = new LinkedList<String>();
		
		while(true) {
			System.out.println("1.데이터 추가  2.데이터 삭제  3.출력  4. 종료");
			System.out.print("선택 : ");
			String menu = sc.nextLine();
			
			switch (menu) {
			case "1":
				System.out.print("추가할 음식을 입력 하세요 : ");
//				String food = sc.nextLine();
//				list.add(food);
				list.add(sc.nextLine());
				System.out.println("추가 완료 !");
				break;
				
			case "2":
				System.out.print("삭제할 음식을 입력 하세요 : ");
//				String delete = sc.nextLine();
//				for(int i = 0; i < list.size(); i++) {
//					if(delete.equals(list.get(i))){
//						list.remove(i);
//					}
//				}
				int idx = list.indexOf(sc.nextLine());
				if(idx != -1) {
					list.remove(idx);
					System.out.println("삭제 완료 !");
				}
				
				break;
				
			case "3":
				Iterator<String> iter = list.iterator();
				while(iter.hasNext()) {
					System.out.println(iter.next());
				}
				break;
			case "4":
				return;
			}
		}
	}

}
