package kosta.api;

import java.util.Calendar;
import java.util.Scanner;

public class CalenderMission {

	public static void main(String[] args) {
		// 2022년 2월 달력 만들기
		//월 입력 : 2
		//<2022 2월>
		Scanner sc = new Scanner(System.in);
		Calendar gc = Calendar.getInstance();
		int month = sc.nextInt();
		gc.set(2022, month-1, 1);
		int week = gc.get(Calendar.DAY_OF_WEEK); // 1~7
		int day = gc.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		int count = 0;
		
		System.out.println("<2022년 "+month+"월>");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i = 1; i < week; i++) {
			System.out.print("\t");
		}
		
		for(int i = 1; i <= day; i++) {
			System.out.print(i+"\t");
			if((week + i -1)%7 == 0) {
				System.out.println();
			}
		}
	}
}
