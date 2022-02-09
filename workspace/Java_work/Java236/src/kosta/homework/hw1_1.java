package kosta.homework;

import java.util.Scanner;

public class hw1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print(j + (i*n) +"\t");
			}
			System.out.println();
		} 
		
	}

}
