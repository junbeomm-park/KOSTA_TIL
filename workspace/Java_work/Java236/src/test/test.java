package test;

import java.util.Arrays;
import java.util.Scanner;


public class test {
	
	public String solution(String str) {
		String answer = "";
		char[] c = str.toCharArray();
		for(int i = 0; i < str.length(); i++) {
			int num = (int)c[i];
			if(num >= 65 && num <= 90) {
				answer += (char)(num+32);
			}else if(num >= 97 && num <= 122) {
				answer += (char)(num-32);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		test t = new test();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(t.solution(str));
		
	}
}
