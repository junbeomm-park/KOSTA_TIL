package kosta.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("1", "KT");
		map.put("2", "두산");
		map.put("3", "삼성");
		
		System.out.println(map);
		System.out.println("요소의 사이즈 : " + map.size());
		
		if(map.containsValue("두산")) {
			map.remove("2");
		}
		
		System.out.println("요소의 사이즈 : " + map.size());
		System.out.println(map.get("3"));
		
		// Map 전체 목록 출력(key,value)
		// Map => Set => Iterator
		// key => keySet()
		// value => values() : Collection
		// (key, value) => entrySet()
//		Set set = map.entrySet();
//		Iterator iter = set.iterator();
		
		Iterator<Entry<String, String>> iter = map.entrySet().iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String, String> e = (Map.Entry<String, String>)iter.next();// (key, value)
			System.out.println("key : "+e.getKey()+", value : "+e.getValue());
		}
	}

}
