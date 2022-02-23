package kosta.data;

import java.util.Random;
import java.util.TreeSet;

public class SortExam {

	public static void main(String[] args) {
		//List => 정렬기준(삽입 순서)
		//최초의 정렬 기준 : Comparable => compareTo() 오버라이딩
		//정렬 기준을 변경 : Comparator = > compare() 오버라이딩
		
		Random r = new Random();
		TreeSet<Integer> set = new TreeSet<Integer>(new Desending()); // 디폴트 정렬 : 오름차순
		
		for(int i = 0; set.size() < 6; i++) {
			set.add(r.nextInt(45) + 1);
		}
		
		System.out.println(set);
	}

}
