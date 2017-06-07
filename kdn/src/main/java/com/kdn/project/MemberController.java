package com.kdn.project;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kdn.model.domain.Member;
import com.kdn.model.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	MemberService ms;
	
	@RequestMapping(value="login.do", method=RequestMethod.POST)
	public String login(String id, String pwd, HttpSession session){
		Member find = null;
		
		find = ms.search(id);
		
		System.out.println(find);
		
		if(find.getId().equals(id) && find.getPwd().equals(pwd)){
			String name = find.getName();
			int penalty = find.getPenalty();
			
			session.setAttribute("name", name);
			session.setAttribute("penalty", penalty);
		}
		
		return "home";
	}
	
	@RequestMapping(value="logout.do", method=RequestMethod.GET)
	public String logout(HttpSession session){
		session.removeAttribute("name");
		
		return "home";
	}
}
