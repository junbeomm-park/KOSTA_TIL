package kosta.mission3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution3_1 {
	
	public List<Integer> solution(int n, int m, int narr[], int marr[]) {
		List<Integer> answer = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			answer.add(narr[i]);
		}
		
		for(int i = 0; i < m; i++) {
			answer.add(marr[i]);
		}
		
		Collections.sort(answer);
		
		return answer;
	}

	public static void main(String[] args) {
		Solution3_1 s = new Solution3_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] narr = new int[n];
	
		for(int i = 0; i < n; i++) {
			narr[i] = sc.nextInt();
			
		}
		
		Arrays.sort(narr);
		
		
		int m = sc.nextInt();
		
		int[] marr = new int[m];
		for(int i = 0; i < m; i++) {
			marr[i] = sc.nextInt();
		}
		
		Arrays.sort(marr);
		
		
		System.out.println(s.solution(n, m, narr, marr));
	}

}
