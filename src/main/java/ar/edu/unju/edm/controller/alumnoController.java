package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;
import ar.edu.unju.edm.model.Alumno;

@Controller
public class alumnoController {
	@GetMapping("/resolverAlumnoPuntoTres")

	public String getAlumnoPage(Model model) {
		double promedio=0;
		double mayor=0;
		Alumno zAlumno = new Alumno();
		double[] notas = new double[]{6.40, 7.50, 9.50, 9.45, 5.25};
		model.addAttribute("Notas", Arrays.toString(notas));
		zAlumno.setNotas(notas);
		zAlumno.setNombre("Rocio");
		zAlumno.setApellido("Cala");
		zAlumno.setLibretaUni(1);
		model.addAttribute("Nombre", zAlumno.getNombre());
		model.addAttribute("Apellido", zAlumno.getApellido());
		model.addAttribute("Libreta", zAlumno.getLibretaUni());
		promedio = zAlumno.calcularPromedio();
		model.addAttribute("Promedio", promedio);
		mayor = zAlumno.obtenerNotaMaxima();
		model.addAttribute("Mayor", mayor);
		return "puntoTres";
	}

}
