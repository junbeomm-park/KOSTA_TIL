package kosta.mission;

public class Mission6 {

	public static void main(String[] args) {
		//성적관리프로그램에서 여러명의 점수를 구현하자.
		//번호 국어 영어 수학 총점 평균
		// 1  90  98  91
		// 2  21  45  43
		//====================
		//과목별 평균 구하기
		int[][] score = {
				{90,98,91},
				{21,45,43},
				{60,70,42},
				{88,66,44},
				{98,76,32}
		};// new int[5][3]
		//과목별 총점
		int korTotal = 0, engTotal = 0, matTotal = 0;
		int korAvg = 0, engAvg = 0, matAvg =0;
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("================================================");
		for(int i = 0; i < score.length; i++) { //1차원 배열 크기
			int sum = 0; //개인별 총점
			double avg = 0; //개인별 평균
			
			//과목별 총합
			korTotal += score[i][0];
			engTotal += score[i][1];
			matTotal += score[i][2];
			
			System.out.print((i+1)+"\t"); // 번호
			
			for(int j = 0; j < score[i].length; j++) { //2차원 배열 크기
				sum += score[i][j];
				System.out.print(score[i][j]+"\t");
			}
			
			avg = sum / score[i].length; // 2차원 배열의 크기만큼 나누기
			
			System.out.print(sum + "\t");
			System.out.print(avg + "\t");
			System.out.println();
		}
		//과목별 평균
		korAvg = korTotal / score.length;
		engAvg = engTotal / score.length;
		matAvg = matTotal / score.length;
		
		System.out.println("================================================");
		System.out.println("\t"+korTotal+"\t"+engTotal+"\t"+matTotal);
		System.out.println("\t"+korAvg+"\t"+engAvg+"\t"+matAvg);
	}

}
