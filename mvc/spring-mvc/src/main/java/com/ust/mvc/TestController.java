package com.ust.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/name")
public class TestController {
	     @GetMapping
         public String respond(Model model)
	     {
        	 model.addAttribute("myName","Meera");
        	 return "response";
         }
}
