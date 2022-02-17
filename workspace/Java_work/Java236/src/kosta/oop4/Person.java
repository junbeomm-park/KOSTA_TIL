package kosta.oop4;

public class Person {
	private Role role;
	
	public Person(Role role) {
		super();
		this.role = role;
	}
	
	public void doIt() {
		role.doing();
	}
}
