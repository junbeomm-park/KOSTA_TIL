package kosta.thread;

public class PrintThread extends Thread{

	SharedArea sharedArea;
	
	public PrintThread(SharedArea area) {
		this.sharedArea = area;
	}
	
	public void run() {
		for(int i = 0; i < 3; i++) {
			int sum = sharedArea.getTotal();
			System.out.println("계좌 잔액 합계 : " + sum);
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
		

}
