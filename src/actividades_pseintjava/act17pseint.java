package actividades_pseintjava;

import java.util.Scanner;

public class act17pseint {

	public static void main(String[] args) {
		int baliza,cantBaliza,numBaliza,contMayor=0,sumaMayor=0,contMenor=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero de baliza");
		baliza = sc.nextInt();
		System.out.println("Cantidad de numeros a comparar la baliza");
		cantBaliza = sc.nextInt();
		System.out.println("Escribe los numeros a comparar");
		for(int i=1;i<=cantBaliza;i++) {
			numBaliza= sc.nextInt();
			if (numBaliza>baliza) {
				contMayor++;
				sumaMayor=sumaMayor+numBaliza;
			}
			else {
				contMenor++;

			}
	
		}
		System.out.println("Hay "+contMayor+" numeros mayores a la baliza, "+contMenor+" numeros menores/iguales a la baliza y la suma mayor es "+sumaMayor);
	}

}
