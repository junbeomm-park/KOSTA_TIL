package kosta.mission2;

import java.util.Scanner;

public class Solution2_2 {
	
	//리턴형:int , 파라미터: 배열, 배열개수
	public int solution(int n, int arr[]) {
		int answer = 1;
		int max = arr[0];
		
		for(int i = 1; i < n; i++) {
			if(arr[i] > max) {
				max = arr[i];
				answer++;
			}
		}
		return answer;
		
		
	}
	public static void main(String[] args) {
		Solution2_2 s = new Solution2_2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//8
		int[] arr = new int[n];// 배열에 8개의 방 생성
		
		for(int i = 0; i < n; i++) {
			//130 135 148 140 145 150 150 153
			arr[i] = sc.nextInt(); //배열에 초기화
		}
		
		System.out.println(s.solution(n, arr));
	}
}
