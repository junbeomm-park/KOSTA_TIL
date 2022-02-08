package kosta.oop;

public class Order {
	int orderNo;
	String productName;
	int count;
	int price;
	
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
}
