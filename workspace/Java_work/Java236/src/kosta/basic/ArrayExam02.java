package kosta.basic;

public class ArrayExam02 {

	public static void main(String[] args) {
		//각 1차원 배열마다 2차원의 배열의 크기 일정
		int arr[][]; //2차원 배열 선언
		arr = new int[3][2]; //arr[0][0], arr[0][1], arr[1][0]...... 2차원 배열 생성
		
		//2차원배열의 크기를 다르게 생성 방법
		int arr2[][] = new int[3][];
		arr2[0] = new int[2];
		arr2[1] = new int[3];
		arr2[2] = new int[4];
		
		//2차원 배열 선언, 생성, 초기화
		int arr3[][] = {{1,2},{3,4},{5,6}};
		
		for(int i = 0; i < arr3.length; i++) { // 1차원배열 크기
			for(int j = 0; j < arr3[i].length; j++) { // 2차원배열 크기
				System.out.println("arr3["+i+"]["+j+"] = "+arr3[i][j]);
			}
		}
		
		//구구단 전체 => 2차원 배열에 초기화 후 출력
		int arr4[][] = new int[10][10];
		
		for(int i = 2; i < arr4.length; i++) {
			for(int j = 1; j < arr4[i].length; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
		}
		
	}

}
