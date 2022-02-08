package kosta.oop;

public class Board {
	String sub;
	String writer;
	String contents;
	
	public void addBoard(String sub, String writer, String contents) {
		this.sub = sub;
		this.writer = writer;
		this.contents = contents;
	}
	
	public void print() {
		System.out.println("글제목 : "+sub);
		System.out.println("작성자 : "+writer);
		System.out.println("글내용 : "+contents);
		System.out.println("==================");
	}
}
