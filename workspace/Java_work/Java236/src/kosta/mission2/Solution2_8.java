package kosta.mission2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution2_8 {
	
	public void solution(int n, int arr[]) {
		int answer = 0;
		
		for(int i = 0; i < n; i++) {
			
			answer = n+1;
			int compare = arr[i];
			
			for(int j = 0; j < n; j++) {
				if(compare >= arr[j]) {
					answer--;
				}
			}
			System.out.print(answer + " ");
		}
		
	}
	
	public static void main(String[] args) {
		Solution2_8 s = new Solution2_8();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		s.solution(n, arr);
	}
}
