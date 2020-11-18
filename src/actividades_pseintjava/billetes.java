package actividades_pseintjava;
import java.util.Scanner;
public class billetes {

	public static void main(String[] args) {
		int dinero,billete500,billete200,billete100,billete50,billete20,billete10,billete5,moneda2,moneda1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una cantidad de dinero a desglogar");
		dinero=sc.nextInt();
		moneda1=dinero;
		billete500=(moneda1-moneda1 % 500)/500;
		moneda1=moneda1%500;
		billete200=(moneda1-moneda1 % 200)/200;
		moneda1=moneda1%200;
		billete100=(moneda1-moneda1 % 100)/100;
		moneda1=moneda1%100;
		billete50=(moneda1-moneda1 % 50)/50;
		moneda1=moneda1%50;
		billete20=(moneda1-moneda1 % 20)/20;
		moneda1=moneda1%20;
		billete10=(moneda1-moneda1 % 10)/10;
		moneda1=moneda1%10;
		billete5=(moneda1-moneda1 % 5)/5;
		moneda1=moneda1%5;
		moneda2=(moneda1-moneda1 % 2)/2;
		moneda1=moneda1%2;
		System.out.println("Cantidad de billetes de 500$: "+billete500);
		System.out.println("Cantidad de billetes de 200$: "+billete200);
		System.out.println("Cantidad de billetes de 100$: "+billete100);
		System.out.println("Cantidad de billetes de 50$: "+billete50);
		System.out.println("Cantidad de billetes de 20$: "+billete20);
		System.out.println("Cantidad de billetes de 10$: "+billete10);
		System.out.println("Cantidad de billetes de 5$: "+billete5);
		System.out.println("Cantidad de monedas de 2$: "+moneda2);
		System.out.println("Cantidad de monedas de 1$: "+moneda1);
	}

}
