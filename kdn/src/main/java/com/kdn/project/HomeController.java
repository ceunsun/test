package com.kdn.project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {		
		return "home";
	}
	
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String returnHome() {		
		return "home";
	}
	
	@RequestMapping(value = "/search.do", method = RequestMethod.POST)
	public String searchResult() {		
		return "home";
	}
	
	@RequestMapping(value = "about.do", method = RequestMethod.GET)
	public String about(Model model) {
		
		return "about/about";
	}
	
	@RequestMapping(value = "board.do", method = RequestMethod.GET)
	public String tours(Model model) {
		
		return "board/board";
	}
	
	@RequestMapping(value = "contact.do", method = RequestMethod.GET)
	public String contact(Model model) {
		
		return "contact/contact";
	}
	
	@RequestMapping(value = "myPage.do", method = RequestMethod.GET)
	public String myPage(Model model) {
		
		return "myPage/myPage";
	}
}
