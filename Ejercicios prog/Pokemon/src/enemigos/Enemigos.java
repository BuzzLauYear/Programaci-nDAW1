package enemigos;

public abstract class Enemigos {
	
	protected String nombre;
	protected int vida;
	protected int puntosAtaque;
	
	
	
	public Enemigos(String nombre, int puntosAtaque) {
		this.nombre = nombre;
		this.vida = 500;
		this.puntosAtaque = puntosAtaque;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
