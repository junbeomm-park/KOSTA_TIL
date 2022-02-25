package kosta.io;

import java.util.Scanner;

public class RecurExam {
	
	static int f(int n) {
		if(n > 1) {
			return n*f(n-1);
		}else {
			return 1;
		}
	}

	public static void main(String[] args) {
		//재귀함수(팩토리얼계산)
		//5! = 5*4*3*2*1
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		System.out.println(n + "! = " + f(n));
	}

}
