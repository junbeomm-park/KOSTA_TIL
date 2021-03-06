package kosta.oop4;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);;
			} catch (Exception e) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		MyThread t = new MyThread();
		Thread t2 = new Thread(t);
		t2.start();
		
		for(int i = 11; i <= 20; i++) {
			try {
				Thread.sleep(1000);;
			} catch (Exception e) {
				System.out.println(i);
			}
		}
	}

}
