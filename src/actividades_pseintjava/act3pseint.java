package actividades_pseintjava;

import java.util.Scanner;

public class act3pseint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j,num,cont_pri;
		 boolean esPrimo;
		 cont_pri=0;
		 System.out.print("Introduce numero: ");
		 num = sc.nextInt();
		 for(int i=1;i<=num;i++){
			 esPrimo=true;
			 j=2;
			 while (j<=i-1 && esPrimo==true)
			 {
		 if (i%j==0)
			 esPrimo=false;
			 j++;
			 }
		 if (esPrimo==true){
			 cont_pri++; // si es primo incrementamos el contador de primos
			 System.out.println(i+" es primo");
			 	}	
			 }
			 System.out.println("Entre el 1 y el " + num + ", hay "+ cont_pri + " números primos");
	}	
}
