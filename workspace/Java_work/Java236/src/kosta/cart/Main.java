package kosta.cart;

import java.util.Scanner;

public class Main {
	
	public static void showProduct(Product[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i].show();
		}
	}
	
	public static Product getProduct(int no, Product arr[]) {
		Product p = null;
		for(int i = 0; i < arr.length; i++) {
			if(no == arr[i].getNo()) {
				p = arr[i];
				break;
			}
		}
		
		return p;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cart cart = new Cart();
		
		Product arr[] = {
				new Phone(1, "갤럭시22", 1000000, false),
				new Phone(2, "갤럭시플립2", 1500000, true),
				new NoteBook(3, "그램17", 2000000, true)
		};
		
		while(true) {
			showProduct(arr); //상품목록 출력
			
			System.out.println("1.장바구니 추가  2.장바구니 목록  3.종료");
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				System.out.print("상품선택 : ");
				int no = sc.nextInt();
				Product p = getProduct(no, arr);
				cart.addCart(p);
				System.out.println("장바구니 추가완료");
				
				break;
			case 2:
				cart.orderList();
				break;
			case 3:
				System.out.println("종료");
				return;

			
			}
		}
	}
}
