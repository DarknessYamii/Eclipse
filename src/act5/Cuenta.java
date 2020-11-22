package act5;

public class Cuenta {

	private long num_cuenta;
	private float DNI;	
	private float saldo,interes;
	
	public Cuenta() {
		
	}
	
	public Cuenta(float DNI, float saldo, float interes) {
		this.DNI = DNI;
		this.saldo = saldo;
		this.interes = interes;
	}

	public float getDNI() {
		return DNI;
	}

	public long getNum_cuenta() {
		return num_cuenta;
	}

	public void setDNI(float DNI) {
		this.DNI = DNI;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getInteres() {
		return interes;
	}

	public void setInteres(float interes) {
		this.interes = interes;
	}
	public float actualizarSaldo() {
		float nuevo_saldo;
		nuevo_saldo = saldo + (saldo+((interes/100)/365));
		return nuevo_saldo;
	}
	public double ingresarDinero(double ingresar) {
		double nuevo_saldo;
		nuevo_saldo = actualizarSaldo() + ingresar;
		return nuevo_saldo;
	}
	public double retirarDinero(double retirar) {
		double nuevo_saldo = 0 ;
        if (this.saldo >= retirar) {
            nuevo_saldo = actualizarSaldo() - retirar;
        } else {
            System.out.println("No hay saldo suficiente en su cuenta");
        }
        return nuevo_saldo;
    }

	
}
