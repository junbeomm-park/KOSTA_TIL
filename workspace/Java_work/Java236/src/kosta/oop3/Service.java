package kosta.oop3;

public class Service {
	DAO dao;
	
	public Service() {
		
	}
	
	public Service(DAO dao) {
		super();
		this.dao = dao;
	}
	
	public void insertService() {
		dao.insert();
	}
}
