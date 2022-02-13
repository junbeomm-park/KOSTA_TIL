package kosta.mission2;

import java.util.Scanner;

public class Solution2_11 {
	
	public void solution(int n, int arr[][]) {
		int answer = 0;
		int max = 0;
		int count= 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < 5; k++) {
					if(arr[i][j] == arr[j][k] && i != j) {
						count ++;
						break;
					}
				}
			}
			if(count > max) {
				answer = i;
				max = count;
			}
		}
		System.out.println(answer);
	}

	public static void main(String[] args) {
		
		Solution2_11 s = new Solution2_11();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][5];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		s.solution(n, arr);
	}

}
