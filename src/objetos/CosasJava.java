package objetos;

public class CosasJava {

	//Atributos
	
	private String nombre;
	private int edad;
	private char genero;
	
	//Constructores
	
	//Metodos
	
	public String obtenerNombre() {
		return nombre;
	}
	public void mostrarNombre(String n) {
		this.nombre = n;
	}
	public int obtenerEdad() {
		return edad;
	}
	public void mostrarEdad(int e) {
		this.edad = e;
	}
	public char obtenerGenero() {
		return genero;
	}
	public void mostrarGenero(char g) {
		this.genero = g;
	}
}
