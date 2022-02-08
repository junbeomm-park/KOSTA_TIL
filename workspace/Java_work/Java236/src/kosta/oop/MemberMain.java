package kosta.oop;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		//2명의 회원을 등록하고 전체목록을 출력
		Member arr[] = new Member[2];// Member객체를 담기 위한 배열을 생성
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i <arr.length; i++) {
			System.out.print("이름을 입력하세요 :");
			String name = sc.nextLine();
			
			System.out.print("나이를 입력하세요 :");
			int age = Integer.parseInt(sc.nextLine());
			
			System.out.print("주소를 입력하세요 :");
			String address = sc.nextLine();
			
//			Member m = new Member();
//			arr[i] = m;
			
			arr[i] = new Member();
			arr[i].addMember(name, age, address);
			
			
		}
		System.out.println("-----------회원목록 출력------------");
		
		for(Member m : arr) {
			m.printMember();
		}
		
		
		
	}

}
