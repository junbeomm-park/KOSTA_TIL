package kosta.homework;

public class hw1_3 {
	
	public static void main(String[] args) {
		int num = 5;
		int count = 1;
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				count = 2*j+1;
			
				System.out.print(count + "\t");
			}
			System.out.println();
		}
	}
}
