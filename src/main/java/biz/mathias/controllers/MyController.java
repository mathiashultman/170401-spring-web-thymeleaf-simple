package biz.mathias.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/")
	public String home(Model model){
		model.addAttribute("mine", "my");
		return "home";
	}
	
}
