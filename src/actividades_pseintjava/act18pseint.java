package actividades_pseintjava;

import java.util.Scanner;

public class act18pseint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,contCentricos=0,sumaIzq=0,sumaDer,j,i;
		System.out.println("Introduzca un numero para saber los centricos que tiene");
		num = sc.nextInt();
		for(i=1;i<=num;i++) {
			sumaDer=0;
			sumaIzq+=(i-1);
			j=i+1;
			while (sumaDer<=sumaIzq) {
				sumaDer+=j;
				if(sumaIzq==sumaDer) {
					contCentricos++;
					System.out.println( i+" es un centrico numerico con listas de 1 hasta "+(i-1)+" y de "+(i+1)+" hasta "+j);
				}
				j++; 
				
			}
		}
	System.out.println("Habia un total de "+contCentricos+" numeros centricos");	
	}

}
