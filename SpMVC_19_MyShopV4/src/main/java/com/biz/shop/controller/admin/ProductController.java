package com.biz.shop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.shop.domain.ProductVO;
import com.biz.shop.service.ProductService;

@RequestMapping(value="/admin/product")
@Controller
public class ProductController {
	
	ProductService pService;
	
	@RequestMapping(value= {"","/"}, method=RequestMethod.GET)
	
	public String product(Model model) {
		
		ProductVO productVO = new ProductVO();
		
		model.addAttribute("productVO", productVO);
		model.addAttribute("BODY","PRODUCT");
		return "admin/main";
	
	}
	
	
	@RequestMapping(value="/input", method=RequestMethod.POST)
	public String product(@ModelAttribute ProductVO productVO, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			model.addAttribute("BODY", "PRODUCT");
			return "admin/main";
			
		}
			pService.save(productVO);
		
		model.addAttribute("productVO", productVO);
		model.addAttribute("BODY","PRODUCT");
		return "admin/main";
	
	
	}



}
