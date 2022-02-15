package kosta.order;

public class Order {
	private int orderNo;
	private String orderName;
	private Product p;
	
	public Order() {
		
	}
	
	public Order(int orderNo, String orderName, String p_name, int price) {
		this.orderNo = orderNo;
		this.orderName = orderName;
		p = new Product(p_name, price);
		
	}
	
	public void printOrder() {
		System.out.println("주문번호 : " + orderNo);
		System.out.println("주문자 : " + orderName);
		System.out.println("상품이름 : " + p.getP_name());
		System.out.println("상품가격 : " + p.getPrice());
		System.out.println("==================");
	}
	
	
	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	
	
	
}
