package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

@Component
public class ProcesosFecha {
	private LocalDate fecha1;
	private LocalDate fecha2;
	private LocalTime time1;
	private LocalTime time2;
	private LocalDateTime dateTime1;
	private LocalDateTime dateTime2;
	
	//CONSTRUCTORES
	public ProcesosFecha() {
		// TODO Auto-generated constructor stub
	}
	public ProcesosFecha(LocalDate fecha1,LocalDate fecha2) {
		super();
		this.fecha1=fecha1;
		this.fecha2=fecha2;
	}
	public ProcesosFecha(LocalTime time1,LocalTime time2) {
		super();
		this.time1=time1;
		this.time2=time2;
	}
	public ProcesosFecha(LocalDateTime dateTime1, LocalDateTime dateTime2) {
		super();
		this.dateTime1 = dateTime1;
		this.dateTime2 = dateTime2;
	}
	public LocalDate getFecha1() {
		return fecha1;
	}
	public void setFecha1(LocalDate fecha1) {
		this.fecha1 = fecha1;
	}
	public LocalDate getFecha2() {
		return fecha2;
	}
	public void setFecha2(LocalDate fecha2) {
		this.fecha2 = fecha2;
	}
	public LocalTime getTime1() {
		return time1;
	}
	public void setTime1(LocalTime time1) {
		this.time1 = time1;
	}
	public LocalTime getTime2() {
		return time2;
	}
	public void setTime2(LocalTime time2) {
		this.time2 = time2;
	}
	public LocalDateTime getDateTime1() {
		return dateTime1;
	}
	public void setDateTime1(LocalDateTime dateTime1) {
		this.dateTime1 = dateTime1;
	}
	public LocalDateTime getDateTime2() {
		return dateTime2;
	}
	public void setDateTime2(LocalDateTime dateTime2) {
		this.dateTime2 = dateTime2;
	}
	

	public Period contarTiempoTranscurrido() {
		
		Period p = Period.ZERO;
		if (fecha1.isBefore(fecha2))
		     p = Period.between(fecha1, fecha2);
		return p;
	}
	
	public String formatearFecha(LocalDate fecha) {
		DateTimeFormatter formattter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedDate = fecha.format(formattter);
		return formattedDate;
	}
	public String compararFechas() {
		String result, f1 = formatearFecha(fecha1), f2 = formatearFecha(fecha2); 
		if (fecha1.isAfter(fecha2))
		{
			result="La fecha "+f1+" es mayor que la fecha "+f2;
		}else
		{
			result="La fecha "+f2+" es mayor que la fecha "+f1;
		}
		
		return result;
	}
}
