package Clases;

public class Avion {
	private String fabricante;
	private int motores;
	
	public Avion() {
		
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getMotores() {
		return motores;
	}

	public void setMotores(int motores) {
		this.motores = motores;
	}
	
	public void imprimirFabricante() {
		System.out.println("Fabricante: "+fabricante);
	}
	
	public void cambiarFabricante (Avion a) {
		a.fabricante="Loockhead";
	}
	
	public void mostrar() {
		System.out.println("Fabricante: "+fabricante);
		System.out.println("Motores: "+motores);
	}
	
	
}


