package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class menuController {
	  @GetMapping({"/Menu","/index","/","/home"})
	  public String getMenu(){

	    return "index";
	  }
}
