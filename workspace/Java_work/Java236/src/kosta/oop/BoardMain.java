package kosta.oop;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		//배열을 이용해서 객체를 보관
		Board arr[] = new Board[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("제목 : ");
			String sub = sc.nextLine();
			System.out.print("작성자 : ");
			String writer = sc.nextLine();
			System.out.print("내용 : ");
			String contents = sc.nextLine();
			
			arr[i] = new Board(sub, writer, contents);
		}
		
		for(Board b : arr) {
			b.print();
		}
	}
}
