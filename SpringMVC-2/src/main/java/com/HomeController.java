package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
	
	
	@RequestMapping("/log")
	public String preLogin()
	{
		System.out.println("this is login action log");
		return "success";
	}
	@RequestMapping("/login")
	public String loginCheck(@RequestParam("uname")String un,@RequestParam("pass")String ps,ModelMap m) {
		
		System.out.println("Username is--un");
		System.out.println("Password is--ps");
		m.addAttribute("username", un);
		return "success";
	}
	@RequestMapping("/reg")
	public String regData(@ModelAttribute Student s) {
		System.out.println(s.getName());
		System.out.println(s.getUname());
		System.out.println(s.getPass());
		System.out.println(s.getMobno());
		System.out.println(s.getAddress());
		
		return "success";
		
	}
}