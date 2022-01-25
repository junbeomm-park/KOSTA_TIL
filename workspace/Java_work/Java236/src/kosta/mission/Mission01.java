package kosta.mission;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Mission01 {

	public static void main(String[] args) {
		//1. 성적관리프로그램을 위한 국어, 영어, 수학 변수를 선언과 초기화, 출력
		//2. Scanner를 이용해서 키보드로 부터 값을 입력 받아 사용하기
		//3. 총점과 평균을 출력
		//4. 평균값을 int형으로 변환후 결과를 출력하시오.
		Scanner sc = new Scanner(System.in);
		
		int kor,eng,mat,sum;
		double avg;
		
		
		
		System.out.print("국어 입력 : ");
		//kor = sc.nextInt();
		kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어 입력 : ");
		//eng = sc.nextInt();
		eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학 입력 : ");
		//mat = sc.nextInt();
		mat = Integer.parseInt(sc.nextLine());
		
		//sc.nextLine();
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		
		sum = kor + eng + mat;
		avg = sum / 3.0;
		
		DecimalFormat form = new DecimalFormat("##.##");
		
		
		System.out.println("이름 : "+ name);
		System.out.println("국어 : "+ kor);
		System.out.println("영어 : "+ eng);
		System.out.println("수학 : "+ mat);
		System.out.println("총점 : "+ sum);
		System.out.println("평균 : "+ avg);
		System.out.println("평균 : "+ form.format(avg));
		
		
		
	}

}
