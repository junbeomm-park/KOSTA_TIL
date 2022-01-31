package kosta.homework;

public class hw2_6 {
	public static void main(String[] args) {
		int num = 5;
		
		for(int i = 0 ; i < num; i++) {
			for(int j = 1; j < num-i; j++) { // 삼각형
				System.out.print(" ");
			}
			for(int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			
			
			
			for(int j = 1; j < num-i; j++) { // 공백
				System.out.print(" ");
			}
			
			
			for(int j = 1; j < num-i; j++) { // 삼각형
				System.out.print(" ");
			}
			for(int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < i+1; j++) {  // 삼각형
				System.out.print(" ");
			}
			for(int k = 7; k >= 2*i+1; k--) {
				System.out.print("*");
			}
			
			for(int j = 1; j < i+2; j++) {  // 공백
				System.out.print(" ");
			}
			
			for(int j = 0; j < i+1; j++) { // 삼각형
				System.out.print(" ");
			}
			for(int k = 7; k >= 2*i+1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
