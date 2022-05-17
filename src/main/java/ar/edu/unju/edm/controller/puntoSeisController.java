package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ar.edu.unju.edm.model.punto6;

@Controller
public class puntoSeisController {
	  @GetMapping("/puntoSeis")
	  public String getpunto6(Model model){
	    punto6 num = new punto6();
	    model.addAttribute("inverso",num.Reverso());
	    return "puntoSeis";
	  }
}
