package kosta.relation1;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private List<Course> courses; //학생이 수강신청 과목들
	
	public Student() {
		
	}
	
	public Student(String name) {
		this.name = name;
		courses = new ArrayList<Course>();
	}
	
	public void register(Course course) {
		courses.add(course);//학생이 수강과목을 등록
		course.addStudent(this);//수강과목에 학생을 등록
	}
	
	public void dropCourse(Course course) {
		if(courses.contains(course)) {
			courses.remove(course);
			course.removeStudent(this);
		}
	}
	
	public void printMember() {
		System.out.println("학생 이름 : " + name);
		for(Course course : courses ) {
			System.out.println("수강 과목 : " + course.getTitle());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getSub() {
		return courses;
	}

	public void setSub(List<Course> courses) {
		this.courses = courses;
	}
	
	
	
}
