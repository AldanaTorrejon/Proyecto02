package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unju.edm.model.Alumno;
import ar.edu.unju.edm.until.ListadoAlumno;

@Controller
public class puntoOchoController {
	@Autowired
	ListadoAlumno estudiantes;
	
    @GetMapping("/punto_8")
	public ModelAndView getListadoAlumno() {
        //cargar datos 
        	double good_grades[]= {8.4 , 10 , 3.50 , 5 , 6};
        	double bad_grades[]= {6.4 , 5 , 3.50 , 5 , 1};
        	
        	Alumno student1 = new Alumno("Aldana","Torrejon",1,bad_grades);
        	Alumno student2 = new Alumno("Rocio","Cala",2,good_grades);
        	Alumno student3 = new Alumno("Luciana","Morales",3,bad_grades);
        	Alumno student4 = new Alumno("Karen","Portal",4,good_grades);
        	

        //se ingresan alumnos
        	estudiantes.getListado().add(student1);
        	estudiantes.getListado().add(student2);
        	estudiantes.getListado().add(student3);
        	estudiantes.getListado().add(student4);
        	
        //enviar resultados
        	ModelAndView modelView = new ModelAndView("puntoOcho_1");
        	modelView.addObject("puntoOcho",estudiantes.getListado());
            return modelView;
     }
}
