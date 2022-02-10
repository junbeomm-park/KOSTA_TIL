package kosta.baseball;

import java.util.Scanner;

public class BaseballRandom {
	Scanner sc = new Scanner(System.in);
	int[] ranarr = new int[3];
	int[] user = new int[3];
	int st = 0;
	int ball =0;
	int count = 0;
	
	public void random() {
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
	}
	
	public void input() {
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
	}
	
	public void print() {
		if(st == 3) {
		System.out.println("게임 종료" + count + "번째 성공 !!");
			return;
		}
	}
}
