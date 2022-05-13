package kosta.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kosta.model.Member;

@Controller
public class MemberController {

	@GetMapping("/member_insert")
	public String member_form(@ModelAttribute("memberCommand") Member member) {
		System.out.println("form 이동");
		return "insert_form";
	}
	
	@PostMapping("/member_insert")
	public String member_insert(@ModelAttribute("memberCommand") @Valid Member member, BindingResult errors) {
		
		if(errors.hasErrors()) {
			System.out.println("======에러발생=====");
			System.out.println(member);
			return "insert_form";
		}
		
		System.out.println("=====등록완료=====");
		System.out.println(member);
		
		return "";
	}
	
}
