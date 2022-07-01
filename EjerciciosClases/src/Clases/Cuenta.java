package Clases;

public class Cuenta {
	
	private Persona titular;
	private double cantidad;


	public Cuenta() {
	
	}

	public void mostrar() {
		System.out.println("Titular: "+titular);
		System.out.println("Cantidad: "+cantidad);
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}

	public void ingresar(double cantidad) {
		if (cantidad>=0)
		this.cantidad = this.cantidad+cantidad;
	}
	
	public void retirar(double cantidad) {
		this.cantidad = this.cantidad-cantidad;
	}
	
}