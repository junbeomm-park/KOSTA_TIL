package kosta.mission2;

import java.util.Scanner;

public class Solution2_5 {
	
	public int solution(int n) {
	int answer = 0;
		
		for(int i =2; i <= n; i++){
			int count = 0;
			for(int j =1; j<=i; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 2) {
				answer++;
			}
		}
		return answer;
	}
		

	public static void main(String[] args) {
		Solution2_5 s = new Solution2_5();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
	
		System.out.println(s.solution(n));
	}

}
