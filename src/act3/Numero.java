package act3;

public class Numero {

	private int valor;

	
	public Numero() {

		valor = 0;

	}

	public Numero(int inicial) {

		valor = inicial;

	}

	public void Suma(int suma) {

		valor += suma;

	}

	public void Resta(int resta) {	

		valor -= resta;

	}

	public int getValor() {

		return valor;

	}

	public void setNumero(int nuevoValor) {

		valor = nuevoValor;

	}

	public int getDoble() {

		return valor * 2;

	}

	public int getTriple() {

		return valor * 3;

	}
}
