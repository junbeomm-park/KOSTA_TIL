package kosta.mission4;

import java.util.Scanner;

public class Solution4_1 {
	
	public int solution(String str, char c) {
		int answer = 0;
		
		str = str.toLowerCase();
		c = Character.toLowerCase(c);
		
		for(char x : str.toCharArray()) {
			if(x == c) {
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution4_1 s = new Solution4_1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		System.out.println(s.solution(str, c));
	}

}
