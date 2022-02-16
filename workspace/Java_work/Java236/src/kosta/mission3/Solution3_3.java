package kosta.mission3;

import java.util.Scanner;

public class Solution3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int k = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 10 3 
		//12 15 11 20 25 10 20 19 13 15
		int max = 0;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			if(i < n-k) {
				sum = arr[i]+arr[i+1]+arr[i+2];
			}
			if(max < sum) {
				max = sum;
			}
		}
		
		System.out.println(max);
		
		
	}
}
