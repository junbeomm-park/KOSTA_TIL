package kosta.thread;

public class SumMain {

	public static void main(String[] args) {
		//t1 : 1 ~ 50 합을 구하는 스레드
		//t2 : 51 ~ 100 합을 구하는 스레드
		//main : t1합 + t2합 => 총합 : 5050
		
		SumThread t1 = new SumThread(1, 50);
		SumThread t2 = new SumThread(51, 100);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("총합 : " + (t1.getSum() + t2.getSum()));
	}

}
