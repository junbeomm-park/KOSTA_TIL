package kosta.mission;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
		//임의의 정수값에 대해서 전체 자리수 중 짝수, 홀수의 갯수를 구하자
		//5자리 ex)12345
		//짝수의 개수 : 2개
		//홀수의 개수 : 3개
		//삼항연산자(조건연산자), /, %
		
		Scanner sc = new Scanner(System.in);
		System.out.println("5자리 정수 입력 : ");
		
		int num = sc.nextInt();
		int even = 0;
		int odd = 0;
		
		even += (num/10000%2 == 0) ? 1 : 0;
		even += (num/1000%10%2 == 0) ? 1: 0;
		even += (num/100%10%2 == 0) ? 1: 0;
		even += (num/10%10%2 == 0) ? 1: 0;
		even += (num%2 == 0) ? 1: 0;
		
		odd = 5 - even;

		System.out.println("짝수의 개수:"+even);
		System.out.println("홀수의 개수:"+odd);	
		
//		int[] a = {1,2,3,4,5};
//		int even2 = 0;
//		int odd2 = 0;
//		
//		for(int i = 0; i < a.length; i++) {
//			if(a[i] % 2 == 0) {
//				even2++;
//			}else {
//				odd2++;
//			}
//		}
//		
//		System.out.println("짝수의 개수2:"+even2);
//		System.out.println("홀수의 개수2:"+odd2);	
		
		int a = 5; // 윗변
		int b = 10; // 아랫변
		int c = 7;  // 높이
		
		System.out.println((a + b) * c / 2);
		
	}
}
