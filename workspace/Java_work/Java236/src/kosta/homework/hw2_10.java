package kosta.homework;

public class hw2_10 {

	public static void main(String[] args) {
		int num = 5;
		
		
		System.out.println("*");
		System.out.println("**");
		for(int i = 3; i <= num+2; i++) {
			for(int j = 1; j <= i; j++) {
				if(i == 1 || j== i || j == 1) {
					System.out.print("*");
				}else {
					System.out.print("@");
				}
			}
			System.out.println();
		}
		
		for(int i = num+1 ; i >= 2; i--) {
			for(int j = 1; j <= i; j++) {
				if(i == 1 || j== i || j == 1) {
					System.out.print("*");
				}else {
					System.out.print("@");
				}
			}
			System.out.println();
		}
		System.out.println("*");
	}

}
