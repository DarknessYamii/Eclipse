package actividades_pseintjava;

import java.util.Scanner;

public class act9pseint {

	public static void main(String[] args) {
		double num1,num2;
		int opcion;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Introduzca dos numeros");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicacion");
		System.out.println("4. Division");
		System.out.println("5. Salir ");
		 opcion = sc.nextInt();
		switch (opcion) {
		case 1: 
			double suma=num1+num2;
			System.out.println("La suma es "+suma);
			break;
		case 2:
			double resta=num1-num2;
			System.out.println("La resta es "+resta);
			break;
		case 3:
			double mult=num1*num2;
			System.out.println("La multiplicacion es "+mult);
			break;
		case 4: 
			double div=num1/num2;
			if (num2==0) {
			System.out.println("No se puede dividir entre 0");
			}
			else {
				System.out.println("La division es "+div);
			}
			break;
		case 5:
			break;
		default: 
			System.out.println("Opcion incorrecta");
			break;
		}
		} while(opcion!=5);
		System.out.println("Fin del programa");
	}

}
