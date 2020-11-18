package actividades_pseintjava;

import java.util.Scanner;

public class act10pseint {

	public static void main(String[] args) {
		int num, numazar, intentos = 0;
		numazar = (int) (Math.random() * 100);
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero del 1 al 100 para acertar un numero aleatorio");
		do {
		num = sc.nextInt();
		if (num > 0 && num < 100) {
			
				if (num > numazar) {
					System.out.println("El numero azar es mas pequeño");
					intentos++;
				} else if (num < numazar) {
					System.out.println("El numero azar es mas grande");
					intentos++;
				} else {
					System.out.println("Felicidades has acertado el numero en " + intentos);
				}
			} 
		}while (num!=numazar);
	}
}

