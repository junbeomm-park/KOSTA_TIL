package kosta.homework;

public class hw1_3 {
	
	public static void main(String[] args) {
		int num = 5;
		int count = 0;
		
		for(int i = 0; i < num; i++) {
			
			for(int j = 0; j < num; j++) {
				count = 2*j+1;
				
				if(i > 0) {
					count = count + 10;
				}
				if(i > 1) {
					count = count + 10;
				}
				if(i > 2) {
					count = count + 10;
				}
				if(i > 3) {
					count = count + 10;
				}
				
				System.out.print(count + "\t");
				
			}
			
			System.out.println();
		}
	}
}
