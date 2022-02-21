package kosta.api;

import java.util.Arrays;

public class StringExam {

	public static void main(String[] args) {
		//1. String클래스 생성 방법 및 차이점
		String str  = "ABC";
		String str2 = "DEF";
		//String str2 = new String("ABC");
		
//		if(str == str2) {
//			System.out.println("주소값 같다.");
//		}else {
//			System.out.println("주소값 다르다.");
//		}
		
		//2. String클래스의 특성 (불변성) <=> StringBuffer, StringBuilder(가변성)
		String str3 = str.concat(str2);
		//System.out.println(str3);
		//String은 + 연산자를 통해서 변경할 수 있다.
		String sql = "select * from board ";
		int num = 10;
		
		if(num == 10) {
			sql += "where num = 10";
		}
		//System.out.println(sql);
		
		//StringBuffer, StringBuilder (가변성)
		StringBuffer sb = new StringBuffer("가나다");
		sb.append("라마바");
		//System.out.println(sb);
		
		
		//해당 문자열의 위치를 파악 => indexOf("문자열") => 해당 문자열의 인덱스, 없으면 => -1를 리턴
		System.out.println(sql.indexOf("*"));
		
		//문자열 길이
		System.out.println(sql.length());
		
		//인덱스에 해당하는 문자 출력 => charAt(인덱스) : char
		System.out.println(sql.charAt(7));
		
		//charAt() 이용해서 모든 문자를 출력
		for(int i = 0; i < sql.length(); i++) {
			System.out.print(sql.charAt(i));
		}
		
		System.out.println(sql);
		//문자열 부분 추출 : subString(5) , subString(5, 10);
		//퀴즈 > sql변수에서 "board" 문자열만 추출해 보자.
		System.out.println(sql.substring(sql.indexOf("board"), sql.indexOf("board")+5));
		
		
		//퀴즈 > fileName = kosta.jpg를 head와 pattern 으로 나눠보자
		String fileName = "kosta.jpg";
		String head = "";
		String pattern = "";
		
		head = fileName.substring(0,fileName.indexOf("."));
		pattern = fileName.substring(fileName.indexOf(".")+1);
		
//		for(int i = 0; i < fileName.length(); i++) {
//			head = fileName.substring(fileName.indexOf("kosta"), fileName.indexOf("kosta")+5);
//			pattern = fileName.substring(fileName.indexOf("jpg"), fileName.indexOf("jpg")+3);
//		}
		
		System.out.println(head + " : " + pattern);
		
		if(fileName.endsWith("jpg")) { //startsWith("문자열")
			System.out.println("이미지 파일");
		}
		
		String id = "kosta";
		String m_id = "Kosta ";
		m_id = m_id.toLowerCase();//소문자로 수정 <=> toUpperCase() : 대문자로 변경
		
		if(id.equals(m_id.trim())) {
			System.out.println("일치");
		}else {
			System.out.println("불일치");
		}
		
		//문자열 => 배열로 변환
		String fruits = "사과 포도 수박 배";
		String arr[] = fruits.split(" ");
		System.out.println(Arrays.toString(arr));
		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		//concat(), indexOf(), charAt(), length(), subString(), startsWith(), endsWith()
		//toUpperCase(), toLowerCase(), equals(), trim(), split()
		//valueOf() => 문자열로 변환
		int n = 10;
		//String s = String.valueOf(n);//int => String
		String s = n + "";
		
	}

}
