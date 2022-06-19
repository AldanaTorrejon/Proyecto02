package ar.edu.unju.edm.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.ProcesosFecha;

public class procesosFechaController {
	ProcesosFecha procesoFecha;

	@GetMapping("/punto17")
	public String getpunto17(Model model){
		ProcesosFecha pf1 =new ProcesosFecha();
	    pf1.setFecha1(LocalDate.now());
	    pf1.setFecha2(LocalDate.of(2003, 10, 14));
	    model.addAttribute("fecha1", pf1.getFecha1());
	    model.addAttribute("fecha2", pf1.getFecha2());
	    //
	    ProcesosFecha pf2 =new ProcesosFecha();
	    pf2.setTime1(LocalTime.of(00, 12, 12));
	    pf2.setTime2(LocalTime.now());
	    LocalTime Aux=pf2.getTime1(),Aux2=pf2.getTime2();
	    model.addAttribute("time1", Aux.plusHours(8));
	    model.addAttribute("time2", Aux2.minusMinutes(12));
	    model.addAttribute("comparar", pf1.compararFechas());
	    //
	    ProcesosFecha pf3 = new ProcesosFecha();
	    pf3.setDateTime1(LocalDateTime.of(pf1.getFecha1(), pf2.getTime1()));
	    pf3.setDateTime2(LocalDateTime.of(pf1.getFecha2(), pf2.getTime2()));
	    model.addAttribute("datetime1", pf3.getDateTime1());
	    model.addAttribute("datetime2", pf3.getDateTime2());
	    //
	    ProcesosFecha pf4 = new ProcesosFecha();
	    pf4.setFecha1(LocalDate.of(2003, 04, 04));
	    pf4.setFecha2(LocalDate.now());
	    String Aux3= pf4.formatearFecha(pf4.getFecha1());
	    String Aux4= pf4.formatearFecha(pf4.getFecha2());
	    Period Edad = pf4.contarTiempoTranscurrido();
	    String Edad2=String.format("Han pasado %d años, %d meses y %d días desde la fecha " + Aux3 + " hasta la fecha " + Aux4,
	    Edad.getYears(),
	    Edad.getMonths(),
	    Edad.getDays());
	    model.addAttribute("edad", Edad2);
	    String Aux5="12/05/2022";
	    //
	    ProcesosFecha pf5 = new ProcesosFecha();
	    DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    pf5.setFecha1(LocalDate.parse(Aux5,Formatter));
	    model.addAttribute("anio", pf5.getFecha1().plusDays(365));
	    String Aux6="25/11/2020";
	    pf5.setFecha1(LocalDate.parse(Aux6,Formatter));
	    model.addAttribute("meses", pf5.getFecha1().plusMonths(8));
	    return "puntoDos";
	  }
}
