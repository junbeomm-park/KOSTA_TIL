package kosta.relation2;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동");
		Student s2 = new Student("박길동");
		Student s3 = new Student("김길동");
		
		Course c1 = new Course("전산학개론");
		Course c2 = new Course("빅데이터개론");
		
		Transcript t1 = new Transcript(s1, c1, "2022", "A++");
		Transcript t2 = new Transcript(s1, c2, "2022", "A");
		Transcript t3 = new Transcript(s2, c2, "2022", "B++");
		
		
		List<Student> students = c1.getStudents(); //전산학개론을 응시한 사람의 전과목시험 결과
		for(Student s : students) {
			System.out.println(s.getName());
			List<Transcript> transcripts = s.getTranscripts();
			for(Transcript t : transcripts) {
				System.out.println("과목명 : " + t.getCourse().getName());
				System.out.println("날짜 : " + t.getDate());
				System.out.println("학점 : " + t.getGrade());
			}
		}
		
		System.out.println("====================");
		
		List<Course> courses = s1.getCourses();//홍길동이라는 사람의 시험 결과
		for(Course c : courses) {
			System.out.println("과목명 : "+c.getName());
			List<Transcript> transcripts = c.getTranscripts();
			for(Transcript t : transcripts) {
				System.out.println("학생 : " + t.getStudent().getName());
				System.out.println("날짜 : " + t.getDate());
				System.out.println("학점 : " + t.getGrade());
			}
		}
		
		
	}
}
