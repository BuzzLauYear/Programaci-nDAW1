package Aplicacion;

import pokemones.*;
import enemigos.*;
public class Aplicacion {

	public Aplicacion () {
		
		PokemonElectrico pika = new PokemonElectrico("Pikachu", 300);
		System.out.println("Se ha creado a: " + pika.getNombre());
		PokemonFuego charm = new PokemonFuego("Charmander", 400);
		System.out.println("Se ha creado a: " + charm.getNombre());
		charm.jugar(20, pika);
		System.out.println("Charmander está jugando con Pikachu, ahora tiene: " + charm.getVida() + " puntos de vida.");
		PokemonPlanta bulb = new PokemonPlanta("Bulbasaur", 200);
		System.out.println("Se ha creado a: " + bulb.getNombre());
		TeamRocket team = new TeamRocket("Jesse y James",100);
		System.out.println("Se ha creado al TEAM ROCKET!!!!!" + team.getNombre() + " Y a meowthhhhh.....");
		
	}
	public static void main(String[] args) {
		Aplicacion app = new Aplicacion();


	}

}
