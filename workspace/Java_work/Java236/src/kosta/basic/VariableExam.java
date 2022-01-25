package kosta.basic;

public class VariableExam {

	public static void main(String[] args) {
		//변수 : 데이터를 담는 그릇
		//데이터형 : 데이터의 종류 10, "10", "안녕", 3.14, 'A', true
		//정수형 : byte, short, int, long
		//실수형 : float, double
		//문자형 : char
		//논리형 : boolean
		//+ 문자열 : String
		
		//변수를 선언
		int num; //메모리 할당
		num = 10; //변수 초기화
		System.out.println("num: " + num);
		
		//변수 선언, 초기화
		int num2 = 100; 
		System.out.println("num2: " + num2);
		
		//기본 리터럴
		//10(int), "안녕"(String), 3.14(double), 'A'(char), true/false(boolean)
		//int, double, char, boolean, String => 각각 선언과 초기화를 출력 해보자
		int i = 1;
		double d = 3.14;
		char c = 'A';
		boolean b = true;
		String s = "문자열";
		
		System.out.println("int : "+ i);
		System.out.println("double : "+ d);
		System.out.println("char : "+ c);
		System.out.println("boolean : "+ b);
		System.out.println("String : "+ s);
		
		//기본형 : 변수 = 실제값, int num = 10;
		//레퍼런스형 : 변수 = 주소값, int arr[] = {1,2,3}; arr => 0X1000
		int arr[] = {1,2,3};
		System.out.println(arr[0] + ", "+arr[1] + ", "+arr[2]);
		
		//형변환(casting)
		//byte < short < int < long < float < double 
		//묵시적 형변환 : 데이터타입 형변환 기준을 통해서 자동으로 형변환 
		//강제 형변환 : 묵시적 형변환이 불가능한 데이터를 강제로 형변환
		
		//큰데이터변수(double) = 작은데이터변수(int) => 문제없음(묵시적 형변환)
		double num3 = 3; //묵시적 형변환 발생
		
		//작은데이터변수(int) = 큰데이터변수(double) => 문제발생(강제 형변환) => 데이터손실
		int num4 = (int)3.14;
		System.out.println("num4 : "+num4);
		
		//float는 뒤에 f, long은 L을 붙여준다
		float num5 = 3.14f;
		long num6 = 100L;
		
		//char,String
		//int <==> char
		char num7 ='A';
		System.out.println((int)num7); //아스키코드값
		
		int num8 = 67;
		System.out.println((char)num8);
		
		//String클래스를 이용해서 문자열을 처리
		String str = new String("abc");
		System.out.println(str);
		String str2 = "ABC";
		System.out.println(str2);
		
		//int <==> String
		//주의사항 : 정수형 문자열이 아니면 NumberFormatException이 발생한다.
		String num9 = "100"; //String => int 변환 => Integer.parseInt(문자열)
		int num10 = Integer.parseInt(num9);
		int result = num10 + 100;
		System.out.println(result);
		
		String str4 = String.valueOf(result); //int => String 변환
		//모든 기본형 데이터형은 String과 연산 후 String으로 변환된다.
		String str5 = result + "";
		
		String str6 = 7 + "7" + 7;
		System.out.println(str6);
		
				
		
	}

}
