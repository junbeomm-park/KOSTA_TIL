package kosta.oop;

public class BookMain {

	public static void main(String[] args) {
		int total = 0;
		
		Book arr[] = {
				new Book("Java", 30000),
				new Book("JSP", 20000),
				new Book("Oracle", 15000),
		};
		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i].discount();
//			arr[i].print();
//			total += arr[i].dc_price;
//		}
		for(Book b : arr) {
			b.discount();
			b.print();
			total += b.dc_price;
		}
		System.out.println("총금액 :"+total);
	}
}
