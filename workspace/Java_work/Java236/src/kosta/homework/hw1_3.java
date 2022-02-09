package kosta.homework;

import java.util.Scanner;

public class hw1_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오 :");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < n*2; j=j+2) {
				System.out.print(j+(i*10)+"\t");
			}
			System.out.println();
		}
	}
}
