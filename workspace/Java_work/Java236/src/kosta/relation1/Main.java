package kosta.relation1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Course c1 = new Course("전산학개론");
		Course c2 = new Course("기초통계학");
		Course c3 = new Course("빅데이터개론");
		
		Student s1 = new Student("홍길동");
		Student s2 = new Student("박길동");
		
		s1.register(c1);
		s1.register(c2);
		
		s1.register(c3);
		s2.register(c3);
		
		s1.dropCourse(c1);
		
		s1.printMember();
		c3.printCourse();
		
		
//		while(true) {
//			System.out.println("1. 수강신청  2. 수강취소 3. 수강목록 출력");
//			System.out.print("메뉴 : ");
//			String name = sc.nextLine();
//			
//			switch (name) {
//			case "1":
//				System.out.println("수강 가능한 과목 목록");
//				System.out.println("1.전산학개론 2.기초통계학 3.빅데이터개론");
//				System.out.print("선택 :");
//				String select = sc.nextLine();
//				
//				if(select.equals("전산학개론")) {
//					s1.register(c1);
//				}else if(select.equals("기초통계학")) {
//					s1.register(c2);
//				}else if(select.equals("빅데이터개론")) {
//					s1.register(c3);
//				}
//				
//				
//				break;
//
//			case "2":
//				System.out.println("수강 취소 가능한 과목 목록");
//				s1.printMember();
//				System.out.print("선택 :");
//				String select2 = sc.nextLine();
//				
//				if(select2.equals("전산학개론")) {
//					s1.dropCourse(c1);
//				}else if(select2.equals("기초통계학")) {
//					s1.dropCourse(c2);
//				}else if(select2.equals("빅데이터개론")) {
//					s1.dropCourse(c3);
//				}
//				
//				break;
//				
//			case "3":
//				s1.printMember();
//				break;
//			}
//		}
	}
}
