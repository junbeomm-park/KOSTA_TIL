package kosta.thread;

public class DonateMain {

	public static void main(String[] args) {
		//Donator => 1000원씩 기부 => 10만원 까지 모금
		//총 모금액이 10만원 초과X
		Collect c = new Collect();
		
		for(int i = 0; i < 2000; i++) {
			Donator d = new Donator(1000, c);
			d.start();
		}
	}

}
