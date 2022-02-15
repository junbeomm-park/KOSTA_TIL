package kosta.oop2;

public class MinusMain {

	public static void main(String[] args) {
		MinusAccount ma = new MinusAccount("111-111","박길동",5000,10000);
		
		try {
			ma.withdraw(12000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		ma.print();
	}

}
