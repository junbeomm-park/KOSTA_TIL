package kosta.homework;

public class hw1_2 {

	public static void main(String[] args) {
		int num = 5;
		int count = 20;
		int result = 0;
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				count++;
				result = count;
				if(i > 1) {
					result = count-10;
				}
				if(i > 2) {
					result = count-20;
				}
				if(i > 3) {
					result = count-30;
				}
				if(i > 4) {
					result = count-40;
				}
				System.out.print(result + "\t");
			}
			System.out.println();
		}
	}

}
