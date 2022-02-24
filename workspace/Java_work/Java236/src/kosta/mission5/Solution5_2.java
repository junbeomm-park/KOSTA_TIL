package kosta.mission5;

import java.util.Scanner;
import java.util.Stack;

public class Solution5_2 {
	
	public String solution(String str) {
		String answer = "NO";
		Stack<Character> stack = new Stack<Character>();
		char[] arr = str.toCharArray();
		
//		for(int i = 0 ; i < arr.length; i++) {
//			if(arr[i] == '(') {
//				stack.push('(');
//			}else {
//				stack.pop();
//			}
//		}
		
		for(char c : str.toCharArray()) {
			if(c == '(') {
				stack.push(c);
			}else {
				if(!stack.isEmpty()) return "YES";
				stack.pop();
			}
		}
		
		if(stack.isEmpty()) {
			answer = "YES";
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Solution5_2 s = new Solution5_2();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(s.solution(str));
		
		
		
	}

}
