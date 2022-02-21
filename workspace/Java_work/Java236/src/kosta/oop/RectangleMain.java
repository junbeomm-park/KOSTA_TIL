package kosta.oop;

public class RectangleMain {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 10);
		Rectangle r2 = new Rectangle(5, 20);
		
		if(r1.equals(r2)) {
			System.out.println("넓이가 같다");
		}else {
			System.out.println("다르다");
		}
	}

}
