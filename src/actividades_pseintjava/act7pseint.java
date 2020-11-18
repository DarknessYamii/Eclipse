package actividades_pseintjava;

import java.util.Scanner;

public class act7pseint {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int i=1,num,cont=0;
			System.out.println("Introduzca un numero (Mayor a 0)");
			do {
				num = sc.nextInt();
				if (num<=0) {
					System.out.println("Debe ser mayor a 0");
				}
			} while(num<=0);
				for (i = 1 ; i<=num;i++) {
					if (i%3 == 0){
						System.out.println(i);
						cont++;
					}
				}
				System.out.println("Hay un total de "+cont+" entre el 1 y el "+num);
			}
			
	}

