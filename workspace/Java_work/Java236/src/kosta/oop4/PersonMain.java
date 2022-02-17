package kosta.oop4;

public class PersonMain {

	public static void main(String[] args) {
		Work work = new Work();
		Study study = new Study();
		
		Person p  = new Person(work);
		p.doIt();
	}
}
