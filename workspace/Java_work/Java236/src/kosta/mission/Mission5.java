package kosta.mission;

import java.util.Random;
import java.util.Scanner;

public class Mission5 {
	
	public static void main(String[] args) {
		//UpDown 게임 구현
		//난수를 생성 : 1 ~ 100 => 1개 생성
		//키보드로 부터 숫자를 입력
		//입력한 숫자와 임의의 난수와 비교
		//정답 : "축하합니다. 몇번만에 성공" 프로그램 종료
		//비정답 : "Up" or "Down" 출력
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int ok = r.nextInt(100)+1; // 1 ~ 100 난수 1개 생성
		int n = 0;
		int count = 0;
		
		while(true) {
			do {
			  System.out.println("1~100 정수 입력 : ");
			  n = sc.nextInt();
			}while(n > 100 || n < 1);
			
			count++;
			
			if(ok == n) {
				System.out.println(count+"번째 성공했습니다.");
			}
			else if(ok < n) {
				System.out.println("Down");
			}
			else if(ok > n) {
				System.out.println("Up");
			}
		}
	}
}
