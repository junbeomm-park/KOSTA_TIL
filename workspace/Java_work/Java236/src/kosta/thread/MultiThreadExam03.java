package kosta.thread;

public class MultiThreadExam03 {

	public static void main(String[] args) {
		SharedArea area = new SharedArea();
		area.account1 = new Account("111-111", "이몽룡", 2000000);
		area.account2 = new Account("222-222", "성춘향", 1000000);
		
		TransferThread thread1 = new TransferThread(area);
		PrintThread thread2 = new PrintThread(area);
		thread1.start();
		thread2.start();
	}

}
