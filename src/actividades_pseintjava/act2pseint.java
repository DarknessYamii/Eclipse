package actividades_pseintjava;

import java.util.Scanner;

public class act2pseint {
	
	public static void main(String[] args) {
	
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero de 4 cifras");
		number = sc.nextInt();
		String digitos = Integer.toString(number);
		System.out.println("El primer numero es "+digitos.substring(0,1));
		System.out.println("El segundo numero es "+digitos.substring(1,2));
		System.out.println("El tercer numero es "+digitos.substring(2,3));
		System.out.println("El cuarto numero es "+digitos.substring(3,4));
	}


}
