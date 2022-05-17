package ar.edu.unju.edm.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ar.edu.unju.edm.model.punto4;
import ar.edu.unju.edm.until.numerosPuntoCuatro;
public class puntoCuatroController {
	@GetMapping("/mostrarPuntoCuatro")
	public String getPunto4Page(Model model) {
		
		//Creacion de los numeros
		punto4 aPunto4n1 = new punto4(12,"?");
		punto4 aPunto4n2 = new punto4(34,"?");
		punto4 aPunto4n3 = new punto4(55,"?");
		punto4 aPunto4n4 = new punto4(23,"?");
		punto4 aPunto4n5 = new punto4(77,"?");
		punto4 aPunto4n6 = new punto4(91,"?");
		punto4 aPunto4n7 = new punto4(56,"?");
		punto4 aPunto4n8 = new punto4(69,"?");
		
		//Par o Impar
		aPunto4n1.setPar(aPunto4n1.esPar(aPunto4n1.getNum()));
		aPunto4n2.setPar(aPunto4n2.esPar(aPunto4n2.getNum()));
		aPunto4n3.setPar(aPunto4n3.esPar(aPunto4n3.getNum()));
		aPunto4n4.setPar(aPunto4n4.esPar(aPunto4n4.getNum()));
		aPunto4n5.setPar(aPunto4n5.esPar(aPunto4n5.getNum()));
		aPunto4n6.setPar(aPunto4n6.esPar(aPunto4n6.getNum()));
		aPunto4n7.setPar(aPunto4n7.esPar(aPunto4n7.getNum()));
		aPunto4n8.setPar(aPunto4n8.esPar(aPunto4n8.getNum()));
	
		//Agrego los numeros
		numerosPuntoCuatro numeros = new numerosPuntoCuatro();
		numeros.getNumbers().add(aPunto4n1);
		numeros.getNumbers().add(aPunto4n2);
		numeros.getNumbers().add(aPunto4n3);
		numeros.getNumbers().add(aPunto4n4);
		numeros.getNumbers().add(aPunto4n5);
		numeros.getNumbers().add(aPunto4n6);
		numeros.getNumbers().add(aPunto4n7);
		numeros.getNumbers().add(aPunto4n8);
		
		//Envio los numeros
		model.addAttribute("Numeros", numeros.getNumbers());
	
		return "puntoCuatro";
    }
}
