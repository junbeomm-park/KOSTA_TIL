package kosta.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExam2 {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("서자바", 20));
		list.add(new Person("윤자바", 25));
		list.add(new Person("고자바", 60));
		list.add(new Person("정자바", 10));
		
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				//이름을 기준으로 오름차순
				if(o1.getName().compareTo(o2.getName()) > 0 ) {
					return 1;
				}else if(o1.getName().compareTo(o2.getName()) < 0) {
					return -1;
				}
				return 0;
			}
		});
		
		System.out.println(list);
		
	}
}
