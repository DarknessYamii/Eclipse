	package act2;

public class Vehiculo {
	private String modelo;
	private double potencia;
	private boolean cRuedas;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public boolean iscRuedas() {
		if (cRuedas == false) {
			System.out.println("No tiene atraccion en las cuatro ruedas");
			return cRuedas;
		} else {
			System.out.println("Tiene atraccion en las cuatro ruedas");
			return cRuedas;
		}
		
	}
	public void setcRuedas(boolean cRuedas) {
		this.cRuedas = cRuedas;
	}
}
