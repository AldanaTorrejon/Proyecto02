package ar.edu.unju.edm.controller;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unju.edm.model.Persona;

@Controller
public class personaController {
	@Autowired 
	Persona persona;
	@GetMapping("/calcularEdad")
	public ModelAndView getEdad (@RequestParam (name= "fecha") String fecha) {
		persona.setFecha(LocalDate.parse(fecha));
		
		//calculo de edad
		String resultadoEdad=persona.getEdad();
		String resultadoSigno=persona.getSigno();
		String resultadoEstacion= persona.getEstacion();
		
		//mostrar el resultado
		ModelAndView modelView = new ModelAndView("punto1");		
		modelView.addObject("resultado1",resultadoEdad);
		modelView.addObject("resultado2",resultadoSigno);
		modelView.addObject("resultado3",resultadoEstacion);
		return modelView;
	}
}
