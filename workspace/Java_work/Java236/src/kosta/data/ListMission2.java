package kosta.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ListMission2 {

	public static void main(String[] args) {
		//로또번호 1~45 중복되지 않는 정수 6개를 출력하라.
		//1. 배열로 구현
		int arr[] = new int[6];
		Random r = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(45)+1;
			for(int j = 0; j < i; j++) { // 기존에 있는 데이터 값 비교 하는 for문
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}
		
		Arrays.sort(arr);
		System.out.println("======배열로 구현=======");
		System.out.println(Arrays.toString(arr));
		
		
		
		//2. List자료구조로 구현 : contains(정수) => 중복체크 true/false
		System.out.println("========List로 구현=========");
		List<Integer> list = new ArrayList<Integer>();
		
		while(true) {
			int n = r.nextInt(45)+1;
			if(list.contains(n)) {
				continue;
			}else {
				list.add(n);
			}
			
			if(list.size() == 6) break;
		}
		
		Collections.sort(list);
//		for(int i = 0; i < list.size(); i++) {
//			if(list.contains(i) == false) {
//				list.add(r.nextInt(45)+1);
//			}
//		}
		
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+", ");
		}
		System.out.println();
		
		
		
		
		//3. Set 자료구조로 구현
		System.out.println("=======Set으로 구현=======");
		Set<Integer> set = new TreeSet<Integer>();
		
		for(int i = 0; set.size() < 6; i++) {
			set.add(r.nextInt(45)+1);
		}
		
		System.out.println(set);
	}

}
