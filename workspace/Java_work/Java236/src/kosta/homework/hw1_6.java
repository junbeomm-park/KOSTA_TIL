package kosta.homework;

public class hw1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num-i+1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
