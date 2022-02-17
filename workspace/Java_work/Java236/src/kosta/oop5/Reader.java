package kosta.oop5;

public class Reader extends Man implements Speakable {
	String name;
	
	
	public Reader(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public String speak() {
		return getName()+"자바 화이팅";
	}

	

}
