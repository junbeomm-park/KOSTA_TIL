package kosta.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Member implements Serializable{

	@NotEmpty(message = "반드시 입력하세요")
	@Size(min = 2, max = 5, message = "글자수 2~5까지")
	private String id;
	
	@NotEmpty(message = "반드시 입력하세요")
	@Size(min = 2, max = 10, message = "글자수 2~10까지")
	private String pass;
	
	@NotEmpty(message = "반드시 입력하세요")
	@Size(min = 2, max = 10, message = "글자수 2~10까지")
	private String name;
	
	@Pattern(regexp = "^[a-zA-Z0-9+-\\_.]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$", message = "이메일 형식 오류 ex) aaaa@aaa.com 형식으로 입력하세요")
	private String email;
	
	//@Pattern(regexp = "[0-9]*", message = "숫자만입력")
	private int age;
	
	public Member() {
		
	}

	public Member(String id, String pass, String name, String email, int age) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.email = email;
		this.age = age;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pass=" + pass + ", name=" + name + ", email=" + email + ", age=" + age + "]";
	}

	
	
	
}
