package kosta.relation2;

import java.util.ArrayList;
import java.util.List;


public class Course {// 수강 과목 관련 내용
	private String name;//과목명
	private List<Transcript> transcripts;
	
	public Course() {
		
	}

	public Course(String name) {
		super();
		this.name = name;
		transcripts = new ArrayList<Transcript>();
	}
	
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}
	
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<Student>();
		for(Transcript transcript : transcripts) {
			students.add(transcript.getStudent());
		}
		return students;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Transcript> getTranscripts() {
		return transcripts;
	}

	public void setTranscripts(List<Transcript> transcripts) {
		this.transcripts = transcripts;
	}
	
	
	
	
}
