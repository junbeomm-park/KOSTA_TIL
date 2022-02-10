package kosta.game;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int strike = 0;
		int ball = 0;
		int count = 0;
		int input[] = new int[3];
		
		BaseBall bb = new BaseBall();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("게임 도전");
			System.out.print("숫자 입력 :");
			
			for(int i = 0; i < 3; i++) {
				input[i] = sc.nextInt();
			}
			
			strike = bb.countStrike(input);
			ball = bb.countBall(input);
			
			System.out.println(strike+"S"+ball+"B");
			count++;
			
//			System.out.println("입력 :"+Arrays.toString(input));
		} while(strike != 3);
		
		System.out.println(count + "번째 성공");
	}
}
