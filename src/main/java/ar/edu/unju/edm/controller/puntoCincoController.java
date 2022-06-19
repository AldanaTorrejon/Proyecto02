package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ar.edu.unju.edm.model.punto5;

@Controller
public class puntoCincoController {
	  @GetMapping("/punto_5")
	  public String getPunto(Model model){
	    punto5 revers = new punto5();
	    revers.setAux("Apruebeme profe");
	    model.addAttribute("invertida",revers.Reverso());
	    return "puntoCinco";
	  }
}
