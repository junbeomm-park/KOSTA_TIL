package kosta.basic;

public class MethodExam {
	
	//메소드
	//접근제어자 (static) 리턴형(void) 메소드이름(파라미터(매개변수)) {
	//           메소드 구현 내용
	//   }
	
	public static void printCharacter(char ch, int num) {
		//문자를 여러개 출력
		for(int i = 1; i <= num; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	//메소드 호출시 반드시 파라미터 내용을 확인해야 한다.
	//메소드 호출시 반드시 리턴형도 확인해야 한다.
	//메소드는 크게 리턴형이 있는 메스도와 없는 메소드로 나뉜다.
	
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("sum : " + sum);
		
		return sum;
	}
	
	public static void main(String[] args) {
		printCharacter('!', 30); //메소드 호출
		printCharacter('$', 25);
		System.out.println("문자열 출력");
		printCharacter('*', 50);
		
		int total = add(10, 20);
		int aver = total/2;
		
	}

}
