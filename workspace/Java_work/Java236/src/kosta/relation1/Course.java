package kosta.relation1;

import java.util.ArrayList;
import java.util.List;

public class Course {// 수강 과목 관련 내용
	private String title;//과목명
	private List<Student> students;//수강신청한 학생명단
	
	public Course() {
		
	}

	public Course(String title) {
		super();
		this.title = title;
		students = new ArrayList<Student>();
	}
	
	public void addStudent(Student student) {
		students.add(student);
		
	}
	
	public void removeStudent(Student student) {
		students.remove(student);
	}
	
	public void printCourse() {
		System.out.println("과목명 :"+title);
		for(Student student : students) {
			System.out.println("학생명 : "+ student.getName());
		}
	}
	
	public void show() {
		System.out.println("과목명 :"+title);
	}

	public String getTitle() {
		return title;
	}

	public void setSub(String sub) {
		this.title = sub;
	}
	
}
