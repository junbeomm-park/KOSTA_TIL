package kosta.mission2;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution2_3 {

	public String solution(int n, int A[], int B[]) {
		
		String answer = "";
		
		//가위1 바위2 보3
		for(int i = 0; i < n; i++) {
			if(A[i] == B[i]) {
				answer += "D";
			}else if(A[i] == 1 && B[i]==3) {
				answer += "A";
			}
			else if(A[i] == 2 && B[i]==1) {
				answer += "A";
			}
			else if(A[i] == 3 && B[i]==2) {
				answer += "A";
			}else {
				answer += "B";
			}
		}
		return answer; //ABABD => A B A B D => char[] 
		               //String => char[] : toCharArray()
	}
	public static void main(String[] args) {
		Solution2_3 s = new Solution2_3();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];
		//2 3 3 1 3
		//1 1 2 2 3
		
		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			B[i] = sc.nextInt();
		}
		
		for(char x : s.solution(n, A, B).toCharArray()) {
			System.out.println(x);
		}
	}

}
