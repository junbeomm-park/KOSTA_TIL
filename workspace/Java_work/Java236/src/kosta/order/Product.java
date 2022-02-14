package kosta.order;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private String p_name;
	private int price;
	
	public Product() {
		
	}
	
	public Product(String p_name, int price) {
		this.p_name = p_name;
		this.price = price;
		
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	
}
