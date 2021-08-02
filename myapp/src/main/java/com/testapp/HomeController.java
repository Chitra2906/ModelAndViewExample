package com.testapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	
// pass all the param as a single object	
	@RequestMapping("/details")
	public ModelAndView home(User user) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", user);
		mv.setViewName("root");
		System.out.println(mv);
		return mv;
	}
	
	

//	getting single parameter in request
		@RequestMapping("home")
		public ModelAndView home(@RequestParam("name") String myName) {
		System.out.println("homepage called");
		ModelAndView mv = new ModelAndView();
		mv.addObject("name",myName); //data(model)
		mv.setViewName("home"); //view
		System.out.println(mv);
		return mv;
		
	}
	
	
}
