package kosta.mission2;

import java.util.Scanner;

public class Solution2_12 {
	
	public int solution(int n, int m, int arr[][]) {
		int answer = 0;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				int cnt = 0;
				for(int k = 0; k < m; k++) {
					int pi = 0, pj=0;
					for(int s = 0; s < n ; s++) {
						if(arr[k][s] == i) pi = s;
						if(arr[k][s] == j) pj = s;
					}
					if(pi < pj) cnt++;
				}
				if(cnt == m) {
					answer++;
					System.out.println(i + " : "+j);
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution2_12 s = new Solution2_12();
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt(); //학생수
		int m = sc.nextInt(); //시험횟수
		int arr[][] = new int[m][n];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(s.solution(n, m, arr));
		
	}
}
