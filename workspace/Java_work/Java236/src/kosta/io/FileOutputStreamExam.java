package kosta.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamExam {

	public static void main(String[] args) {
		//키보드로 부터 문자열을 입력 받아 파일에 쓰기를 구현하자.
		//"q"를 입력하면 파일쓰기를 종료하도록 하자.
		//String => byte
		//FileOutputStream => 파일 저장(byte)
		//FileInputStream => 파일 읽기(byte)
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = "";
		String poem = "";
		
		
		while(!(str = sc.nextLine()).equals("q")) {
			poem += str;
			poem += "\n";
		}
		
		try {
			out = new FileOutputStream("StreamExam.txt", true);
			in = new FileInputStream("StreamExam.txt");
			
			byte[] arr = poem.getBytes(); //String => byte;
			byte[] arr2 = new byte[256];
			
			out.write(arr);
			
			while(true) {
				int data = in.read(arr2);
				if(data == -1) break;
				System.out.print(new String(arr2));// byte[] => String
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//out.flush();
				out.close();
				in.close();
			} catch (Exception e2) {}
		}
	}
}
