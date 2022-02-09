package kosta.homework;

import java.util.Scanner;

public class hw1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int n = sc.nextInt();
		
		for(int i = n-1; i >= 0; i--) {
			for(int j = 1; j <= n; j++) {
				System.out.print(j+(i*n)+"\t");
			}
			System.out.println();
		}
		
	}

}
