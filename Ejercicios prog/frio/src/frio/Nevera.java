package frio;

public class Nevera {
	
	private String marca;
	private int temperatura;
	private Compresor c;
	
	
	public Nevera(String marca) {
	temperatura = 5;
	this.c = new Compresor();
	System.out.println("Se crea una nevera con la marca " + marca + " temperatura:");
	}
	
	
	public Nevera(String marca, int potencia) {
		temperatura=5;
		this.c=new Compresor(potencia);
		
	}
	
	

}
