package actividades_pseintjava;

import java.util.Scanner;

public class act16pseint {

	public static void main(String[] args) {
		int opcion,cantidad,precio,contPrecio=0;
		Scanner sc= new Scanner(System.in);
		do {
		System.out.println("1. Tomate");
		System.out.println("2. Repollo 10$");
		System.out.println("3. Patata");
		System.out.println("4. Cebolla");
		opcion = sc.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("1. Pera 15$");
			System.out.println("2. Ensalada 20$");
			opcion = sc.nextInt();
				if (opcion==1) {
					System.out.println("Cantidad de semillas");
					cantidad = sc.nextInt();
					precio = cantidad*15;
					contPrecio= precio+contPrecio;
				}
				else {
					System.out.println("Cantidad de semillas");
					cantidad = sc.nextInt();
					precio = cantidad*20;
					contPrecio= precio+contPrecio;
				}
				break;
		case 2:
			
					System.out.println("Cantidad de semillas");
					cantidad = sc.nextInt();
					precio = cantidad*10;
					contPrecio= precio+contPrecio;
				break;
		case 3:
			System.out.println("1. Criolla 8$");
			System.out.println("2. Pastusa 9$");
			System.out.println("3. Salentuna 11$");
			opcion = sc.nextInt();
				if (opcion==1) {
					System.out.println("Cantidad de semillas");
					cantidad = sc.nextInt();
					precio = cantidad*8;
					contPrecio= precio+contPrecio;
				}
				else if (opcion==2) {
					System.out.println("Cantidad de semillas");
					cantidad = sc.nextInt();
					precio = cantidad*9;
					contPrecio= precio+contPrecio;
				}
				else {
					System.out.println("Cantidad de semillas");
					cantidad = sc.nextInt();
					precio = cantidad*11;
					contPrecio= precio+contPrecio;
				}
				break;
		case 4:
			System.out.println("1. Larga 15$");
			System.out.println("2. Vieja 13$");
			opcion = sc.nextInt();
				if (opcion==1) {
					System.out.println("Cantidad de semillas");
					cantidad = sc.nextInt();
					precio = cantidad*15;
					contPrecio= precio+contPrecio;
				}
				else {
					System.out.println("Cantidad de semillas");
					cantidad = sc.nextInt();
					precio = cantidad*13;
					contPrecio= precio+contPrecio;
				}
				break;
			default: 
				System.out.println("Valor introducido erroneo");
			}
		System.out.println("Desea continuar? 1.Si 2.No");
		opcion = sc.nextInt();
		}while(opcion!=2);
		System.out.println("El precio a pagar es de "+contPrecio);
	}
}
