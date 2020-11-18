package actividades_pseintjava;

import java.util.Scanner;

public class act12pseint {

	public static void main(String[] args) {
		int veces,azar,i;
		float cont1=0,cont2=0,cont3=0,cont4=0,cont5=0,cont6=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce cantidad de veces a lanzar el dado");
		veces = sc.nextInt();
		for (i = 0 ; i<veces ; i++) {
			azar = (int) (Math.random() * 6+1);
		System.out.println(azar);
			switch (azar) {
			case 1: cont1++;
			break;
			case 2: cont2++;
			break;
			case 3: cont3++;
			break;
			case 4: cont4++;
			break;
			case 5: cont5++;
			break;
			case 6: cont6++;
			break;
			}
		}
		cont1=(cont1/veces)*100;
		cont2=(cont2/veces)*100;
		cont3=(cont3/veces)*100;
		cont4=(cont4/veces)*100;
		cont5=(cont5/veces)*100;
		cont6=(cont6/veces)*100;
		System.out.println("Porcentaje del numero 1 "+cont1);
		System.out.println("Porcentaje del numero 2 "+cont2);
		System.out.println("Porcentaje del numero 3 "+cont3);
		System.out.println("Porcentaje del numero 4 "+cont4);
		System.out.println("Porcentaje del numero 5 "+cont5);
		System.out.println("Porcentaje del numero 6 "+cont6);
	}

}