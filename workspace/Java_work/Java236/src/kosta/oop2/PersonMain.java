package kosta.oop2;

public class PersonMain {

	public static void main(String[] args) {
		//Work work = new Work();
		//Study study = new Study();
		Driver driver = new Driver();
		Person p = new Person("홍길동", driver);
		p.doIt();
		
	}
}
