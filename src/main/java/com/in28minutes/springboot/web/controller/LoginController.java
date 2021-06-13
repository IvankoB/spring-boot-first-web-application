package com.in28minutes.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class LoginController {

//	@RequestMapping("/login")	
//1)	@ResponseBody // to send the response within <html><body> instead of handling a view of this name
//	public String loginMessage() {
//		return "Hello, world !"; // for @ResponseBody
//	}

//	@RequestMapping("/login")	
//	public String showloginMessage(
//			@RequestParam String name, /* assign query name's value to the name arg of the function*/
//			ModelMap model  /*reference to precreated empty hashmap of model 'name=value' pairs to fill in 
//							within the function, will then be available in the JSP page */
//	) {
//		model.put("name", name); // it's value will be available as ${name} within the JSP page
//		return "login"; // for JSP (basename of filename) -> /webapp/WEB-INF/jsp/login.jsp
//	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)	
	public String showLoginPage(ModelMap model) {
//		model.put("name", name);		
		return "login";
	} 

	@RequestMapping(value = "/login", method = RequestMethod.POST)	
	public String showWelcomePage(ModelMap model, @RequestParam String name) {
		model.put("name", name);		
		return "welcome";
	}
	
}

