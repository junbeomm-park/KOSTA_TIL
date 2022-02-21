package kosta.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExam {
	
	public static void main(String[] args) {
		//GregorianCalendar gc = new GregorianCalendar();
		Calendar gc = Calendar.getInstance();
		//System.out.println(gc);
		
		String now = gc.get(Calendar.YEAR) + "년"
					+ (gc.get(Calendar.MONTH)+1) + "월"
					+ gc.get(Calendar.DATE) + "일"
					+ gc.get(Calendar.HOUR) + "시"
					+ gc.get(Calendar.MINUTE) + "분";
		
		System.out.println("현재시간 : " + now);
		
		
		//100일 기념일은 언제인가 ?
		gc.add(Calendar.DATE, 100);
		
		String future = gc.get(Calendar.YEAR) + "년"
				+ (gc.get(Calendar.MONTH)+1) + "월"
				+ gc.get(Calendar.DATE) + "일"
				+ gc.get(Calendar.HOUR) + "시"
				+ gc.get(Calendar.MINUTE) + "분";
		
		System.out.println("100일 후 : " + future);
		
		gc.set(2021, 11, 25);
		gc.add(Calendar.DATE, 100);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		String str = dateFormat.format(gc.getTime());
		System.out.println(str);
		
		//2022~2030년 까지 자신의 생일 요일을 출력하세요
		//DAY_OF_WEEK : 1(일요일) ~ 7(토요일)
		//2022년 생일은 월요일 입니다.
		//2023년 생일은 화요일 입니다.
		
		char[] week = {'일','월','화','수','목','금','토'};
		
		for(int i = 2022; i <= 2030; i++) {
			gc.set(i, 3, 8);
			char c = week[gc.get(Calendar.DAY_OF_WEEK)-1];
			System.out.println(i+"년의 생일은 "+c+"요일 입니다.");
		}
		
		int n = gc.getActualMaximum(Calendar.DATE);
		System.out.println(n);
		
	}
	
	
	
}
