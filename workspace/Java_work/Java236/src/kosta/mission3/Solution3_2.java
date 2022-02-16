package kosta.mission3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Solution3_2 {
	
	public List<Integer> solution(int narr[], int marr[]) {
		List<Integer> answer = new ArrayList<Integer>();
		
		for(int i = 0; i < narr.length; i++) {
			for(int j = 0; j < marr.length; j++) {
				if(narr[i] == marr[j]) {
					answer.add(narr[i]);
					break;
				}
			}
		}
		
		Collections.sort(answer);
		
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Solution3_2 s = new Solution3_2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] narr = new int[n];
		
		for(int i = 0; i < n; i++) {
			narr[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int[] marr = new int[m];
		
		for(int i = 0; i < m; i++) {
			marr[i] = sc.nextInt();
		}
		
		System.out.println(s.solution(narr, marr));
	}
}
