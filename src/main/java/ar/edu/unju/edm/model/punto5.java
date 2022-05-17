package ar.edu.unju.edm.model;

public class punto5 {
	 String aux;

	  public void setAux(String aux) {
	    this.aux = aux;
	  }
	  public String getAux() {
	    return aux;
	  }

	  public String Reverso(){
	    char[] inverso = new char[100];
	    int cont=0;
	    for(int i=this.aux.length()-1;i>=0;i--){
	      inverso[cont]= aux.charAt(i);
	      cont++;
	    }
	    String aux2=String.copyValueOf(inverso);
	    return aux2;
	  }
}
