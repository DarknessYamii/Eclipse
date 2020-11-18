package actividades_pseintjava;

import java.util.Scanner;

public class act6pseint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inferior,mayor,num,cont=0,suma=0,cont_rep=0;
		do {
		System.out.println("Introduzca un limite inferior");
		inferior = sc.nextInt();
		System.out.println("Introduzca un limite mayor");
		mayor = sc.nextInt();
		} while (inferior>mayor);
		System.out.println("Introduzca valores");
		do {
			
			num = sc.nextInt();
			if (num<=mayor && num>=inferior) {
				suma=suma+num;
			}
			else{
				cont++;
			}
			if (num==mayor || num==inferior) {
				cont_rep++;
			}
		} while (num!=0);
		System.out.println("La suma positiva es "+suma+" ademas hay un total de "+(cont-1)+" de numeros fuera y se han repetido "+cont_rep+" numero");
	}

}
