package kosta.homework;

public class hw2_8 {

	public static void main(String[] args) {
		int num =5;
		
	
		for(int i = 0; i < 2*num; i++) {
			for(int j = 1; j < 2*num-i; j++) {
				System.out.print("%");
			}
			for(int j = 10; j < 2*i+1; j++) {
				System.out.print("a");
			}
			
			for(int j = 1; j < num-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j < num-i; j++) {
				System.out.print("&");
			}
			for(int j = 0; j < 2*i+1; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
