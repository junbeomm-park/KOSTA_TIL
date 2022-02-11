package kosta.baseball;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class BaseBallGame {
	
	public static void main(String[] args) {
		BaseballRandom b = new BaseballRandom();
		Scanner sc = new Scanner(System.in);
		int[] ranarr = new int[3];
		int[] user = new int[3];
		int count = 0;
		
		
		//1. 중복되지 않는 1-9 난수 3개를 구한다. 
		b.random();
		for (int i = 0; i < ranarr.length; i++) {
			ranarr[i] = ((int)(Math.random() * 9) + 1);
			for (int j = 0; j < i; j++) {
				if (ranarr[i] == ranarr[j]) {
					i--;
				}
			}
			
		}
		for(int i = 0; i < ranarr.length; i++) {
			System.out.print(ranarr[i]);
		}
		
		System.out.println();
		
		//3. 스트라이크 볼의 갯수 체크
		while(true) {
			int st = 0;
			int ball = 0;
			
			//2.키보드로 부터 3개의 숫자를 입력
			System.out.print("숫자입력 :");
			for(int i = 0; i < user.length; i++) {
				user[i] = sc.nextInt();
			}
			
			for(int i = 0; i < ranarr.length; i++) {
				for(int j = 0; j < user.length; j++) {
					if(ranarr[i] == user[j] && i == j) {
						st++;
					}else if(ranarr[i] == user[j] && i != j) {
						ball++;
					}
				}
			}
			
			count++;
			System.out.println(st+"S"+ball+"B");
			
//			b.input();
			
			//4.출력
			if(st == 3) {
				System.out.println("게임 종료" + count + "번째 성공 !!");
				return;
			}
			
			
//			b.print();
			
			
			
		}
	}
}
