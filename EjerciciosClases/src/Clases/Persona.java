package Clases;

public class Persona {
	
	private String nombre;
	private int edad;
	private String dni;
	
	
	public Persona() {
		
	}
	
	public Persona(String nombre, int edad, String dni) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni= dni;
	}
	
	public void mostrar() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("dni: "+dni);
	}
	
	public boolean esMayorDeEdad() {
		if (this.edad>=18) {
			return true;
		}
		return false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if ((dni.length()==9) && (Character.isLetter(dni.charAt(8)))){
		this.dni = dni;
		}
		else System.out.println("Error");
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + "]";
	}
	
	

}
