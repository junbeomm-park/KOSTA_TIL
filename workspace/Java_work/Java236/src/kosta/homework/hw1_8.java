package kosta.homework;

public class hw1_8 {

	public static void main(String[] args) {
		int num = 5;
		for(int i = 0; i < num; i++) {
			for(int j = i+1; j <= i+num; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
