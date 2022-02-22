package kosta.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalenderExam2 {

	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner sc = new Scanner(System.in);
		Date inDate = null;
		
		System.out.println("날짜를 "+pattern + "의 형태로 입력 해주세요(ex:2022/02/22)");
		
		//2022/02/22(문자열)  =>  Date 변환
		while(sc.hasNextLine()) {
			try {
				inDate = df.parse(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("다시 입력하세요");
			}
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Calendar today = Calendar.getInstance();
		long day = (today.getTimeInMillis() - cal.getTimeInMillis()) / (24*60*60*1000);
		int m = (int) (day/30);
		int year = m/12;
		int month = m%12;
		
		System.out.println("결과: " + year + "년 " + month + "개월");
		
	}

}
