package actividades_pseintjava;

import java.util.Scanner;

public class actRadio {
	public static void main(String[] args) {
		double radio;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca un radio");
		radio=sc.nextDouble();
		double superficie= Math.PI*Math.pow(radio, 2);
		double perimetro= 2*Math.PI*radio;
		System.out.println("La superficie es: "+superficie);
		System.out.println("El perimetro es: "+perimetro);

	}

}
	