package actividades_pseintjava;

import java.util.Scanner;

public class act11pseint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suma1=0,suma2=0,num1,num2,i,j;
		System.out.println("Introduzca dos numeros enteros");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		for (i = 1 ; i<num1;i++) {
			if (num1%i==0) 
				suma1=suma1+i;
			
		
		}
		for (j = 1 ; j<num2;j++) {
			if (num2%j==0) 
				suma2=suma2+j;
			
			
		}
		if (suma2==num1 && suma1==num2) {
			System.out.println("Son amigos");
		}
		else {
			System.out.println("No son amigos");
		}
	}

}
