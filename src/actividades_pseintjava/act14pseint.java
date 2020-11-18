package actividades_pseintjava;

import java.util.Scanner;

public class act14pseint {

	public static void main(String[] args) {
		int sueldo, sueldofijo=150,sueldoirpf,dias,ventas=0,km=0;
		sueldoirpf=(int) (sueldofijo*0.18);
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca cantidad de ventas y kms realizados y dias laborales");
		ventas = sc.nextInt();
		km = sc.nextInt();
		dias = sc.nextInt();
		sueldo=(int) ((150-sueldoirpf+(60*dias)+(1*km))*1.05*ventas);
		System.out.println("Ha ganado "+sueldo+"$");
	}

}
