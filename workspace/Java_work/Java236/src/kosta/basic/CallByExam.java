package kosta.basic;

public class CallByExam {
	
//	public static void change(int num) {
//		num += 100;
//	}

	public static int change(int num) {
		num += 100;
		return num;
	}
	public static void change2(int arr[]) {
		arr[0] += 100;
	}
	
	public static void main(String[] args) {
		int num = 10;
		num = change(num); // call by value
		System.out.println("num = "+ num);
		
		int arr[] = {10};
		change2(arr); // call by reference
		System.out.println("arr[0] = "+ arr[0]);
	}
}
