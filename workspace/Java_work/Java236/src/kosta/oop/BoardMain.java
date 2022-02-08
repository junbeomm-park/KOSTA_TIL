package kosta.oop;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		Board arr[] = new Board[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("글제목을 입력하세요 : ");
			String sub = sc.nextLine();
			
			System.out.print("작성자를 입력하세요 : ");
			String writer = sc.nextLine();
			
			System.out.print("글내용을 입력하세요 : ");
			String contents = sc.nextLine();
			
			arr[i] = new Board();
			arr[i].addBoard(sub, writer, contents);
			
			
		}
		System.out.println("---------글 목록----------");
		
		for(Board b : arr) {
			b.print();
		}
	}
}
