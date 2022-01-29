package kosta.homework;

public class hw1_2 {

	public static void main(String[] args) {
		int num = 5;
		int count = 1;
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				System.out.print(count++ + "\t");
			}
			System.out.println();
		}
	}

}
