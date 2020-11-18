package act4;

import java.util.Scanner;

public class Rectangulo {

	Scanner sc = new Scanner(System.in);
	private int x,y,x1,y1,x2,y2,x3,y3,x4,y4;
	private double base, altura;
	
	public void Punto1(int x1,int y1) {
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		this.x = x1;
		this.y = y1;
		
	}
	
	public void Punto2(int x2,int y2) {
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		this.x = x2;
		this.y = y2;	
	}
	public void Punto3(int x3,int y3) {
		x3 = sc.nextInt();
		y3 = sc.nextInt();
		this.x = x3;
		this.y = y3;	
	}
	
	public void Punto4(int x4,int y4) {
		x4 = sc.nextInt();
		y4 = sc.nextInt();
		this.x = x4;
		this.y = y4;	
	}
	public void analizarRectangulo() {

		if ((x1==x2 || x1==x3 || x1==x4 || x2==x3 || x2==x4 || x3==x4) && (y1==y2 || y1==y3 || y1==y4 || y2==y3 || y2==y4 || y3==y4)){
			System.out.println("Es un rectangulo");
			return;
		}else {
			System.out.println("No es un rectangulo");
			return;
		}
	}
	
}
