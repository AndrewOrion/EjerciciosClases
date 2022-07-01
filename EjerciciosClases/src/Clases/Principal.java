package Clases;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			
			Persona p = new Persona();
			
			System.out.println("Nombre: ");
			p.setNombre(teclado.nextLine());
			
			System.out.println("Edad: ");
			p.setEdad(teclado.nextInt());
		
			teclado.nextLine();
			System.out.println("DNI ");
			p.setDni(teclado.nextLine());
			
			System.out.println("_______________");
			System.out.println("Tus datos son: ");
			System.out.println(p);
			System.out.println("_______________");
			p.mostrar();
			System.out.println("_______________");

			if (p.esMayorDeEdad())
				System.out.println(p.getNombre()+" es mayor de edad");
			else
				System.out.println(p.getNombre()+" no es mayor de edad");
			System.out.println("_______________");

			Cuenta c = new Cuenta();
			
			System.out.println("Cantidad: ");
			c.setCantidad(teclado.nextInt());
			c.setTitular(p);
			c.mostrar();
			System.out.println("_______________");
			
			System.out.println("Ingresar: ");
			c.ingresar(teclado.nextInt());
			System.out.println("Saldo: "+c.getCantidad());
			
			System.out.println("Retirar: ");
			c.retirar(teclado.nextInt());
			System.out.println("Saldo: "+c.getCantidad());
			
		}
}

