package kosta.video;

public class Main {

	public static void main(String[] args) {
		GeneralMember m1 = new GeneralMember("aaa", "홍길동", "동탄");
		GeneralMember m2 = new GeneralMember("bbb", "김철수", "서울");
		Video v1 = new Video(1,"트랜스포머3","서봉수");
		Video v2 = new Video(2,"쿵푸팬더2","지성민");
		
		m1.print();
		v1.print();
		
		
		m2.print();
		v2.print();
		
		
	}

}
