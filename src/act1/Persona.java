package act1;

public class Persona {
	
	//Atributos
		private String nombre;
		private String nif;
		private String apellidos;
		
	//Constructores 	
	
	//Metodos
		
		public String obtenerNombre() {
			return this.nombre;
		}
		public void modificarNombre(String n) {
			this.nombre = n;
		}
		public String obtenerNif() {
			return this.nif;
		}
		public void modificarNif(String nif) {
			this.nif = nif;
		}
		public String obtenerApellidos() {
			return this.apellidos;
		}
		public void modificarApellidos(String a) {
			this.apellidos = a;
		}
}
