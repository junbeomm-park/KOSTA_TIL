package kosta.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		//ArrayList<String> list = new ArrayList<String>();
		List<String> list = new ArrayList<String>();
		
		list.add("포도"); //get(0)
		list.add("사과"); //get(1)
		list.add("수박"); //get(2)
		list.add(3 , "딸기");
		
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		list.remove(1);
		
		//Iterator(List, Map, Set) 사용 가능하기 때문
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
