package kosta.oop2;

public class PersonMain {

	public static void main(String[] args) {
		//Work work = new Work();
		//Study study = new Study();
		//Driver driver = new Driver();
		Person p = new Person("홍길동", new Role() {
			
			@Override
			public void doing() {
				System.out.println("Driver 출력");
			}
		});
		p.doIt();
		
	}
}
