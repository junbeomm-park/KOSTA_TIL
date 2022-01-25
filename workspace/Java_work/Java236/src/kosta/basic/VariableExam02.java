package kosta.basic;

import java.util.Scanner;

public class VariableExam02 {
	int num; //멤버변수
	
	public static void main(String[] args) {
		//지역변수(로컬변수) 특징 2가지
		//지역변수(로컬변수) 정의 : 특정 메서드 및 블럭 안에 선언된 변수
		//1. 반드시 초기화를 해야 한다.(습관을 가지자)
		//2. 선언된 변수 범위에서만 사용 가능
		int num = 0;
		String str ="";
		boolean bool = false;
		num = num +1;
		
		System.out.println(num);
		
		//변수는 선언된 위치가 매우 중요하다. => 변수의 사용범위가 결정되기 때문
		int a = 0;
		
		if(num == 1) {
			a = 10;
		}
		System.out.println("a : "+ a);
		
		int i = 0;
		
		for(i=1; i<=10; i++) {
			//System.out.println(i);
		}
		
		System.out.println("최종결과 : " + i);
		//1. 두정수를 입력 받아 
		//두 정수의 합이 같으면 "같다"
		//두 정수의 합이 다르면 "다르다."
		
		//2. 두 정수와 문자열을 입력 받아
		//두 정수의 사칙연산의 결과를 출력하라
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1 : ");
		int a2 = sc.nextInt();
		System.out.print("정수 2 : ");
		int b2 = sc.nextInt();
		System.out.print("연산자 : ");
		sc.nextLine();
		String op = sc.nextLine();
		op = op.trim();
		
		int result = 0;
		
		if(op.equals("+")) {
			result = a2 + b2;
		}else if(op.equals("-")){
			result = a2 - b2;
		}else if(op.equals("*")){
			result = a2 * b2;
		}else if(op.equals("/")){
			result = a2 / b2;
		}
		
		System.out.println("결과 : " + result);
		
		//문자열 비교( 문자열.equals(문자열))
//		String str1 = "abc";
//		String str2 = "abb";
//		
//		if(str1.equals(str2)) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
	}

}
