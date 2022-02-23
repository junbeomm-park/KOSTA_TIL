package kosta.data;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class QueueMain {
	
	static Scanner sc = new Scanner(System.in);
	static int totalSales = 0;//전체 총액
	
	
	public static void addMenu(LinkedList<Order> list) {
		System.out.print("요리명 : ");
		String foodName = sc.nextLine();
		System.out.print("가격 : ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print("수량 : ");
		int amount = Integer.parseInt(sc.nextLine());
		
		list.offer(new Order(new Food(foodName, price), amount));
		
	}
	
	public static void menuService(LinkedList<Order> list) {
		if(!list.isEmpty()) {
			Order order = list.poll();
			order.show();
			totalSales += order.getTotal();
		}
		
//		while(!list.isEmpty()) {
//			Order str = list.poll();
//			str.show();
//			totalSales += str.getTotal();
//		}
	}

	public static void main(String[] args) {
		LinkedList<Order> list = new LinkedList<Order>();
		
		while(true) {
			System.out.println("1. 주문   2. 주문처리완료   3.매출총액");
			System.out.print("선택 : ");
			String menu = sc.nextLine();
			
			switch (menu) {
			case "1":
				addMenu(list);
				System.out.println("주문완료");
				break;
			case "2":
				menuService(list);
				break;
			case "3":
				System.out.println("매출 총액 : " + totalSales);
				break;

			}
		}
	}
}
