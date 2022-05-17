package kosta.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kosta.model.Member;

@RestController
public class JsonController {
	
	static List<Member> list = new ArrayList<>();
	
	static {
		list.add(new Member("홍길동",20,"서울"));
		list.add(new Member("박길동",25,"부산"));
		list.add(new Member("조길동",30,"대구"));
	}
	
	@RequestMapping("/member_list")
	public List<Member> member_list() {
		
		return list;
	}
	
	@PostMapping("/member_insert")
	public void member_insert(@RequestBody Member m) {
		list.add(m);
	}
	
	@RequestMapping("/member_json")
	public Member member_json(@RequestParam("name") String name){
		Member m = null;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				m = list.get(i);
				break;
			}
		}
		return m;
	}
}
