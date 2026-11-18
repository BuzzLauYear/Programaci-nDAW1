package serVivo;

public class Planta extends SerVivo {

	public Planta(String nombre, String tipo, int altura) {
		super(nombre, tipo, altura);
	
	}
	
	
	public String toString() {
		String crear = ("Se ha creado una plantita de nombre: " + nombre + " del tipo: " + tipo + " que mide: " + altura + " cm.");
		return crear;
		}

}

