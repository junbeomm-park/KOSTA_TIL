package kosta.oop6;

public class LamdaExam {

	public static void main(String[] args) {
		MyType my1 = new MyType() {
			
			@Override
			public void hello() {
				System.out.println("익명클래스 형식 입니다.");
				
			}
		};
		
		//my1.hello();
		
		//람다식(익명 메소드)
		MyType my2 = () -> {
			System.out.println("람다식 형식");
		};
		
		//my2.hello();
		
		//향상된 람다식
		MyType my3 = () -> System.out.println("향상된 람다식");
		//my3.hello();
		
		YourType you = (String message) -> {
			System.out.println("메시지 : "+ message);
		};
		
		//you.talk("안녕");
		
		//단일매개변수 -> 변수명만 사용 가능
		YourType you2 = message -> System.out.println("메시지 : " + message);
		//you2.talk("hello");
		
		
		//MyNumber 추상메소드 구현(람다식)
		MyNumber mn = (x, y) -> (x > y) ? x : y;
		System.out.println(mn.getMax(10, 20));
		
		//Runnable => 람다식(1~10)
		Runnable r = () -> {
			for(int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(1000);;
				} catch (Exception e) {
					
				}
				System.out.println(i);
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
	}

}
