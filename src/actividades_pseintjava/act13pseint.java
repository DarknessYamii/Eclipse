package actividades_pseintjava;

import java.util.Scanner;

public class act13pseint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minuto,hora,dia,minutollegada,horallegada,diallegada,minfinal=0,horafinal=0,diafinal=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca dia,hora y minuto de salida (Dia/Hora/Min)");
		dia = sc.nextInt();
		hora = sc.nextInt();
		minuto = sc.nextInt();
		System.out.println("Introduzca dia,hora y min de llegada (Dia/Hora/Min)");
		diallegada = sc.nextInt();
		horallegada = sc.nextInt();
		minutollegada = sc.nextInt();
		dia= dia*24;
		hora=hora+dia*60;
		minuto=hora;
		diallegada= diallegada*24;
		horallegada=horallegada+diallegada*60;
		minutollegada=horallegada;
		if (minutollegada<minuto) {
			System.out.println("No puedes viajar atras en el tiempo");
		}
		else {
			minfinal=minutollegada-minuto;
			while (minfinal>=60) {
				horafinal=minfinal/60;
				minfinal=minfinal % 60;
			}
			while (horafinal>=24) {
				diafinal=minfinal/24;
				horafinal=minfinal % 24;
			}
			
		}
		System.out.println("Tardara en llegar "+Math.round(diafinal)+" dias "+Math.round(horafinal)+" horas y "+Math.round(minfinal)+" minutos");
	}

}
