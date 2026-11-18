package Aplicacion;
import java.util.Scanner;

import animales.*;
public class Aplicacion {

	public Aplicacion() {
		Scanner s=new Scanner(System.in);
		System.out.println("Introduce un nombre para el perro:");
		String nombrePerro=s.nextLine();		
		Perro p = new Perro(nombrePerro,"blanco","GUAUUUU");
		System.out.println(p.toString());
		System.out.println("Introduce un nombre para el gato:");
		String nombreGato=s.nextLine();
		Gato g = new Gato(nombreGato, "negro","MIAWW");
		System.out.println(g.toString());
		System.out.println("Introduce un nombre para la vaca:");
		String nombreVaca=s.nextLine();
		Vaca v = new Vaca(nombreVaca, "blanca y negra", "MUUUUU");
		System.out.println(v.toString());
		System.out.println("Introduce un nombre para el gallo");
		String nombreGallo=s.nextLine();
		Gallo gal = new Gallo(nombreGallo, "marrón", "KOKOROKOOO");
		System.out.println(gal.toString());
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
	Aplicacion app = new Aplicacion();

	}

}
