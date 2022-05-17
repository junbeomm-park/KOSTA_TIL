package kosta.model;

import java.io.Serializable;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

public class Board implements Serializable{

	private int seq;
	
	@NotEmpty(message = "반드시 입력하세요")
	@Size(min = 2, max = 5, message = "글자수 2~5까지")
	private String title;
	
	@Pattern(regexp = "[0-9a-zA-Z가-힣]*", message = "특수문자 금지")
	private String writer;
	
	private String contents;
	private String regdate;
	private int hitcount;
	
	private String fname;
	private MultipartFile uploadFile;
	
	public Board() {
		
	}

	public Board(int seq, String title, String writer, String contents, String regdate, int hitcount, String fname,
			MultipartFile uploadFile) {
		super();
		this.seq = seq;
		this.title = title;
		this.writer = writer;
		this.contents = contents;
		this.regdate = regdate;
		this.hitcount = hitcount;
		this.fname = fname;
		this.uploadFile = uploadFile;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getHitcount() {
		return hitcount;
	}

	public void setHitcount(int hitcount) {
		this.hitcount = hitcount;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public MultipartFile getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}

	@Override
	public String toString() {
		return "Board [seq=" + seq + ", title=" + title + ", writer=" + writer + ", contents=" + contents + ", regdate="
				+ regdate + ", hitcount=" + hitcount + ", fname=" + fname + ", uploadFile=" + uploadFile + "]";
	}

	
	
}
