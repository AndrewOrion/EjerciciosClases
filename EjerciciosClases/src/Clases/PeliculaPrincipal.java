package Clases;

import java.util.Scanner;

public class PeliculaPrincipal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Pelicula peli1= new Pelicula();
		Pelicula peli2= new Pelicula();
		
		peli1= new Pelicula("Braveheart","Mel Gibson","Accion",
				3.30,1995,9.0);
		
		peli2= new Pelicula("Aliens","James Cameron","Suspense",
				2.30,1986,9.5);
		
		peli1.imprimir();
		System.out.println("_______________________");
		peli2.imprimir();

		//System.out.println(peli1.getNombre());
		
		System.out.println("_______________________");
		
		if (peli1.esPeliculaEpica())
			System.out.println("La película es épica");
		else
			System.out.println("La película no es épica");
		
		System.out.println("_______________________");
		
		System.out.println("La pelicula "+peli1.getNombre()+" es "
		+peli1.calcularValoracion()+" ("+peli1.getCalificacion()+")");;
		System.out.println("La pelicula "+peli2.getNombre()+" es "
				+peli2.calcularValoracion()+" ("+peli2.getCalificacion()+")");;
	
		System.out.println("_______________________");
		
		if (peli1.esSimilar(peli2)) 
			System.out.println("Son similares");
		else
			System.out.println("No son similares");
	}

}
