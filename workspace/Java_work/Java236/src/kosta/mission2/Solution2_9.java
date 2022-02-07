package kosta.mission2;

import java.util.Scanner;

public class Solution2_9 {
	
	//int re = Math.max(a,b);
	public int solution(int n, int arr[][]) {
		int answer = 0;
		
		int raw = 0, col = 0; //각 행과 각 열의 합 구하기
		
		for(int i = 0; i < n; i++) {
			raw = 0; //내부 for문에서 더해진 값을 초기화
			col = 0;
			
			for(int j = 0; j < n; j++) {
				raw += arr[i][j];
				col += arr[j][i];
						
			}
			answer = Math.max(answer, raw); // 각 행의 최댓값
			answer = Math.max(answer, col);// 각 열의 최댓값
		}
		
		int line = 0, reline = 0; // 대각선 합 구하기
		
		for(int i = 0; i < n; i++) {
			line += arr[i][i];
			reline += arr[i][n-i-1];
		}
		answer = Math.max(answer, line); // 정대각선의 최댓값
		answer = Math.max(answer, reline);// 역대각선의 최댓값
		
		return answer;
	}
	
	public static void main(String[] args) {
		Solution2_9 s = new Solution2_9();
		Scanner sc = new Scanner(System.in);
		
		/*
		 5
		 10 13 10 12 15
		 12 39 30 23 11
		 11 25 50 53 15
		 19 27 29 37 27
		 19 13 30 13 19
		 
		 */
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(s.solution(n, arr));
	}
}
