package kosta.mission4;

import java.util.Scanner;

public class Solution4_2 {

	public String solution(String str) {
		String answer = "";
		char c[] = str.toCharArray();
		
		for(int i = 0; i < c.length; i++) {
			int num = (int)c[i];
			if(num >= 97 && num <= 122) {
				answer += (char)(num-32);
			}else if(num >= 65 && num <= 90) {
				answer += (char)(num+32);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Solution4_2 s = new Solution4_2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(s.solution(str));
	}
}
