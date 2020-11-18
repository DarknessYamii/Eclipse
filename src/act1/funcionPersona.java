package act1;

public class funcionPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona();
		p.modificarNombre("Andres");
		p.modificarNif("15456782T");
		p.modificarApellidos("Ruiz");
		System.out.println("Mi nombre es: "+p.obtenerNombre());
		System.out.println("Mi Apellido es: "+p.obtenerApellidos());
		System.out.println("Mi NIF es: "+p.obtenerNif());
		
		
	}

}
