package kosta.shoping;

public class Main {
	
	public static void main(String[] args) {
//		Product p1 = new Product("삼겹살");
//		Product p2 = new Product("소고기");
//		Product p3 = new Product("쌈장");
		
		Product[] parr = {
				new Product("삼겹살"),
				new Product("소고기"),
				new Product("쌈장")
		};
		
		Member m1 = new Member("홍길동",16);
		Member m2 = new Member("박길동",38);
		
		m1.register(parr[0]);
		m2.register(parr[1]);
		
		m1.register(parr[1]);
		m2.register(parr[2]);
		
		m1.show();
		m2.show();
	}
}
