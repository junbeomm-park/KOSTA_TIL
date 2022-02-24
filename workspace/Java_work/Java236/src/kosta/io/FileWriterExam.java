package kosta.io;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterExam {

	public static void main(String[] args) {
		//키보드로 부터 문자열을 입력 받아 파일에 쓰기를 구현하자.
		//"q"를 입력하면 파일쓰기를 종료하도록 하자.
		//FileWriter : writer(String str)
		//반드시 close()
		//프로젝트로 리플레쉬
		
		FileWriter writer = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = "";
		String poem = "";
		
		while(!(str = sc.nextLine()).equals("q")) {
			poem += str;
			poem += "\n";
		}
		
		try {
			
			writer = new FileWriter("writerExam.txt");
			writer.write(poem);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
