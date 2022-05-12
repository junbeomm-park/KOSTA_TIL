package kosta.mission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TestRestaurant implements Restaurant{

	@Autowired
	@Qualifier("parkChef")
	private Chef chef;
	
	public TestRestaurant() {
		
	}

	public TestRestaurant(Chef chef) {
		super();
		this.chef = chef;
	}
	

	public Chef getChef() {
		return chef;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public void insert() {
		System.out.println("레스토랑");
		chef.print();		
	}
	
	
	
	
}
