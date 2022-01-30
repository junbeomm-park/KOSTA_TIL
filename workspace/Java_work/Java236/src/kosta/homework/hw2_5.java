package kosta.homework;

public class hw2_5 {

	public static void main(String[] args) {
		int num = 5;
		
		for(int i = 0; i < num; i++) {
			for(int j = 1; j < num-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <2*i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print(" ");
			}
			for(int k = 7; k >= 2*i+1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
