package kosta.mission4;

import java.util.Scanner;

public class Solution4_7 {
	
	public String solution(String str) {
		String answer = "";
		String tmp = new StringBuilder(str).reverse().toString();
		
		if(str.equalsIgnoreCase(tmp)) {
			answer = "YES";
		}else {
			answer = "NO";
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Solution4_7 s = new Solution4_7();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(s.solution(str));
		
	}

}
