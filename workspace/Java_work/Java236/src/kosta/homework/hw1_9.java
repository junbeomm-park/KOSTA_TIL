package kosta.homework;

public class hw1_9 {

	public static void main(String[] args) {
		int num = 5;
		int count = 0;
		
		for(int i = 0; i < num; i++) {
			for(int j = i+1; j <= i+num; j++) {
				count = j;
				if(j > 5) {
					count = j-5;
				}
				System.out.print(count);
			}
			System.out.println();
		}
	}

}
