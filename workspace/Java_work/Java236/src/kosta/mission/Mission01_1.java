package kosta.mission;

import java.util.Scanner;

public class Mission01_1 {

	public static void main(String[] args) {
		//1. 성적관리프로그램을 위한 국어, 영어, 수학 변수를 배열을 사용해서 선언과 초기화, 출력
		//2. Scanner를 이용해서 키보드로 부터 값을 입력 받아 사용하기
		//3. 총점과 평균을 출력
		//4. 평균값을 int형으로 변환후 결과를 출력하시오.
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		String[] subject = {"국어","영어","수학"};
		
		for(int i = 0; i<3; i++) {
			System.out.print(subject[i]+ " 입력 : ");
			arr[i] = sc.nextInt();
			arr[3] += arr[i];
		}
		
		arr[4] = (arr[0] + arr[1] + arr[2]) / 3;
		System.out.println("국어\t영어\t수학\t총점\t평균");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		
		
	}

}
