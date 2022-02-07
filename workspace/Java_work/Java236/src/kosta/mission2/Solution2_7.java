package kosta.mission2;

import java.util.Scanner;

public class Solution2_7 {
	
	public int solution(int n, int arr[]) {
		int answer = 0;
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == 1) {
				count++;
				answer += count;
			}else {
				count = 0;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Solution2_7 s = new Solution2_7();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(s.solution(n, arr));
	}
}
