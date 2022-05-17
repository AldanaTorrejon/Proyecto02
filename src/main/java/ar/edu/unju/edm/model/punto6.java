package ar.edu.unju.edm.model;

import java.util.ArrayList;

public class punto6 {
	  ArrayList<Integer> numero = new ArrayList<Integer>();
	  int aux;
	  public void setAux(int aux) {
	    this.aux = aux;
	  }
	  public int getAux() {
	    return aux;
	  }
	  public ArrayList<Integer> Reverso(){
	    ArrayList<Integer> inverso = new ArrayList<Integer>();
	    numero.add(1);
	    numero.add(2);
	    numero.add(3);
	    numero.add(4);
	    numero.add(5);
	    numero.add(6);
	    numero.add(7);
	    numero.add(8);
	    numero.add(9);
	    numero.add(10);
	    for(int i=numero.size()-1;i>=0;i--){
	      inverso.add(numero.get(i));
	    }
	    return inverso;
	  }
}
