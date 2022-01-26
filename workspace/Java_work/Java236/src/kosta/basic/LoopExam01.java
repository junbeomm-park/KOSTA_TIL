package kosta.basic;

import java.util.Scanner;

public class LoopExam01 {

	public static void main(String[] args) {
		//while : 초기식 -> 조건식 -> 명령문 -> 증감식 : 수직방향
		//1~10까지의 합을 구하시오
//		int sum = 0;
//		int i = 1; //초기식
//		while(i<=10) { //조건식
//			sum += i; //명령문
//			i++;
//		}
//		System.out.println("1~10 까지의 합 : "+sum);
		
		//퀴즈 > 구구단 7단 출력
//		int dan = 7;
//		int i = 1;
//		while(i<=9) {
//			System.out.println(dan + " * " + i +" = "+dan*i);
//			i++;
//		}
		
		//for문 : 초기식 -> 조건식 -> 명령문 -> 증감식 : 수평구조
//		int sum = 0;
//		for(int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		System.out.println("1~10 까지의 합 : "+sum);
		
//		int dan = 7;
//		for(int i = 1; i <= 9; i++) {
//			System.out.println(dan + " * " + i +" = "+dan*i);
//		}
		
		
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 != 0 & i % 3 != 0) {
//				System.out.println(i);
//			}
//			
//		}
		
		//do ~ while : 명령문을 먼저 실행 후 조건을 비교
		//적어도 1번 무조건 실행이 필요한 경우
		//키보드로 부터 숫자를 입력 받아 합을 구하자.
		//음수를 입력하면 새롭게 다시 입력 받도록 하자.
		
		Scanner sc = new Scanner(System.in);
//		int n = 0;
//		
//		do {
//			System.out.print("양수 입력 : " );
//			n = sc.nextInt();
//		} while(n <= 0);
//		
//		int sum = 0;
//		for(int i = 1; i <= n; i++) {
//			sum += i;
//		}
//		System.out.println("1에서"+ n + "까지의 합 : "+ sum);
		
		//2개의 정수를 입력 받아 b-a 결과를 출력
		//b > a 되도록 입력받음
//		int a = 0;
//		int b = 0;
//		
//		do {
//			System.out.print("a 입력 : ");
//			a = sc.nextInt();
//			System.out.print("b 입력 : ");
//			b = sc.nextInt();
//		} while (b < a);
//		
//		int result = b - a;
//		System.out.println("b-a 의 값: "+result);
		
		//무한반복
//		for(;;) {
//			System.out.println("hello");
//		}
		
		while(true) {
			System.out.println("hello2");
		}
		
		
	}

}
