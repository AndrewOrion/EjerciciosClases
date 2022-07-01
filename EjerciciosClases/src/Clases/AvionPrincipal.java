package Clases;

public class AvionPrincipal {

	public static void main(String[] args) {
		
		Avion a1 = new Avion();
		Avion a2 = new Avion();
		
		a1.setFabricante("Airbus");
		a1.setMotores(4);
		a2.setFabricante("Lookheed");
		a2.setMotores(4);
		
		a1.mostrar();
		a2.mostrar();
		System.out.println("____________");
		
		a1.setFabricante("AirBussines");
		a2.cambiarFabricante(a2);
		
		a1.mostrar();
		a2.mostrar();
		System.out.println("____________");

	}

}
