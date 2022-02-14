package kosta.order;

public class Main {

	public static void main(String[] args) {
		Order[] arr = {
			 new Order(1, "홍길동", "아메리카노", 2000),
			 new Order(2, "박길동", "카페라떼", 2500),
			 new Order(3, "이길동", "카푸치노", 3000)
		};
		
		System.out.println("----주문목록-----");
		for(Order o : arr) {
			o.printOrder();
		}
	}

}
