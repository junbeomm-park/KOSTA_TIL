package kosta.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionExam {
	
	public static void add() throws Exception {
		int a = 10;
		int b = 10;
		
		a = a/b; //예외 발생 여부에 따라서 실행 순서를 알아야 한다.
	}
	
	//은행거래로직 => 인출 : 잔액 - 출금 = 잔액 :  잔액 < 출금 => 인출X => 인위적으로 예외를 발생 throw
	
	public static void multi() throws Exception {
		int a = 10;
		int b = 10;
		
		if(a == b) {
			throw new Exception("같은 값");
		}
	}
	public static void main(String[] args) {
		
		Thread t = new Thread();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		try {
//			multi();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("Done!!!!");
		
//		try {
//			System.out.println("a");
//			add();
//			System.out.println("b"); // add() 에서 예외가 발생하므로 catch 절로 이동 (출력X)
//		} catch (Exception e) {
//			System.out.println("c");
//			//e.printStackTrace();
//		} finally {
//			System.out.println("d");
//		}
//		
//		
//		System.out.println("Done!!!!");
	}
}
