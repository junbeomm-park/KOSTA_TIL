package kosta.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kosta.model.Board;
import kosta.model.BoardDao;

@Controller
public class BoardController {
	@Autowired
	private BoardDao dao;

	//@RequestMapping(value = "/board_insert", method = RequestMethod.GET)
	@GetMapping("/board_insert")
	public String board_form(@ModelAttribute("boardCommand") Board board) {
		System.out.println("form 페이지 이동");
		return "insert_form";
	}
	
	//@RequestMapping(value = "/board_insert", method = RequestMethod.POST)
	@PostMapping("/board_insert")
	public String board_insert(@ModelAttribute("boardCommand") @Valid Board board, BindingResult errors) {
		
		if(errors.hasErrors()) {
			System.out.println("에러발생");
			return "insert_form";
		}
		
		dao.insert(board);
		
		return "redirect:board_list";
	}
	
	@RequestMapping("/board_list")
	public String board_list(Model model) {
		List<Board> list = dao.list();
		
		model.addAttribute("list",list);
		
		return "list";
	}
	
	/*
	 * @RequestMapping("/board_detail") public String
	 * board_detail(@RequestParam("seq") int seq, Model model) {
	 * model.addAttribute("board",dao.detail(seq));
	 * 
	 * return "detail"; }
	 */
	
	@RequestMapping("/board_detail{seq}")
	public String board_detail(@PathVariable int seq, Model model) {
		model.addAttribute("board",dao.detail(seq));
		
		return "detail";
	}
	
	@GetMapping("/board_update")
	public String update_form(@RequestParam("seq") int seq, Model model) {
		model.addAttribute("board", dao.detail(seq));
		
		return "updateForm";
	}
	
	@PostMapping("/board_update")
	public String board_update(Board board) {
		dao.update(board);
		
		return "redirect:board_list";
	}
	
	@RequestMapping("/board_delete")
	public String delete_board(@RequestParam("seq") int seq) {
		dao.delete(seq);
		
		return("redirect:board_list");
	}
	
}
