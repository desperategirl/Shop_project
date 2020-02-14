package com.biz.rbooks.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.biz.rbooks.domain.BookVO;
import com.biz.rbooks.service.BookService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping(value="/book")
@Controller

// Book 테이블의 CRUD를 위한 Controller.
// 도서정보 조회, 수정, 등록, 삭제하는 메서드들이 필요하다.

// select : get
// insert : post
// update : get, post
// delete : get
public class BookController {
	
	private final BookService bookService;
	
	@RequestMapping(value="home",method=RequestMethod.GET)
	public String select(Model model) {
		List<BookVO> bookList = bookService.selectAll();
		model.addAttribute("bookList",bookList);
		return "home";
	}
	
	
	@RequestMapping(value="/insert",method=RequestMethod.GET)
	public String insert() {
		return "insert";
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insert(@ModelAttribute BookVO bookVO) {
		bookService.insert(bookVO);
		return "redirect:/book/home";
	}
	
	
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public String update(@RequestParam("bcode") String b_code, Model model) {
		BookVO bookVO = bookService.findById(b_code);
		model.addAttribute("bookVO", bookVO);
		return "insert";
	}
	
	
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(@ModelAttribute BookVO bookVO) {
		bookService.update(bookVO);
		return "redirect:/book/home";
	}
	
	
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String delete(@RequestParam String b_code) {
		bookService.delete(b_code);
		return "redirect:/book/home";
	}
	
	
	
	

}
