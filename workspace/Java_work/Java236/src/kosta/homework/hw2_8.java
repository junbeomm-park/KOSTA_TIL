package kosta.homework;

public class hw2_8 {

	public static void main(String[] args) {
		int num =5;
		
	
		for(int i = 0; i < num; i++) {
			
			
			for(int j = 0; j < 4*num - 2 - i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < ((i+1) * 2) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0 ; i < num ; i++) {
			for(int j = 1; j < num-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			
			for(int j = 1; j < num-i; j++) { // 공백
				System.out.print(" ");
			}
			
			for(int j = 1; j < num-i ; j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < i+11; j++) {
				System.out.print("*");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			for(int j = 1; j < num-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j < num-i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			
			
			
			System.out.println();
		}
	}

}
