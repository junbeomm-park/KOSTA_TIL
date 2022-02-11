package test;

import java.util.Scanner;


public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
//		int a = (n/10);
//		int b = (n%10);
//		int c = (n/10)+(n%10);
//		int d = ((n%10)*10) + (n/10)+(n%10);
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
		int count = 0;
		int b = a;
		while (true) {
			a = ((a%10)*10) + (((a/10)+(a%10))%10);
			count ++;
			
			if(b == a) {
				break;
			}
		}
		System.out.println(count);
	
		
		
	}
}
