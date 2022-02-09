package kosta.oop;

public class Board {
	String sub;
	String writer;
	String contents;
	
	//디폴트 생성자
	public Board() {
		
	}
	
	//파라미터(인자)있는 생성자 : 객체 필드를 초기화 하겠다는 강력한 의지
	public Board(String sub, String writer, String contents) {
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
