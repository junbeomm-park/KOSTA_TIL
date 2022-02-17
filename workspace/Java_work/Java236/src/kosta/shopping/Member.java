package kosta.shopping;

import java.util.ArrayList;
import java.util.List;

public class Member {
	private String name;
	private int age;
	private List<Product> products;
	
	public Member() {
		
	}
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		products = new ArrayList<Product>();
	}
	
	public void register(Product product) {
		products.add(product);
	}
	
	public void dropProduct(Product product) {
		if(products.contains(product)) {
			products.remove(product);
		}
	}
	
	public void show() {
		System.out.println("회원 이름 :" + name);
		System.out.println("회원 나이 :" + age);
		for(Product product : products) {
			System.out.println("구매한 목록 : " + product.getFoodName());
		}
		System.out.println("=============");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	
	
}
