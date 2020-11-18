package actividades_pseintjava;

import java.util.Scanner;

public class act5pseint {

	public static void main(String[] args) {
		double suma_pos=0,cont_pos=0,suma_neg=0, cont_neg=0, cont=0,med_pos=0,med_neg=0;
		int num;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i<=10; i++) {
			num = sc.nextInt();
			if (num>0) {
				cont_pos++;
				suma_pos=(suma_pos+num);
			}
			else if (num<0) {
				cont_neg++;
				suma_neg=(suma_neg+num);
			}
			else {
				cont++;
			}
		}
		if (cont_pos>0) {
			med_pos=(suma_pos/cont_pos);
			System.out.println("La media positiva es "+med_pos);	
		}
		if (cont_neg>0) {
			med_neg=(suma_neg/cont_neg);
			
			System.out.println("La media negativa es "+med_neg);
		}
			
		System.out.println("Hay un total de "+cont+" ceros");
	}

}
