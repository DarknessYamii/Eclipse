package actividades_pseintjava;

import java.util.Scanner;

public class act4pseint {

	public static void main(String[] args) {
		int cara;
		System.out.println("Introduzca la cara de un dado (1..6)");
		Scanner sc = new Scanner(System.in);
		cara = sc.nextInt();
		switch (cara){
		case 1:
			System.out.println("Cara 6");
			break;
		case 2:
			System.out.println("Cara 5");
			break;
		case 3:
			System.out.println("Cara 4");
			break;
		case 4:
			System.out.println("Cara 3");
			break;
		case 5:
			System.out.println("Cara 2");
			break;
		case 6:
			System.out.println("Cara 1");
			break;
		default: System.out.println("Numero de cara incorrecto");
		}
	}

}
