package act2;

public class funcionVehiculo {

	public static void main(String[] args) {
		Vehiculo v = new Vehiculo();
		v.setModelo("BMW");
		v.setPotencia(155.5);
		v.setcRuedas(false);
		
		System.out.println("El modelo es: "+v.getModelo());
		System.out.println("La potencia es: "+v.getPotencia()+"CV");
		v.iscRuedas();
	}

}
