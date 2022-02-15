package kosta.oop2;

public class Person {
	private String name;
	private int age;
	private String job;
	
	public Person() {
		
	}
	
	public Person(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("직업 : " + job);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	
}
