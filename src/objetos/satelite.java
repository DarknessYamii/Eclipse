package objetos;

public class satelite {
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;
	satelite(double m, double p, double d){
	meridiano=m;
	paralelo=p;
	distancia_tierra=d;
	}
	satelite(){
	meridiano=paralelo=distancia_tierra=0;
	}
	public void setPosicion(double m, double p, double d){
	meridiano=m;
	paralelo=p;
	distancia_tierra=d;
	}
	public void printPosicion(){
	System.out.println("El satélite se encuentra en el paralelo"+paralelo+" Meridiano "+meridiano+" a una distnaica de la tierra de"+distancia_tierra+ "Kilometros");
	}
}
	
