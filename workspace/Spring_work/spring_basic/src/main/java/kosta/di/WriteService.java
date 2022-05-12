package kosta.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@org.springframework.stereotype.Service
public class WriteService implements Service {
	
	@Autowired
	@Qualifier("mySQLDao")
	private Dao dao;
	
	public WriteService() {
		
	}
	
	public WriteService(Dao dao) {
		super();
		this.dao = dao;
	}

	public void insert() {
		System.out.print("WriteService insert 호출2");
		dao.insertBoard();
	}

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}
	

}
