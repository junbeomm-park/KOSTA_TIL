package kosta.thread;

public class MultiThreadExam02 {

	public static void main(String[] args) {
		Thread thread = new Thread(new RunnableTest());
		thread.start();
		
		char arr[] = {'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ',
					'ㅇ','ㅈ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ',};
		
		for(char ch : arr) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	static class RunnableTest implements Runnable{

		@Override
		public void run() {
			for(char ch = 'a'; ch <= 'z'; ch++) {
				System.out.println(ch);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}

}
