package aparcamientous;

public class Coche {

	private final String matricula;
	private int km;
	private static final int RUEDAS_MINIMAS = 2;

public Coche(String matricula, int km) {
	this.matricula = matricula;
	this.km=km;
	
}

public void acelerar(int km) {
	km++;
	
}




}
