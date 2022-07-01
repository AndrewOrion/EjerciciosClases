package Clases;

public class Pelicula {
	private String nombre;
	private String director;
	private String genero;
	private double duracion;
	private int year;
	private double calificacion;
	
	public Pelicula () {
		
	}
	public Pelicula(String nombre, String director, 
			String genero, double duracion, int year, double calificacion) {
		super();
		this.nombre = nombre;
		this.director = director;
		this.genero = genero;
		this.duracion = duracion;
		this.year = year;
		this.calificacion = calificacion;
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	private void setDirector(String director) {
		this.director = director;
	}

	public String getGenero() {
		return genero;
	}

	private void setGenero(String genero) {
		this.genero = genero;
	}

	public double getDuracion() {
		return duracion;
	}

	private void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public int getYear() {
		return year;
	}

	private void setYear(int year) {
		this.year = year;
	}

	public double getCalificacion() {
		return calificacion;
	}

	private void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public void imprimir() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Director: "+director);
		System.out.println("Género: "+genero);
		System.out.println("Duración: "+duracion);
		System.out.println("Año: "+this.year);
		System.out.println("Calificación: "+calificacion);
	}
	
	public boolean esPeliculaEpica() {
		return (this.duracion>=3);
	}
	
	public String calcularValoracion() {
		if (this.calificacion>=0 && this.calificacion<=2)
			return "Muy Mala";
		else if (this.calificacion>2 && this.calificacion<=5)
			return "Mala";
		else if (this.calificacion>5 && this.calificacion<=7)
			return "Regular";
		else if (this.calificacion>7 && this.calificacion<=8)
			return "Buena";
		else if (this.calificacion>8 && this.calificacion<=10)
			return "Excelente";
		else return "Error";		
	}
	
	public boolean esSimilar(Pelicula p) {
		return (this.genero==p.genero && this.calificacion==p.calificacion);
	}
}