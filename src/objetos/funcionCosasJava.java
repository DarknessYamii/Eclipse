package objetos;

public class funcionCosasJava {

	public static void main(String[] args) {
		CosasJava cj = new CosasJava();

		cj.mostrarEdad(18);
		cj.mostrarNombre("Andres");
		cj.mostrarGenero('V');
		
		System.out.println(cj.obtenerEdad()+" "+cj.obtenerGenero()+" "+cj.obtenerNombre());
		
	}

}
