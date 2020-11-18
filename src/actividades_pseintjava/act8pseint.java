package actividades_pseintjava;

public class act8pseint {

	public static void main(String[] args) {
		int suma_par=0,suma_impar=0;
		for (int i = 1 ; i<=100; i++) {
			if (i%2==0) {
				suma_par=i+suma_par;
			}
			else {
				suma_impar=i+suma_impar;
			}
		}
		System.out.println("La suma par es "+suma_par+" y la impar es "+suma_impar);
	}

}
