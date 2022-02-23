package kosta.mission5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution5_1 {
	//Map : getOrDefalut(x, 0)
	
	public char solution(int n, String s) {
		char answer = ' ';
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char key : s.toCharArray()) {
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
		
		int max = -1;
		for(char key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		
		return answer;
	}
	
	//BACBACCACCBDEDE
	public static void main(String[] args) {
		Solution5_1 s = new Solution5_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		
		System.out.println(s.solution(n, str));
	}
}
