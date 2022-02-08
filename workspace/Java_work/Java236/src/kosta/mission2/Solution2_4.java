package kosta.mission2;

import java.util.Scanner;

public class Solution2_4 {
	
	public int solution(int n) {
		int answer = 1;
		int num1 = 0;
		int num2 = 1;
		
		for(int i = 0; i < n; i++) {
			System.out.print(answer+" ");
			answer = num1 + num2;
			num1 = num2;
			num2 = answer;
			
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Solution2_4 s = new Solution2_4();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		s.solution(n);
		
		
		
		
		
		
		
	}
}
