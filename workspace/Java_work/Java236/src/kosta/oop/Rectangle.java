package kosta.oop;

public class Rectangle {
	private int width;
	private int height;
	
	public void getArea() {
		int area = width * height;
		System.out.println(area);
	}
	
	public Rectangle() {
		
	}

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
