package testjavadoc;

import javax.swing.JOptionPane;

/**
 * Esta class sera nuestra encargada de realizar las funciones logicas para que nuestra aplicacion pueda
 * mostrar por la pantalla las sumas, restar, multiplicaciones de los valores introducidos
 * @author andre
 *
 */
public class Logica {

	
	/**
	 * Esta funcion sumar, se encargara de recoger los valores y sumarlos y luego mostrarlos por pantalla
	 * @param num1
	 * @param num2
	 */
	
	public void sumar() {
		int num1= 5; // Esta variable es entera
		int num2= 6;
		
		JOptionPane.showMessageDialog(null,(num1+num2));
	}
	
	/**
	 * Esta funcion restar, se encargara de recoger los valores y restarlos y luego mostrarlos por pantalla
	 * @param num1
	 * @param num2
	 */
	
	
	public void restar(int num1, int num2)
	{
		JOptionPane.showMessageDialog(null,(num1-num2));
	}
	
	/**
	 * Esta funcion multiplicar, se encargara de recoger los valores y multiplicarlo y luego mostrarlos por pantalla
	 * @param num1
	 * @param num2
	 * @return
	 */
	
	public int multiplicar(int num1, int num2)
	{
		return num1*num2;
	}
	
}