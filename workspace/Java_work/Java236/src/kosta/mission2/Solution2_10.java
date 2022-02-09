package kosta.mission2;

import java.util.Scanner;

public class Solution2_10 {
	
	public int solution(int n, int arr[][]) {
		
		int answer = 0;
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= n; j++) {
//				arr[i][j] = 0;
				if(arr[i][j] > arr[i-1][j] && arr[i][j] > arr[i+1][j] && arr[i][j] > arr[i][j-1] && arr[i][j] > arr[i][j+1]) {
					answer++;
				}
			}
		}return answer;
		
	}

	public static void main(String[] args) {
		Solution2_10 s = new Solution2_10();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n+2][n+2];
		
		for(int i = 1; i < n+1; i++) {
			for(int j = 1; j < n+1; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(s.solution(n, arr));
	}
}
