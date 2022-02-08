package kosta.oop;

import java.util.Scanner;

public class OrderMain {

	public static void main(String[] args) {
		
		Order arr[] = new Order[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("주문번호 입력 :");
			int orderNo = sc.nextInt();
			
			sc.nextLine();
			System.out.print("제품이름 입력 :");
			String productName = sc.nextLine();
			
			System.out.print("수량 입력 :");
			int count = sc.nextInt();
			
			System.out.print("가격 입력 :");
			int price = sc.nextInt();
			
			arr[i] = new Order(orderNo, productName, count, price);
		}
		
		System.out.println("--------주문 목록--------");
		for(Order o : arr) {
			o.print();
		}
		 
		
	}
}
