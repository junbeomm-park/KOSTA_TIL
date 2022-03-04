package kosta.mission5;

import java.util.Scanner;

public class Solution5_3 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a = 0;
		int b = 0;
		
		for(int i = 1; i <= t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			for(int j = 1; j < 30; j++) {
				a = a*2;
				b = b*3;
				
				if(b>a) {
					System.out.println("#"+i+" "+j);
					break;
				}
			}
		}
		
		
		
		
		
		
		
		
	}
}
