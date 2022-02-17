package kosta.shopping;

public class Product {
	private String foodName;
	
	public Product() {
		
	}

	public Product(String foodName) {
		super();
		this.foodName = foodName;
	}
	
	public void show() {
		System.out.println("상품명 :" + foodName);
		
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	
	
}
