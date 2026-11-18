package animales;

public abstract class AnimalTerrestre extends Animal{
	
	protected String color;
	protected String sonido;

	public AnimalTerrestre(String nombre, String color, String sonido) {
		super(nombre);
		this.color=color;
		this.sonido = sonido;
	
		
	}
	
	
	

	public String toString() {
		String crear = "Se ha creado un " + nombre + " de color " + color + " que hace: " + sonido;
		return crear;
	
	
}
}
