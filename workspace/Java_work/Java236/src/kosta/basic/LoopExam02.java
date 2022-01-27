package kosta.basic;

public class LoopExam02 {
	public static void main(String[] args) {
		//중첩 for문
		//전체 구구단 구현
//		for(int i = 2; i <= 9 ; i++) {
//			System.out.println(i+"단");
//			for(int j = 1; j <= 9; j++) {
//				System.out.println(i + " * "+ j +" = "+ i*j);
//			}
//		}
		
		//퀴즈> 4x + 5y = 60  => x,y를 구하자 (모든 경우의수)
		outerLabel:
		for(int i = 0 ; i <= 15 ; i++ ) {
			for(int j = 0 ; j <= 12 ; j++) {
				if((4*i)+(5*j) == 60) {
					System.out.println("x값 :"+i+" y값 :"+j);
					break outerLabel;
				}
			}
		}
		
		//퀴즈>
		//*
		//**
		//***
		//****
		//*****
//		int a = 5;
//		for(int i = 0; i < a; i++) {
//			for(int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		int a = 5;
//		for(int i = a; i >= 1; i--) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
}
