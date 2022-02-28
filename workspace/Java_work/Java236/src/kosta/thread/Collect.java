package kosta.thread;

public class Collect {
	private int total; //10만원
	
	public void add(Thread t,int amount) {
//		for(int i = 0; i <= 10000; i++) {
//			total += amount;
//			
//			System.out.println(total+"원 기부 되었습니다.");
//			
//			
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			if(total == 10000) {
//				System.out.println("모금 완료");
//				break;
//			}
//		}
		
		if(total >= 100000) {
			try {
				t.stop();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			System.out.println("종료");
		}else {
			total += amount;
		}
		System.out.println("모금 금액 : " + total);
	}
}
