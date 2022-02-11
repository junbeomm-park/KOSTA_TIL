package kosta.video;

public class Video {
	private String videoNo;
	private String title;
	private String actor;
	
	public Video() {
		
	}
	
	public Video(String videoNo, String title, String actor) {
		super();
		this.videoNo = videoNo;
		this.title = title;
		this.actor = actor;
	}
	
	public void print() {
		System.out.println("회원이 대여한 비디오 번호 : " + videoNo);
		System.out.println("회원이 대여한 비디오 제목 : " + title);
		System.out.println("회원이 대여한 비디오 주인공 : " + actor);
	}

	public String getVideoNo() {
		return videoNo;
	}

	public void setVideoNo(String videoNo) {
		this.videoNo = videoNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}
	
	
	
}
