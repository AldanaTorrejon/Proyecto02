package ar.edu.unju.edm.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ar.edu.unju.edm.model.Persona;

@Controller
public class personaController {
	@Autowired 
	Persona persona;
	@GetMapping("/punto15")
	  public String punto_15(@RequestParam ("anio") String Anio,@RequestParam ("nombre") String Nombre,Model model){
	    DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    LocalDate Aux2=LocalDate.parse(Anio,Formatter);
	        Persona Aux = new Persona();
	        Aux.setNombre(Nombre);
	        Aux.setFecha(Aux2);
	    model.addAttribute("nombre", Nombre);
	    model.addAttribute("edad", Aux.getEdad());
	    model.addAttribute("Signo",Aux.getSigno());
	    model.addAttribute("estacion",Aux.getEstacion());
	    return "puntoUno";
  }
}