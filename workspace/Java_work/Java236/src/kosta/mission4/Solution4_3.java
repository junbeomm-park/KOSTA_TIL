package kosta.mission4;

import java.util.Scanner;

public class Solution4_3 {
	
//	public String solution(String str) {
//		String answer = "";
//		String arr[] = str.split(" ");
//		int max = 0;
//		
//		for(String x : arr) {
//			int len = x.length();
//			if(len > max) {
//				max = len;
//				answer = x;
//			}
//		}
//		return answer;
//	}
	
	public String solution(String str) {
		String answer = "";
		int max = 0;
		int pos;
		
		while((pos=str.indexOf(' ')) != -1) {
			String tmp = str.substring(0, pos);
			//System.out.println(tmp); 
			int len = tmp.length();
			if(len > max) {
				max = len;
				answer = tmp;
			}
			str = str.substring(pos+1);
		}
		
		if(str.length() > max) answer = str;
		
		return answer;
	}

	public static void main(String[] args) {
		Solution4_3 s = new Solution4_3();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(s.solution(str));
	}

}
