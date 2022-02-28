package kosta.thread;

public class TransferThread extends Thread{
	
	SharedArea sharedArea;
	
	public TransferThread(SharedArea area) {
		this.sharedArea = area;
	}
	
	public void run() {
		for(int i = 0; i < 12; i++) {
			sharedArea.transfer(100);
		}
	}
}
