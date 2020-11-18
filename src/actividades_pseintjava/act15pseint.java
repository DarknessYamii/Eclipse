package actividades_pseintjava;

import java.util.Scanner;

public class act15pseint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mayor1=0,mayor2=0,num,opcion=0;
		System.out.println("Introduzca dos numeros enteros");
		mayor1 = sc.nextInt();
		do {
			System.out.println("Introduzca otro valor");
			num = sc.nextInt();
			if (num>mayor1){
				mayor2=mayor1;
				mayor1=num;
			}
			else if (num>mayor2) {
					mayor2=num;
					
				}
			System.out.println("Desea continuar? 1.Si, 2.No");		
			opcion=sc.nextInt();
		}while (opcion!=2);
	System.out.println("Los dos numeros mayores introducidos son "+mayor1+" y "+mayor2);
	}

}
