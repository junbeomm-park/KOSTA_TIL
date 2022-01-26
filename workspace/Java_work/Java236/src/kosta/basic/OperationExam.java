package kosta.basic;

public class OperationExam {
	
	public static void main(String[] args) {
		int num = 0;
		//num = num + 1;
		//System.out.println("num : " + num);
		
		//복합대입연산자
		//num += 1;
		//System.out.println("num : "+ num);
		
		//증감자
		//num++;
		//System.out.println("num : "+ num);
		
		//전치증감자 or 후치증감자
		int x = 10;
		int y = 0;
		
		y = x++;
		
		System.out.println("x : "+ x++);
		System.out.println("y : "+ ++y);
		
		int num1 = 0, num2 = 0;
		if(++num1 > 0 || ++num2 > 0) {
			System.out.println("num1이 0보다 크거나 num2가 0보다 큽니다");
		}
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		int a = 20, b = 30, max;
		max = a < b ? a : b;
		System.out.println(max);
		
	}
}
