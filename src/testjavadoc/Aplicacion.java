package testjavadoc;


import javax.swing.JOptionPane;

/**
 * Esta sera la funcion principal que ejecutara las funciones logicas de nuestra class "Logica"
 * @author andre
 * @version V1.0
 */

public class Aplicacion {

	public static void main(String[] args) {
			
		/**
		 * Creacion de la variable milogica, del tipo Logica 
		 */
		
			Logica milogica = new Logica();
			milogica.sumar(); //Funcion suma
			milogica.restar(5,3); //Funcion resta
			int mult= milogica.multiplicar(2, 4); //Funcion multiplicar
			JOptionPane.showMessageDialog(null, mult); //Mostrar por pantalla los resultados
				
				
				
		}

			
}


