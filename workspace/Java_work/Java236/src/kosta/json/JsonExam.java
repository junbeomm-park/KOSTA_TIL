package kosta.json;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonExam {
	
	
	//{"name" : "홍길동", "address" : "가산", "age" : 20}
	public JSONObject createJson() {
		JSONObject obj = new JSONObject();
		obj.put("name", "홍길동");
		obj.put("address", "가산");
		obj.put("age", 20);
		
		return obj;		
	}
	
	public JSONObject createJson2() {
		JSONObject obj = new JSONObject();
		obj.put("name", "박길동");
		obj.put("address", "강남");
		obj.put("age", 40);
		
		return obj;		
	}	
	

	public static void main(String[] args) {
		JsonExam e = new JsonExam();
		
		//자바객체 => Json 문자열
		JSONObject obj = e.createJson();
		JSONObject obj2 = e.createJson2();
		System.out.println(obj.toJSONString());
		
		
		//JSONArray객체 => Json 문자열 변환
		JSONArray ja = new JSONArray();
		ja.add(obj);
		ja.add(obj2);
		//System.out.println(ja.toJSONString());
		
		//*** List<Member>  => Json 문자열 변환
		List<Member> list = new ArrayList<Member>();
		list.add(new Member("홍길동", "가산", 30));
		list.add(new Member("김길동", "영등포", 50));
		
		String jsonCode = net.sf.json.JSONArray.fromObject(list).toString();
		//System.out.println(jsonCode);
		
		//json문자열  => 자바객체
		//[{"address":"가산","age":30,"name":"홍길동"},{"address":"영등포","age":50,"name":"김길동"}]
		
//		JSONParser parser = new JSONParser();
//		Object re = null;
//		
//		try {
//			re = parser.parse(jsonCode);
//		} catch (Exception e2) {
//			e2.printStackTrace();
//		}
//		
//		if(re instanceof JSONArray) {
//			JSONArray array = (JSONArray)re;
//			Iterator iter = array.iterator();
//			List<Member> list2 = new ArrayList<Member>();
//			//JSONArray => JSONObject => Member => List
//			
//			
//			while(iter.hasNext()) {
//				JSONObject jo = (JSONObject)iter.next();
//				String name = (String)jo.get("name");
//				String address = (String)jo.get("address");
//				int age = ((Long)jo.get("age")).intValue();
//				
//				list2.add(new Member(name, address, age));
//			}
//			
//			System.out.println(list2);
//			
//		}
		

	}

}









