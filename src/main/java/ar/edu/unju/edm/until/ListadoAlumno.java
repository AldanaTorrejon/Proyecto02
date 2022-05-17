package ar.edu.unju.edm.until;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.edm.model.Alumno;

@Component
public class ListadoAlumno {
	//implementacion de List es ArrayList
	private List<Alumno> lista = new ArrayList<>(); 
	public ListadoAlumno() {
	}

	public List<Alumno> getListado() {
		return lista;
	}

	public void setListado(List<Alumno> lista) {
		this.lista = lista;
	}
}
