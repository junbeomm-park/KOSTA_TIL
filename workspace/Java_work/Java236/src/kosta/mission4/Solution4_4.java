package kosta.mission4;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution4_4 {
	
	public ArrayList<String> solution(int n, String arr[]){
		ArrayList<String> answer = new ArrayList<String>();
		
		for(String x : arr) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		return answer;
		
	}

	public static void main(String[] args) {
		Solution4_4 s = new Solution4_4();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		
		for(String x : s.solution(n, arr)) {
			System.out.println(x);
		}
		
	}
}
