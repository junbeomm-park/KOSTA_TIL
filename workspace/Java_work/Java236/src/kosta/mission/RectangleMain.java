package kosta.mission;

import kosta.oop.Rectangle;

public class RectangleMain {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(10,20);
		
		
		r.square();
		System.out.println("넓이 :"+r.getArea());
		
	}

}
