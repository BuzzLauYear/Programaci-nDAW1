package pokemones;

public abstract class Pokemon {
	
	protected String nombre;
	protected int puntosAtaque;
	protected int vida;

	
	public Pokemon(String nombre, int puntosAtaque) {
		this.nombre = nombre;
		this.puntosAtaque = puntosAtaque;
		this.vida = 300;
	}

	 public void atacar(int puntosAtaque) {
		 vida = puntosAtaque - vida;
		 System.out.println("El pokemon: " + nombre + "ha atacado con " + puntosAtaque + " puntos de ataque.");
	 }
	
	 public String getNombre() {
		 return nombre;
	 }

	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }
	 
	 public void jugar(int tiempoJuntos, Pokemon otroPokemon) {
		 vida = vida + tiempoJuntos;
	 }
	 
	 
	 public int getVida() {
		 return vida;
	 }
	 
	 public void setVida(int vida) {
		 this.vida = vida;
	 }
}
