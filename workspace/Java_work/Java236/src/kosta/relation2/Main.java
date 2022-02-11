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
		
		
		//전산학개론을 응시한 시험 성적
		System.out.println("과목명 : " + c1.getName());
		for(Transcript t : c1.getTranscripts()) {
			System.out.println("이름 : " + t.getStudent().getName());
			System.out.println("날짜 : " + t.getDate());
			System.out.println("학점 : " + t.getGrade());
		}
		
		System.out.println("=================================");
		
		//홍길동이 응시한 과목에 대한 전체 성적
		System.out.println("이름 : " + s1.getName());
		for(Transcript t : s1.getTranscripts()) {
			System.out.println("과목명 : " + t.getCourse().getName());
			System.out.println("날짜 : " + t.getDate());
			System.out.println("학점 : " + t.getGrade());
		}
		
	}
}
