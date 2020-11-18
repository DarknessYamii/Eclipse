package actividades_pseintjava;

import java.util.Scanner;

public class act1pseint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int media,prog,leng,bd,desarrollo,sist,fol;
		System.out.println("Maxima nota 10, minima 0");
		System.out.println("Introduzca la nota de programacion");
		prog = sc.nextInt();
		System.out.println("Introduzca la nota de lenguaje de marcas");
		leng = sc.nextInt();
		System.out.println("Introduzca la nota de base de datos");
		bd = sc.nextInt();
		System.out.println("Introduzca la nota de entornos de desarrollo");
		desarrollo = sc.nextInt();
		System.out.println("Introduzca la nota de sistemas");
		sist = sc.nextInt();
		System.out.println("Introduzca la nota de FOL");
		fol = sc.nextInt();
		if (prog>10 || prog<0 || leng>10 || leng<0 || bd>10 || bd<0 || desarrollo>10 || desarrollo<0 || sist>10 || sist<0 || fol>10 || fol<0){
			System.out.println("Las notas introducidas no son validas");
		}
		else {
			media = (prog+leng+bd+desarrollo+sist+fol)/6;
			System.out.println("Su media es: "+media);
			
		}
	}

}
