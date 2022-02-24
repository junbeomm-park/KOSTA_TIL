package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class test {
	
	public void solution(String str) {
		int arr[] = new int[26];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
		for(int val : arr) {
			System.out.print(val + " ");
		}
		
	}
	
	public static void main(String[] args) {
		test t = new test();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		t.solution(str);
	}
}
