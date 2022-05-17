package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.time.Period;

@Component
public class Alumno {
	private String nombre;
	private String apellido;
	private int dni;
	private int num;
	private LocalDate fechaNac;
	int LibretaUni;
	private double Notas[];
	public Alumno() {
	}

	public Alumno(int dni, int num, String nombre, String apellido, LocalDate fechaNac, int LibretaUni, double Notas[]) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.num = num;
		this.fechaNac = fechaNac;
		this.LibretaUni = LibretaUni;
        this.Notas = Notas;
	}

	

	public Alumno(String string, String string2, int i, double[] bad_grades) {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechanac) {
		this.fechaNac = fechanac;
	}
	
	public String getEdad() {
		String anio;
	    Period edad = Period.between(fechaNac, LocalDate.now());
	    anio = " " + edad.getYears();
		return anio;
	}
	public double[] getNotas(){
	    return Notas;
	}

	public void setNotas(double[] notas){
	    this.Notas = notas;
	}

	public int getLibretaUni() {
		return LibretaUni;
	}

	public void setLibretaUni(int libretaUni) {
		LibretaUni = libretaUni;
	}
	public double calcularPromedio() {
		double promedio=0;
		for (int i=0; i<Notas.length; i++) {
			promedio = promedio + Notas[i];
		}
		promedio = promedio / Notas.length;
		return promedio;
	}
	
	public double obtenerNotaMaxima() {
		double maximo=Notas[0]; 
		for (int i=1; i<Notas.length; i++) { 
			if (Notas[i] > maximo) {
				maximo = Notas[i]; 
			}
		}
		return maximo;
	}

}

