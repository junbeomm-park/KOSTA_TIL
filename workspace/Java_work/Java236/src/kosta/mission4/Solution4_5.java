package kosta.mission4;

import java.util.Scanner;

public class Solution4_5 {

	public String solution(String str) {
		String answer = "";
		
		int rt = str.length()-1;
		int lt = 0;
		
		char[] c = str.toCharArray();
		
		while(lt < rt) {
			if(!Character.isAlphabetic(c[lt])) {
				lt++;
			}else if(!Character.isAlphabetic(c[rt])){
				rt--;
			}else {
				char tmp = c[lt];
				c[lt] = c[rt];
				c[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(c);
		return answer;
	}
	
	public static void main(String[] args) {
		Solution4_5 s = new Solution4_5();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(s.solution(str));
	}
}
