package kosta.oop;

public class Order {
	private int orderNo;
	private String productName;
	private int count;
	private int price;
	
	public Order() {
		
	}
	
	
	public Order(int orderNo, String productName, int count, int price) {
		this.orderNo = orderNo;
		this.productName = productName;
		this.count = count;
		this.price = price;
	}
	
	public void print() {
		System.out.println("주문번호 : "+orderNo);
		System.out.println("제품이름 : "+productName);
		System.out.println("수량 : "+count);
		System.out.println("가격 : "+price);
		System.out.println("==================");
	}


	public int getOrderNo() {
		return orderNo;
	}


	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
}
