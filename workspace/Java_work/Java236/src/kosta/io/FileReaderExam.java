package kosta.io;

import java.io.FileReader;
import java.util.Arrays;

public class FileReaderExam {

	public static void main(String[] args) {
		//파일에 있는 문자데이터를 읽기
		FileReader reader = null;
		char arr[] = new char[10];
		
		try {
			//파일열기(스트림 생성)
			reader = new FileReader("poem.txt");
			
			//배열크기만큼 읽기
			while(true) {
				Arrays.fill(arr, ' ');
				int data = reader.read(arr);
				if(data == -1) break;
				System.out.print(arr);
			}
			
			//데이터 읽기 : read() : int => 없으면 -1리턴
//			while(true) {
//				int data = reader.read();
//				if(data == -1) break;
//				System.out.print((char)data);
//			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//파일 닫기
			try {
				reader.close();
			} catch (Exception e2) {}
		}
	
	}
}
