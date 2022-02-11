package kosta.relation2;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private List<Transcript> transcripts;
	
	public Student() {
		
	}

	public Student(String name) {
		super();
		this.name = name;
		transcripts = new ArrayList<Transcript>();
	}
	
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}
	
	public List<Course> getCourses() {
		List<Course> course = new ArrayList<Course>();
		for(Transcript transcript : transcripts) {
			course.add(transcript.getCourse());
		}
		return course;
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
