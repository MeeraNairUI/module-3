package com.ust.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/profession")
public class TestController2 {
	     @GetMapping
         public String respond(Model model)
	     {
        	 model.addAttribute("myTech","Java Full Stack Developer");
        	 model.addAttribute("location","Trivandrum");
        	 return "response2";   //name of the view file
         }
}
