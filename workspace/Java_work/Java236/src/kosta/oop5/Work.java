package kosta.oop5;

public class Work extends Man implements Speakable {
	
	
	public Work(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public String speak() {
		return getName()+"열심히 일해야 한다.";
	}

}
