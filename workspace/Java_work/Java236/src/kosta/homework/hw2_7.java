package kosta.homework;

public class hw2_7 {

	public static void main(String[] args) {
		int num = 5;
		
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
			
			for(int j = 0; j < i+9; j++) {
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
