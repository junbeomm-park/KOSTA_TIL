package kosta.mission;

import java.util.Scanner;

public class Mission04 {
	
	public static void main(String[] args) {
		//메뉴를 선택해서 해당 메뉴의 명령을 실행해 보자.
		//1.추가 2.출력 3.검색 4.종료 => 출력
		//메뉴선택 : 1
		//키보드로 부터 데이터를 입력 받아 배열에 추가
		//1.추가 2.출력 3.검색 4.종료 => 출력
		//메뉴선택 : 2
		//홍길동, 박길동, 조길동	=> 출력
		//1.추가 2.출력 3.검색 4.종료 => 출력
		//메뉴선택 : 3
		//검색 문자열 입력 : 홍길동
		//1번째 있습니다. or 해당 문자열은 존재하지 않습니다. => 출력
		//메뉴선택 : 4
		//프로그램 종료 => 출력 => return;
		Scanner sc = new Scanner(System.in);
		String[] strr = new String[10];
		int count = 0;
		
		while(true) {
			System.out.println("1.추가 2.출력 3.검색 4.종료");
			System.out.print("메뉴선택 : ");
			String menu = sc.nextLine();
			
			
			switch (menu) {
			case "1":
				System.out.println("문자열 입력 : ");
				String str = sc.nextLine();
				strr[count++] = str;
				break;
				
			case "2":
				for(int i = 0; i < count; i++) {
					System.out.println(strr[i]+", ");
				}
				System.out.println();
				break;	
				
			case "3":
				System.out.println("검색 문자열 : ");
				String search = sc.nextLine();
				int idx = -1;
				
				for(int i = 0; i < count; i ++) {
					if(search.equals(strr[i]) == true) {
						idx = i;
						break;
					}
				}
				
				if(idx == -1) {
					System.out.println("해당 문자열은 존재하지 않습니다.");
				}else {
					System.out.println((idx+1)+"번째 있습니다.");
				}
				
				break;	
			case "4":
				System.out.println("프로그램 종료");
				return;
			}
		}// end while
	}// end main
}// end class
